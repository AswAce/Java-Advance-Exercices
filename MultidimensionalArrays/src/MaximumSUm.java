import java.util.Arrays;
import java.util.Scanner;

public class MaximumSUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] ma3x = getMa3x(size[0], size[1], scanner);
        int sizes = 3;
        getBiggestSUm(ma3x, sizes);
    }

    private static void getBiggestSUm(int[][] ma3x, int size) {
        int sum = Integer.MIN_VALUE;
        String resultMa3x = "";
        for (int row = 0; row < ma3x.length - (size - 1); row++) {
            for (int column = 0; column < ma3x[row].length - (size - 1); column++) {
                int currentSUm = 0;
                int[][] tempMa3x = new int[size][size];
                for (int i = 0; i < size; i++) {
                    int[] newLine = ma3x[row + i];
                    for (int j = 0; j < size; j++) {
                        currentSUm += newLine[column + j];
                        tempMa3x[i][j] = newLine[column + j];
                    }

                    if (currentSUm >= sum) {
                        sum = currentSUm;
                        resultMa3x = Arrays.deepToString(tempMa3x);

                    }
                }


            }
        }
        resultMa3x = resultMa3x.replace("[", "");
        resultMa3x = resultMa3x.replace("]", "");
        resultMa3x = resultMa3x.replace(",", "");
        int[] numbers = Arrays.stream(resultMa3x.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Sum = "+sum);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }


    }

    private static int[][] getMa3x(int rows, int columns, Scanner scanner) {
        int[][] ma3x = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.
                    stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).
                    toArray();
            for (int i = 0; i < columns; i++) {
                ma3x[row][i] = line[i];
            }
        }
        return ma3x;
    }
}
