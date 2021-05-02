public class ChessBoard {
    private String[][] board = new String[9][9];
    private int sumOfColumnAndRow;
    private int differenceOfColumnAndRow;

    public void board(int figures, int column, int row) {
        switch (figures) {
            case 1:
                pawn(column, row);
                break;
            case 2:
                rook(column, row);
                break;
            case 3:
                knight(column, row);
                break;
            case 4:
                bishop(column, row);
                break;
            case 5:
                queen(column, row);
                break;
            case 6:
                king(column, row);
                break;

        }
    }

    public void pawn(int column, int row) {
        char name = 'P';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(name + "   ");
                } else if ((i == row - 1) && (j == column - 1 || j == column + 1)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }

    public void rook(int column, int row) {
        char name = 'R';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(name + "   ");
                } else if (i == row || j == column) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }

    public void knight(int column, int row) {
        char name = 'H';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(name + "   ");
                } else if ((i == row - 2 || i == row + 2) && (j == column - 1 || j == column + 1)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else if ((i == row - 1 || i == row + 1) && (j == column - 2 || j == column + 2)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }

    public void bishop(int column, int row) {
        sumOfColumnAndRow = row + column;
        differenceOfColumnAndRow = column - row;
        char name = 'B';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(name + "   ");
                } else if (i + j == sumOfColumnAndRow || ((j - i) == differenceOfColumnAndRow)) {
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
        char name = 'Q';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(/*board[row][column]*/ name + "   ");
                } else if (i + j == sumOfColumnAndRow || ((j - i) == differenceOfColumnAndRow) || (i == row) || (j == column)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }

    public void king(int column, int row) {
        char name = 'K';
        board[8][0] = "  ";
        char t = 'a';
        int k = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 8 && j == 0) {
                    System.out.print(board[8][0] + "  ");
                } else if (i == 8) {
                    board[row][column] = String.valueOf(t);
                    t++;
                    System.out.print(board[row][column] + "   ");
                } else if (j == 0) {
                    board[row][column] = String.valueOf(k);
                    k--;
                    System.out.print(board[row][column] + "   ");
                } else if (i == row && j == column) {
                    System.out.print(name + "   ");
                } else if ((i > row - 2 && i < row + 2) && (j > column - 2 && j < column + 2)) {
                    board[i][j] = "A";
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("." + "   ");
                }
            }
            System.out.println();
        }
    }
}