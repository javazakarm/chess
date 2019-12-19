public class ChessBoard {
    String[][] board = new String[8][8];
    private int sumOfColumnAndRow;
    private int differenceOfColumnAndRow;
//    public void board(int figures, int column, int row){
//      switch (figures){
//            case 1:
//                pawn(row, column);
//                break;
//            case 2:
//                rook(row, column);
//                break;
//            case 3:
//                knight(row, column);
//                break;
//            case 4:
//                bishop(row, column);
//                break;
//            case 5:
//                queen(column, row);
//                break;
//            case 6:
//                king(row, column);
//                break;
//        }
//    }
    public void pawn(int column,int row){
        board[row][column] = "P";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column){
                    System.out.print(board[row][column] + "   ");
                }else if ((i == row - 1) && (j == column - 1 || j == column + 1)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                }
                else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
    public void rook(int column,int row){
        board[row][column] = "R";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column){
                    System.out.print(board[row][column] + "   ");
                }else if (i == row || j == column) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
    public void knight(int column,int row){
        board[row][column] = "H";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column){
                    System.out.print(board[row][column] + "   ");
                }else if ((i == row - 2 || i == row + 2) && (j ==column - 1 || j == column + 1)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                }else if ((i ==row - 1 || i == row + 1 ) && (j == column - 2 ||  j == column + 2)){
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                }
                else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
    public void bishop(int column,int row){
        sumOfColumnAndRow = row + column;
        differenceOfColumnAndRow = column - row;
        board[row][column] = "B";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column) {
                    System.out.print(board[row][column] + "   ");
                }else if (i + j == sumOfColumnAndRow || ((j - i) == differenceOfColumnAndRow)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
    public void queen(int column, int row) {
        sumOfColumnAndRow = row + column;
        differenceOfColumnAndRow = column - row;
        board[row][column] = "Q";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column)
                    System.out.print(board[row][column] + "   ");
                else if (i + j == sumOfColumnAndRow || ((j - i) == differenceOfColumnAndRow) || (i == row) || (j == column)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
    public void king(int column,int row){
        board[row][column] = "K";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == row && j == column) {
                    System.out.print(board[row][column] + "   ");
                }
                else if ((i > row - 2 && i < row + 2) && (j > column - 2 && j < column + 2)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else{
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
}