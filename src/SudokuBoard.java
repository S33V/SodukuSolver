public class SudokuBoard {
    int[][]board;
     public SudokuBoard() {
         board = new int[9][9];
     }

     public void editSquare(int row, int col, int value) {
         board[row][col] = value;
             System.out.println(this);
     }

     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("-----------------------\n||");
         for (int i = 0; i < board.length; i++) {
             for(int j = 0; j < board[i].length; ++j){
                 sb.append(board[i][j]).append("|");
                 if((j + 1) % 3 == 0 )
                     sb.append("|");
             }
             sb.append("\n-----------------------\n||");
         }
         sb.setLength(sb.length() - 2);


         return sb.toString();
     }
}
