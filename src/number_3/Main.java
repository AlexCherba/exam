package number_3;

import java.util.HashSet;

/*
3.Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
*/
public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,5,1,1,3,2,43,7,2};
        HashSet<Integer> arraySet = new HashSet<>();

        for (int i : array) {
            arraySet.add(i);
        }
        System.out.println(arraySet.size());
    }
}
