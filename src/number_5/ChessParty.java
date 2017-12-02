package number_5;

import java.util.Scanner;

public class ChessParty {

    public void play() {
        ChessBoard board = new ChessBoard();
        ChessHorse horse = new ChessHorse();
        board.print(horse);

        Scanner scanner = new Scanner(System.in);

        String coords = "";
        boolean mistake = true;
        while (mistake) {
            System.out.print("Введите координаты лошади(например B1):");
            coords = scanner.next();
            mistake = !ChessBoard.isValidCoords(coords);
        }
        horse.setCoords(coords);
        board.print(horse);

        while (true) {
            System.out.print("(выход X) ");
            horse.setNextStep(coords);
            coords = scanner.next();
            switch (coords) {
                case "X":
                    return;
                default:
                    horse.setCoords(coords);
                    board.print(horse);
                    break;
            }
        }
    }
}
