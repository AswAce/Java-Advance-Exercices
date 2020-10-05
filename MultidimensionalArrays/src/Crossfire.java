import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int count = 1;
        List<List<Integer>> ma3x = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            List<Integer> line = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                line.add((count));
                count++;
            }
            ma3x.add(line);
        }
        String command = scanner.nextLine();
        while (!"Nuke it from orbit".equals(command)) {

            int[] nukePosition = Arrays.
                    stream(command.split("\\s+")).
                    mapToInt(Integer::parseInt).
                    toArray();
            int rowTarget = nukePosition[0];
            int colTarget = nukePosition[1];
            int dmg = nukePosition[2];
            for (int roww = rowTarget - dmg; roww <= rowTarget + dmg; roww++) {
                if (checkSize(roww, colTarget, ma3x)) {
                    ma3x.get(roww).set(colTarget, 0);
                }
            }
            for (int coll = colTarget - dmg; coll <= colTarget + dmg; coll++) {
                if (checkSize(rowTarget, coll, ma3x)) {
                    ma3x.get(rowTarget).set(coll, 0);
                }
            }
//            for (int coll = getstartingPoint(colTarget, dmg); coll < getEndPoint(colTarget, dmg, cols); coll++) {
//                ma3x.get(rowTarget).set(coll, 0);
//            }


//            }
            for (int i = 0; i < ma3x.size(); i++) {
                ma3x.get(i).removeAll(List.of(0));
                if (ma3x.get(i).size() == 0) {
                    ma3x.remove(i);
                    i--;
                }
            }


            command = scanner.nextLine();
        }
        pritnMa3x(ma3x);
    }

    private static void pritnMa3x(List<List<Integer>> ma3x) {
        for (int i = 0; i < ma3x.size(); i++) {
            ma3x.get(i).forEach(e-> System.out.print(e+" "));
            System.out.println();
        }
    }

    private static boolean checkSize(int row, int col, List<List<Integer>> ma3x) {

        return ((row >= 0 && row < ma3x.size()) && (col >= 0 && col < ma3x.get(row).size()));
    }


}
