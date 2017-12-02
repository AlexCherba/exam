package number_5;

import java.util.Scanner;

/*
Ход коня по шахматной доске
Вводиться текущее положение коня и клетка в которую пробуют его передвинуть
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Ход конем!");
        ChessParty party = new ChessParty();
        party.play();
    }
}
