import java.util.Arrays;
import java.util.Scanner;

public class Ma3xSuffesing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] ma3x = getMa3xs(scanner, size[0], size[1]);
        String[] command = scanner.nextLine().split("\\s+");
        while (!"END".equals(command[0])) {
            if (command.length != 5
                    || Integer.parseInt(command[1]) > (size[0] - 1)
                    || Integer.parseInt(command[1]) < (0)
                    || Integer.parseInt(command[2]) > (size[1] - 1)
                    || Integer.parseInt(command[2]) < (0)
                    || Integer.parseInt(command[3]) > (size[0] - 1)
                    || Integer.parseInt(command[3]) < (0)
                    || Integer.parseInt(command[4]) > (size[1] - 1)
                    || Integer.parseInt(command[4]) < (0)
                    || !command[0].equals("swap")
            ) {
                System.out.println("Invalid input!");
            } else {
                String temp = ma3x[Integer.parseInt(command[1])][Integer.parseInt(command[2])];

                ma3x[Integer.parseInt(command[1])][Integer.parseInt(command[2])] =
                        ma3x[Integer.parseInt(command[3])][Integer.parseInt(command[4])];
                ma3x[Integer.parseInt(command[3])][Integer.parseInt(command[4])] = temp;
                for (int i = 0; i < ma3x.length; i++) {
                    for (int j = 0; j < ma3x[i].length; j++) {
                        System.out.print(ma3x[i][j] + " ");
                    }
                    System.out.println();
                }

            }


            command = scanner.nextLine().split("\\s+");
        }

    }

    private static String[][] getMa3xs(Scanner scanner, int rows, int columns) {

        String[][] ma3xs = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            ma3xs[row] = scanner.nextLine().split("\\s+");
//            String[] line = scanner.nextLine().split("\\s+");
//            for (int column = 0; column < columns; column++) {
//                ma3xs[row][column] = line[column];
//            }
        }
        return ma3xs;
    }
}
