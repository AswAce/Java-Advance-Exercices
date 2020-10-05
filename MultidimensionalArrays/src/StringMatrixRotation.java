import java.util.Arrays;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("[()]");
        int degree = Integer.parseInt(command[1]);

        int rows = 0;
        int columns = 0;
        StringBuilder ma3x = new StringBuilder();
        String ma3xText = scanner.nextLine();
        while (!ma3xText.equals("END")) {
            int currentSIze = ma3xText.length();
            if (currentSIze >= columns) {
                columns = currentSIze;
            }
            ma3x.append(ma3xText).append("\n");


            rows++;
            ma3xText = scanner.nextLine();
        }
        String[] ma3xStyle;
        StringBuilder output = new StringBuilder();

        switch (degree % 360) {
            case 0:

                System.out.println(ma3x.toString());
                break;
            case 90:
                ma3xStyle = ma3x.toString().split("\n");
                for (int i = 0; i < columns; i++) {
                    for (int j = rows - 1; j >= 0; j--) {
                        try {
                            output.append(ma3xStyle[j].charAt(i));
                        } catch (Exception e) {
                            output.append(" ");
                        }
                    }
                    output.append("\n");

                }
                System.out.println(output.toString());
                break;
            case 180:
                System.out.println(ma3x.reverse().toString());
                break;
            case 270:
                ma3xStyle = ma3x.toString().split("\n");
                for (int i = 0; i < columns; i++) {
                    for (int j = rows - 1; j >= 0; j--) {
                        try {
                            output.append(ma3xStyle[j].charAt(i));
                        } catch (Exception e) {
                            output.append(" ");
                        }
                    }
                    output.append("\n");

                }
                System.out.println(output.reverse().toString());

                break;
        }
    }

    private static void printMa3x(String[][] ma3x) {
        for (int i = 0; i < ma3x.length; i++) {
            for (int j = 0; j < ma3x[i].length; j++) {
                System.out.print(ma3x[i][j]);
            }
            System.out.println();
        }
    }

}
