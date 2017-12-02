package number_5;

public class ChessHorse {
    private final static String name = "Лошадь";
    private int coordX = -1;
    private int coordY = -1;

    private static int[][] variant = {
            {-2, -1},
            {-2, 1},
            {-1, 2},
            {1, 2},
            {2, -1},
            {2, 1},
            {-1, -2},
            {1, -2}
    };

    public int getCoordX() {
        return coordX;
    }

    private int[] splitCoord(String coords) {
        int coordX = ChessBoard.axisX.get(coords.toUpperCase().charAt(0));
        int coordY = ChessBoard.axisY.get(coords.charAt(1));
        int[] array = {coordX, coordY};
        return array;
    }

    public void setCoords(String coords) {
        this.coordX = splitCoord(coords)[0];
        this.coordY = splitCoord(coords)[1];
    }

    public int getCoordY() {
        return coordY;
    }

    public void setNextStep(String coords) {
        int coordX = splitCoord(coords)[0];
        int coordY = splitCoord(coords)[1];
        int sizeBoard = ChessBoard.getSize();

        System.out.println("Доступны вариианты:");
        for (int i = 0; i < variant.length; i++) {
            int checkCoordX = coordX + variant[i][0];
            int checkCoordY = coordY + variant[i][1];
            if (checkCoordX < sizeBoard && checkCoordX >= 0) {
                if (checkCoordY < sizeBoard && checkCoordY >= 0) {
                    System.out.println(ChessBoard.coordsToString(checkCoordX, checkCoordY));
                }
            }
        }
    }
}
