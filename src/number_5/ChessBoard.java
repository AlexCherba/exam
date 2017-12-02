package number_5;

import java.util.HashMap;

public class ChessBoard {
    private static int size;

    public static final HashMap<Character, Integer> axisX = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('B', 1);
        put('C', 2);
        put('D', 3);
        put('E', 4);
        put('F', 5);
        put('G', 6);
        put('H', 7);
    }};

    public static final HashMap<Character, Integer> axisY = new HashMap<Character, Integer>() {{
        put('8', 7);
        put('7', 6);
        put('6', 5);
        put('5', 4);
        put('4', 3);
        put('3', 2);
        put('2', 1);
        put('1', 0);
    }};

    public static boolean isValidCoords(String coords) {
        if (axisX.containsKey(coords.toUpperCase().charAt(0)))
            if (axisY.containsKey(coords.charAt(1)))
                return true;
        return false;
    }

    public ChessBoard() {
        this(8);
    }

    public ChessBoard(int size) {
        this.size = size;
    }

    public static int getSize() {
        return size;
    }

    public static String coordsToString(int coordX, int coordY) {
        String coords = "";
        for (Character s : axisX.keySet()) {
            if (axisX.get(s) == coordX) coords += s;
        }
        for (Character s : axisY.keySet()) {
            if (axisY.get(s) == coordY) coords += s;
        }
        return coords;
    }

    private void printHorizonLine() {
        for (int i = 0; i < size * 2 + 3; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private void printHeadLine() {
        System.out.print(" |");
        int num = 1;
        for (Character i : axisX.keySet()) {
            System.out.print(i + "|");
            num++;
            if (num > size) break;
        }
        System.out.println();
    }

    public void print(ChessHorse horse) {
        printHeadLine();
        printHorizonLine();

        int num = 1;
        for (Character i : axisY.keySet()) {
            int currentY = axisY.get(i);
            System.out.print(i + "|");
            for (int ii = 0; ii < size; ii++) {
                int currentX = ii;
                //System.out.print(" |");
                System.out.print(
                        (horse.getCoordX() == currentX) &&
                                (horse.getCoordY() == currentY) ? "&|" : " |");
            }
            System.out.println(i);
            printHorizonLine();
            num++;
            if (num > size) break;
        }
        printHeadLine();
    }
}
