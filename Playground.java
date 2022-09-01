import java.util.Scanner;

class Playground {
    public static void main(String[] args) {
        // intialize variables
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int stepCount = 1;
        int spiralCount = Math.min(m, n) / 2; // key part of this algo
        if (Math.min(m, n) % 2 != 0) {
            spiralCount++;
        }

        char[][] grid = new char[m][n];

        // read grid
        for (int rowNum = 0; rowNum < m; ++rowNum) {
            String s = sc.next().trim(); // reading entire row
            for (int colNum = 0; colNum < n; ++colNum) {
                grid[rowNum][colNum] = s.charAt(colNum);
            }
        }

        // traverse grid
        for (int spiralNum = 0; spiralNum < spiralCount; ++spiralNum) {

            // move right
            for (int colNum = spiralNum; colNum < n - 1 - spiralNum; ++colNum) {
                if (grid[spiralNum][colNum] == 'X') { // row number is fixed at spiraNum when moving right
                    System.out.println("Apple at (" + spiralNum + ", " + colNum + ") eaten at step " + stepCount);
                }
                grid[spiralNum][colNum] = '.';
                stepCount++;
            }

            // move down
            for (int rowNum = spiralNum; rowNum < m - 1 - spiralNum; ++rowNum) {
                //
                if (grid[rowNum][n - spiralNum - 1] == 'X') { // col number is fixed when moving down
                    System.out.println(
                            "Apple at (" + rowNum + ", " + (n - spiralNum - 1) + ") eaten at step " + stepCount);
                }
                grid[rowNum][n - spiralNum - 1] = '.';
                stepCount++;
            }

            // move left
            for (int colNum = n - spiralNum - 1; colNum > spiralNum; --colNum) {
                if (grid[m - spiralNum - 1][colNum] == 'X') {
                    System.out.println(
                            "Apple at (" + (m - spiralNum - 1) + ", " + colNum + ") eaten at step " + stepCount);
                }
                grid[m - spiralNum - 1][colNum] = '.';
                stepCount++;
            }

            // move up
            for (int rowNum = m - spiralNum - 1; rowNum > spiralNum; --rowNum) {
                if (grid[rowNum][spiralNum] == 'X') {
                    System.out.println("Apple at (" + rowNum + ", " + spiralNum + ") eaten at step " + stepCount);
                }
                grid[rowNum][spiralNum] = '.';
                stepCount++;
            }
        }

        sc.close();
    }
}
