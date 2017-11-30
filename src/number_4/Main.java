package number_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String file = "D:\\Workspace\\Java\\IDEA\\exam\\src\\number_4\\password.txt";
        //String file = "password.txt";
        FileUtils.read(file);
        //System.out.println(FileUtils.getArrayPassword());

        //TreeMap<String, Integer> passMap = new TreeMap<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String s : FileUtils.getArrayPassword()) {
            if (map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
