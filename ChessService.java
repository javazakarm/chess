public class ChessService {
    public int rowCase(int row) {
        switch (row) {
            case 1:
                row = 7;
                break;
            case 2:
                row = 6;
                break;
            case 3:
                row = 5;
                break;
            case 4:
                row = 4;
                break;
            case 5:
                row = 3;
                break;
            case 6:
                row = 2;
                break;
            case 7:
                row = 1;
                break;
            case 8:
                row = 0;
                break;
        }
        return row;
    }

    public int columnCase(char column) {
        int columnInt = 0;
        switch (column) {
            case 'a':
                columnInt = 1;
                break;
            case 'b':
                columnInt = 2;
                break;
            case 'c':
                columnInt = 3;
                break;
            case 'd':
                columnInt = 4;
                break;
            case 'e':
                columnInt = 5;
                break;
            case 'f':
                columnInt = 6;
                break;
            case 'g':
                columnInt = 7;
                break;
            case 'h':
                columnInt = 8;
                break;
        }
        return columnInt;
    }
}