import java.util.Arrays;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] ma3x = getMa3x(8, 8, scanner);

        fintRealQuenn(ma3x);

    }

    private static void fintRealQuenn(String[][] ma3x) {
        int rows = ma3x.length;
        for (int row = 0; row < rows; row++) {
            int columns = ma3x[row].length;
            for (int column = 0; column < columns; column++) {
                String currentChar = ma3x[row][column];
                int countRow = 0;
                int countColumns = 0;

                if (currentChar.equals("q")) {
                    for (int currentRow = 0; currentRow < rows; currentRow++) {
                        String checkForQ = ma3x[currentRow][column];
                        if (checkForQ.equals("q")) {
                            countRow++;
                        }
                    }
                    for (int currentColumn = 0; currentColumn < columns; currentColumn++) {
                        String checkForQCol = ma3x[row][currentColumn];
                        if (checkForQCol.equals("q")) {
                            countColumns++;
                        }
                    }
                    int diagonals = 0;
                    int row1 = row + 1;
                    int row2 = row - 1;
                    int row3 = row - 1;
                    int row4 = row + 1;
                    if (countRow == 1 && countColumns == 1) {
                        for (int i = column + 1; i < columns; i++) {
                            String current = ma3x[i][row1];
                            if (current.equals("q")) {
                                diagonals++;
                            }
                            if (row1 == rows-1) {
                                continue;
                            }
                            row1++;
                        }
                        for (int i = column - 1; i == 0; i--) {
                            String current = ma3x[i][row2];
                            if (current.equals("q")) {
                                diagonals++;
                            }
                            if (row2 == 0) {
                                continue;
                            }
                            row2--;
                        }
                        for (int i = column + 1; i < columns; i++) {
                            String current = ma3x[row3][i];
                            if (current.equals("q")) {
                                diagonals++;
                            }
                            if (row3 == 0) {
                                continue;
                            }
                            row3--;
                        }
                        for (int i = column - 1; i == 0; i--) {
                            String current = ma3x[i][row4];
                            if (current.equals("q")) {
                                diagonals++;
                            }
                            if (row4 == rows-1) {
                                continue;
                            }
                            row4++;
                        }

                    }
//                    System.out.println(diagonals);
                    if (diagonals == 0 && countRow == 1 && countColumns == 1) {
                        System.out.println(row + " " + column);
                    }
                }

            }


        }
    }


    private static String[][] getMa3x(int rows, int columns, Scanner scanner) {
        String[][] ma3x = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int column = 0; column < columns; column++) {
                ma3x[row][column] = line[column];
            }

        }
        return ma3x;
    }
}
