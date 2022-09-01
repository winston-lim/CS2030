import java.util.Scanner;

class Solution2 {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int stepCounter = 1;
        char[][] grid = new char[m][n];

        // read grid
        for (int rowNum = 0; rowNum < m; rowNum++) {
            String s = sc.next();
            for (int colNum = 0; colNum < n; colNum++) {
                grid[rowNum][colNum] = s.charAt(colNum);
            }
        }

        // Traversing the grid
        int rightBoundary = n - 1; // decrement
        int downBoundary = m - 1; // decrement
        int leftBoundary = 0; // increment
        int upBoundary = 0; // increment
        int coordinateY = 0;
        int coordinateX = 0;

        while (stepCounter <= n * m) {
            // right movement
            while (coordinateX < rightBoundary) {
                if (grid[coordinateY][coordinateX] == 'X') {
                    System.out.println(
                            "Apple at (" + coordinateY + ", " + coordinateX + ") eaten at step " + stepCounter);
                }
                grid[coordinateY][coordinateX] = '.';
                coordinateX++;
                stepCounter++;
            }

            // Down Movement
            while (coordinateY < downBoundary) {
                if (grid[coordinateY][coordinateX] == 'X') {
                    System.out.println(
                            "Apple at (" + coordinateY + ", " + coordinateX + ") eaten at step " + stepCounter);
                }
                grid[coordinateY][coordinateX] = '.';
                coordinateY++;
                stepCounter++;
            }

            // Left Movement
            while (coordinateX > leftBoundary) {
                if (grid[coordinateY][coordinateX] == 'X') {
                    System.out.println(
                            "Apple at (" + coordinateY + ", " + coordinateX + ") eaten at step " + stepCounter);
                }
                grid[coordinateY][coordinateX] = '.';
                coordinateX--;
                stepCounter++;
            }

            // Up Movement
            while (coordinateY > upBoundary) {
                if (grid[coordinateY][coordinateX] == 'X') {
                    System.out.println(
                            "Apple at (" + coordinateY + ", " + coordinateX + ") eaten at step " + stepCounter);
                }
                grid[coordinateY][coordinateX] = '.';
                coordinateY--;
                stepCounter++;
            }
            // after completing spiral, update boundaries
            rightBoundary--;
            downBoundary--;
            upBoundary++;
            leftBoundary++;

            // next spiral should start from within boundary
            coordinateX++;
            coordinateY++;
        }
        sc.close();
    }
}
