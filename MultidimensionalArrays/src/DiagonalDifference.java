import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] ma3x = getMa3x(size, scanner);
        int sumDIagonals = getSum(ma3x);
        System.out.println(sumDIagonals);

    }

    private static int getSum(int[][] ma3x) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ma3x.length; i++) {
            sum1 += ma3x[i][i];
        }
        int k = ma3x.length - 1;
        for (int i = 0; i < ma3x.length; i++) {
            sum2 += ma3x[i][k];
            k--;
        }
        return Math.abs(sum1 - sum2);
    }

    private static int[][] getMa3x(int size, Scanner scanner) {
        int[][] m = new int[size][size];
        for (int r = 0; r < size; r++) {
            int[] l = Arrays.
                    stream(scanner.nextLine().
                            split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < size; i++) {
                m[r][i] = l[i];
            }
        }
        return m;
    }
}
