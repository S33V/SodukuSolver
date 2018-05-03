public class Demo {
    public static void main(String[] args) {
        SudokuBoard gameboard = new SudokuBoard();
        BoardCreater.createBoard(gameboard);
        System.out.println(gameboard);
    }
}
