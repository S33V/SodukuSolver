import java.util.Random;

public class BoardCreater {
    public static void createBoard(SudokuBoard board) {
        int[][] rows = new int[3][3];
        boolean[] checker = new boolean[10];
        Random ran = new Random();

//        Fill the rows array with 9 unique digits ranging from 1 - 9
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                int randomNum = ran.nextInt(10) + 1;
                while(checker[randomNum - 1])
                    randomNum = ran.nextInt(10);
                rows[i][j] = randomNum;
                checker[randomNum - 1] = true;
            }
        }

        for (int i = 0; i < 3; i++) { // Block row
            for (int j = 0; j < 3; j++) { // Row
                for (int k = 0; k < 3; k++) { // Trio
                    for (int l = 0; l < 3; l++) { // Individual square
                        board.editSquare(k * l, j * i, (l + i * 5) % 3);
                    }
                }
            }
        }
    }
}
