import java.util.Arrays;
import java.util.Scanner;

public class sumMa3xElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowCol = Arrays.
                stream(scanner.nextLine().split(", ")).
                mapToInt(Integer::parseInt).
                toArray();
        int sum = getMa3xResults(rowCol, scanner);
        System.out.println(String.format("%s\n%s\n%s", rowCol[0], rowCol[1], sum));
    }

    private static int getMa3xResults(int[] rowCol, Scanner scanner) {
        int sum = 0;
        for (int row = 0; row < rowCol[0]; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < line.length; col++) {
                sum += line[col];
            }
        }

        return sum;
    }
}
