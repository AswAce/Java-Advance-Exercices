import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String command = input[1];
        int[][] ma3x = new int[size][size];
        if (command.equals("A")) {
            ma3x = optionA(size, scanner);
        } else if (command.equals("B")) {
            ma3x = optionB(size, scanner);
        }


        printMa3x(ma3x);
    }

    private static int[][] optionB(int size, Scanner scanner) {
        int[][] ma3x = new int[size][size];
        int counter=1;
        for (int column = 0; column < size; column++) {
            int n = column % 2;
            if (column == 0 || n == 0) {
                for (int row = 0; row < size; row++) {
                    ma3x[row][column] = counter;
                    counter++;
                }
            } else {

                for (int row = size-1; row >= 0; row--) {
                    ma3x[row][column] = counter;
                    counter++;
                }
            }
        }
        return ma3x;
    }

    private static void printMa3x(int[][] ma3x) {
        for (int row = 0; row < ma3x.length; row++) {
            for (int col = 0; col < ma3x[row].length; col++) {
                System.out.print(ma3x[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] optionA(int size, Scanner scanner) {
        int[][] ma3x = new int[size][size];
     int counter=1;
        for (int column = 0; column < size; column++) {

            for (int row = 0; row < size; row++) {
                ma3x[row][column] = counter;
                counter++;
            }
        }
        return ma3x;
    }
}
