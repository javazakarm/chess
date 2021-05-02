import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        ChessService chessService = new ChessService();
        ChessBoard chessBoard = new ChessBoard();
        Scanner scanner = new Scanner(System.in);
        String[] allFigures = {"1:Pawn", "2:Rook", "3:Knight", "4:Bishop", "5:Queen", "6:King"};
        int figures;
        char column;
        int row;
        for (String name : allFigures) System.out.println(name + " ");
        do {
            System.out.print("Enter figure from lists: ");
            figures = scanner.nextInt();
        } while (figures < 1 || figures > 6);
        scanner.nextLine();
        do {
            System.out.print("Enter figure location column from a to h: ");
            column = scanner.next().charAt(0);
        } while (column < 'a' || column > 'h');
        int a = chessService.columnCase(column);
        do {
            System.out.print("Enter figure location row from 1 to 8: ");
            row = scanner.nextInt();
        } while (row < 1 || row > 8);
        int b = chessService.rowCase(row);
        chessBoard.board(figures, a, b);

    }
}