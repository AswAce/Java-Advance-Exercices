import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readRowsAndcolumns(scanner,"\\s+");
        int rows = dimensions[0];
        int column = dimensions[1];
        int[][] ma3xOne = readMa3x(scanner, rows, column);

        dimensions = readRowsAndcolumns(scanner,"\\s+");
        rows = dimensions[0];
        column = dimensions[1];
        int[][] ma3xTwo = readMa3x(scanner, rows, column);

         boolean flag =compareMa3x(ma3xOne,ma3xTwo);
         if (flag){
             System.out.println("equal");
         }
         else {
             System.out.println("not equal");
         }

    }

    private static boolean compareMa3x(int[][] ma3xOne, int[][] ma3xTwo) {
        if (ma3xOne.length!=ma3xTwo.length){
            return false;
        }
        for (int colum = 0; colum <ma3xOne.length ; colum++) {
            for (int row = 0; row <ma3xOne[colum].length ; row++) {
                if (ma3xOne[colum].length!=ma3xTwo[colum].length){
                    return false;
                }
                int numberFirst=ma3xOne[colum][row];
                int numberSecond=ma3xTwo[colum][row];
                if (numberFirst!=numberSecond){
                    return false;
                }
            }
        }

        return true;
    }

    private static int[] readRowsAndcolumns(Scanner scanner, String reggex) {
        return Arrays.stream(scanner.nextLine().split(reggex)).mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] readMa3x(Scanner scanner, int rows, int column) {
        int[][] ma3xOne = new int[rows][column];
        for (int row = 0; row < rows; row++) {
            int[] line = readRowsAndcolumns(scanner,"\\s+");
            for (int col = 0; col < column; col++) {
                ma3xOne[row][col] = line[col];

            }
        }
        return ma3xOne;
    }
}
