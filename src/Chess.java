import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
        ChessService chessService = new ChessService();
        ChessBoard chessBoard = new ChessBoard();
        Scanner scanner = new Scanner(System.in);
        String [] allFigures ={"1:Pawn","2:Rook","3:Knight","4:Bishop","5:Queen","6:King"};
        for (String name : allFigures) System.out.println(name + " ");
        //System.out.print("Enter figure from lists: ");
        //int figures = scanner.nextInt();
        //scanner.nextLine();
        System.out.print("Enter figure location column please: ");
        String column = scanner.nextLine();
        int a = chessService.columnCase(column);
        System.out.print("Enter figure location row please: ");
        int row = scanner.nextInt();
        int b = chessService.rowCase(row);
        chessBoard.queen(a,b);
        System.out.println("-------------------------------------------------------");
        chessBoard.bishop(a,b);
        System.out.println("-------------------------------------------------------");
        chessBoard.rook(a,b);
        System.out.println("-------------------------------------------------------");
        chessBoard.king(a,b);
        System.out.println("-------------------------------------------------------");
        chessBoard.pawn(a,b);
        System.out.println("-------------------------------------------------------");
        chessBoard.knight(a,b);
//        String s = "anna";
//        String result = s.replace('a','A');
//        System.out.println(result);
//        System.out.println(s);
//        ArrayList list = new ArrayList();
//        list.toString();
//        List<String> birds = new ArrayList<>();
//        birds.add("hawk"); // [hawk]
//        System.out.println(birds.contains("hawk")); // true
//        System.out.println(birds.contains("haw"));
        //int bad1 = Integer.parseInt("a"); // throws NumberFormatException
//        int bad2 = Integer.valueOf("12345");
//        System.out.println(bad2);
//        list.toArray();
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        Month.of(11);
    }
}