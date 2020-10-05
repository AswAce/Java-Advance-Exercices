import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        String[][]ma3x=getMa3x(n,n,scanner);

        printDiagonal(ma3x,n);

    }

    private static void printDiagonal(String[][] ma3x,int size) {
        for (int i = 0; i <size ; i++) {
            System.out.print(ma3x[i][i]+" ");
        }
        System.out.println();
        int z=size-1;
        for (int i = 0; i <size ; i++) {
            System.out.print(ma3x[z][i]+" ");
            z--;
        }
    }

    private static String[][] getMa3x(int rows, int columns, Scanner scanner) {
        String[][]ma3x=new String[rows][columns];
        for (int row = 0; row <rows ; row++) {
            String[]line =scanner.nextLine().split("\\s+");
            for (int column = 0; column <columns ; column++) {
                ma3x[row][column]=line[column];
            }

        }
return ma3x;
    }
}
