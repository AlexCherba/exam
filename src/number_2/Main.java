package number_2;

import java.util.Scanner;

/*
2.Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать. После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число. В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
*/
public class Main {
    public static void main(String[] args) {
        int computerNumber;
        int customAttempts;
        int userNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Компьютер загадывает чмсло от 1 до:");
        computerNumber = Utils.createNumber(scanner.nextInt());
        System.out.print("Введите количество доступных попыток:");
        customAttempts = scanner.nextInt();

        for (int i = 0; i < customAttempts; i++) {
            System.out.println("Введите число:");
            userNumber = scanner.nextInt();
            if (userNumber == computerNumber){
                System.out.print("Вы угадали");
                return;
            }
        }
        System.out.println("Попытки закончились");
    }
 }
