import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] rowCol = Arrays.
                stream(scanner.nextLine().
                        split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
        int[][] ma3x = getMa3x(rowCol[0], rowCol[1], scanner);
        int n = Integer.parseInt(scanner.nextLine());
        boolean contain = contains(ma3x, n);
        if (!contain){
            System.out.println("not found");
        }
    }

    private static boolean contains(int[][] ma3x, int n) {
        int rows = ma3x.length;
boolean flag=false;
        for (int row = 0; row < rows; row++) {
            int columns = ma3x[row].length;
            for (int col = 0; col < columns; col++) {
                if (ma3x[row][col] == n) {
                    System.out.println(row + " " + col);
                   flag=true;
                }
            }
        }
        return flag;
    }

    private static int[][] getMa3x(int rows, int columns, Scanner scanner) {
        int[][] newMa3x = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.
                    stream(scanner.nextLine().
                            split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < columns; col++) {
                newMa3x[row][col] = line[col];
            }
        }
        return newMa3x;
    }
}
