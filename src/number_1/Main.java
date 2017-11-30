package number_1;

import java.util.Scanner;

/*
1.Задача на взаимодействие между классами.
Разработать систему «Вступительные экзамены».
Абитуриент регистрируется на Факультет, сдает Экзамены.
Преподаватель выставляет Оценку.
Система подсчитывает средний бал и определяет Абитуриента,
зачисленного в учебное заведение.

*/
public class Main {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int sumRating = 0;


        Teacher teacher01 = new Teacher("Dony", "Kloud", "Java");
        Teacher teacher02 = new Teacher("Katy", "Parry", "C++");
        Teacher teacher03 = new Teacher("Vasja", "Petya", "Cobol");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваше имя, студент? ");
        firstName = scanner.next();
        System.out.print("Ваша фамилия, студент? ");
        lastName = scanner.next();
        Student student = new Student(firstName, lastName);


        sumRating += getRating(teacher01);
        sumRating += getRating(teacher02);
        sumRating += getRating(teacher03);

        System.out.println("Итого: " + sumRating);

        System.out.println(sumRating > 24 ? "\nВы поступили" : "\nГоу в армейку, ЛУЗЕР!");

    }

    public static int getRating(Teacher teacher) {
        int rating;
        System.out.println("Вы сдаете " + teacher.getSubject() + " у " + teacher.getFirstName() + " " + teacher.getLastName());
        rating = (int) (Math.random() * 12) + 1;
        System.out.println("и он вам поставил " + rating + " баллов");
        return rating;
    }
}
