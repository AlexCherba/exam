package number_4;
/*
4.Дан файл  с логинами и паролями. Найдите топ10 самых популярных паролей.
*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String file = "D:\\Workspace\\Java\\IDEA\\exam\\src\\number_4\\password.txt";
        int topPass = 10;

        Utils.read(file);

        for (String s : Utils.getArrayPassword()) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Utils.printPasswords(Utils.sortFrequentPasswordList(map, topPass));
    }
}
