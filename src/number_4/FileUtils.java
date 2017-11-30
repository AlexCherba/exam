package number_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FileUtils {
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
}
