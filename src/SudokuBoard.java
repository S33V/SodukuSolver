public class SudokuBoard {
    int[][]board;
     public SudokuBoard() {
         board = new int[9][9];
     }

     public void editSquare(int col, int row, int value) {
         board[row][col] = value;
     }

     public String toString() {
         StringBuffer sb = new StringBuffer();
         sb.append("--------------------\n");
         for (int i = 0; i < board.length; i++) {
             for(int j = 0; j < board[i].length; ++j){
                 sb.append("|").append(board[i][j]).append("|");
             }
             sb.append("--------------------\n");
         }
         return sb.toString();
     }
}
