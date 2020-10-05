import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowCol = Arrays.
                stream(scanner.nextLine().split(", ")).
                mapToInt(Integer::parseInt).
                toArray();
        int[][] ma3x = getMa3xResults(rowCol, scanner);
        print2x2Ma3x(ma3x);

    }

    private static void print2x2Ma3x(int[][] ma3x) {
        int rows = ma3x.length;
        int bestSUme = Integer.MIN_VALUE;
     String numbers="";

        for (int row = 0; row < rows - 1; row++) {
            int columns = ma3x[row].length;
            for (int column = 0; column < columns - 1; column++) {
                int sum = ma3x[row][column] + ma3x[row][column + 1] + ma3x[row + 1][column] + ma3x[row + 1][column + 1];
                if (bestSUme<=sum){
                    bestSUme=sum;
                   numbers= ma3x[row][column] +" "+
                           ma3x[row][column + 1] +"\n"+ ma3x[row + 1][column]+" " + ma3x[row + 1][column + 1];
                }
            }
        }
        System.out.println(numbers);
        System.out.println(bestSUme);


    }


    private static int[][] getMa3xResults(int[] rowCol, Scanner scanner) {
        int[][] ma3x = new int[rowCol[0]][rowCol[1]];
        for (int row = 0; row < rowCol[0]; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < line.length; col++) {
                ma3x[row][col] = line[col];
            }
        }
        return ma3x;
    }
}
