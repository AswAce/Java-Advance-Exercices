import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        String[][]firstMa3x=getMa3x(rows,columns,scanner);
        String[][]secondMa3x=getMa3x(rows,columns,scanner);
        printNewMa3x(firstMa3x,secondMa3x);
    }

    private static void printNewMa3x(String[][] firstMa3x, String[][] secondMa3x) {
        int rows=firstMa3x.length;
        for (int row = 0; row <rows ; row++) {
            int columns= firstMa3x[row].length;
            for (int column = 0; column <columns ; column++) {
                String chars=firstMa3x[row][column].equals(secondMa3x[row][column]) ?
                        firstMa3x[row][column] : "*";
                System.out.print(chars+" ");
            }
            System.out.println();
        }
    }

    private static String[][] getMa3x(int rows, int columns, Scanner scanner) {
        String [][]Ma3xs =new String[rows][columns];
        for (int row = 0; row <rows ; row++) {

            String[]line= scanner.nextLine().
                            split("\\s+");
            for (int column = 0; column <columns ; column++) {
                Ma3xs[row][column]=line[column];
            }
        }
        return Ma3xs;
    }
}
