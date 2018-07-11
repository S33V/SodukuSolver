import java.util.Random;

public class BoardCreater {
    public static void createBoard(SudokuBoard board) {
        int[][] rows = randomRowCreator();
//        int[][] rows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int row = 0; row < 3; row++) { // Row
            for (int blockRow = 0; blockRow < 3; blockRow++) { // blockRow
                for (int trio = 0; trio < 3; trio++) { // Trio
                    for (int boardElement = 0; boardElement < 3; boardElement++) { // Individual square
                        board.editSquare(trio * 3 + boardElement,
                                blockRow * 3 + row,
                                rows[(trio + row * 5) % 3][(boardElement + blockRow * 5) % 3]);
                    }
                }
            }
        }
    }

    private static int[][] randomRowCreator() {
        int[][] rows = new int[3][3];
        boolean[] checker = new boolean[10];
        Random ran = new Random();

//        Fill the rows array with 9 unique digits ranging from 1 - 9
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                int randomNum = ran.nextInt(9) + 1;
                while (checker[randomNum - 1])
                    randomNum = ran.nextInt(9) + 1;
                rows[i][j] = randomNum;
                checker[randomNum - 1] = true;
            }
        }
        return rows;

    }


}
