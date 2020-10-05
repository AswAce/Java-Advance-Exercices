import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int columns = Integer.parseInt(size[1]);

        String[][] ma3x = getMa3x(rows, columns, scanner);
        printMa3x(ma3x);


    }

    private static void printMa3x(String[][] ma3x) {
        for (String[] x : ma3x) {
            for (String s : x) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static String[][] getMa3x(int rows, int columns, Scanner scanner) {
        String[][] ma3x = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                ma3x[row][column] = getCell(row, column);
            }
        }
        return ma3x;
    }

    private static String getCell(int row, int column) {
        return getChar(row) + getChar(row + column) + getChar(row);
    }

    private static String getChar(int n) {
        String charToAdd = "";
        switch (n) {
            case 0:
                charToAdd = "a";
                break;
            case 1:
                charToAdd = "b";
                break;
            case 2:
                charToAdd = "c";
                break;
            case 3:
                charToAdd = "d";
                break;
            case 4:
                charToAdd = "e";
                break;
            case 5:
                charToAdd = "f";
                break;
            case 6:
                charToAdd = "g";
                break;
            case 7:
                charToAdd = "h";
                break;
            case 8:
                charToAdd = "i";
                break;
            case 9:
                charToAdd = "j";
                break;
            case 10:
                charToAdd = "k";
                break;
            case 11:
                charToAdd = "l";
                break;
            case 12:
                charToAdd = "m";
                break;
            case 13:
                charToAdd = "n";
                break;
            case 14:
                charToAdd = "o";
                break;
            case 15:
                charToAdd = "p";
                break;
            case 16:
                charToAdd = "q";
                break;
            case 17:
                charToAdd = "r";
                break;
            case 18:
                charToAdd = "s";
                break;
            case 19:
                charToAdd = "t";
                break;
            case 20:
                charToAdd = "u";
                break;
            case 21:
                charToAdd = "v";
                break;
            case 22:
                charToAdd = "w";
                break;
            case 23:
                charToAdd = "x";
                break;
            case 24:
                charToAdd = "y";
                break;
            case 25:
                charToAdd = "z";
                break;

        }
        return charToAdd;
    }
}
