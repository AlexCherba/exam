package number_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public abstract class Utils {
    private static ArrayList<String> arrayPassword = new ArrayList<>();

    public static ArrayList<String> getArrayPassword() {
        return arrayPassword;
    }

    public static void read(String fileName) {
        String cvsSplitBy = ":::";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] array;

            while ((line = br.readLine()) != null) {
                array = line.split(cvsSplitBy);
                arrayPassword.add(array[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<String> sortFrequentPasswordList(HashMap<String, Integer> map, int topPass) {
        LinkedList<String> array = new LinkedList<>();
        if (topPass > map.size()) topPass = map.size();

        for (int i = 0; i < topPass; i++) {
            for (String s1 : map.keySet()) {
                String biggerPassword = s1;
                for (String s2 : map.keySet()) {
                    if (map.get(biggerPassword) < map.get(s2)) biggerPassword = s2;
                }
                array.add(biggerPassword);
                map.remove(biggerPassword);
                break;
            }
        }
        return array;
    }

    public static void printPasswords(LinkedList<String> listPassword) {
        int i = 1;
        for (String s : listPassword) {
            System.out.println(i++ + ". " + s);
        }
    }
}
