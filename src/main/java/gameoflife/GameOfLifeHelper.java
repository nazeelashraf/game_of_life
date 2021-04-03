package gameoflife;

import java.util.ArrayList;
import java.util.List;

public class GameOfLifeHelper {

    public static List<String> solveGameOfLife(List<String> coordinates, Integer m, Integer n) throws Exception {
        List<String> output = new ArrayList<>();

        boolean[][] grid = buildGrid(coordinates, m+2, n+2);
        boolean[][] nextGrid = getNextGenerationTick(grid, m+2, n+2);

        for(int i=0; i < m + 2; i++) {
            for(int j=0; j < n + 2; j++) {
                if(nextGrid[i][j]) {
                    output.add((i-1) + ", " + (j-1));
                }
            }
        }

        return output;
    }

    private static boolean[][] buildGrid(List<String> coordinates, Integer m, Integer n) {
        boolean[][] grid = new boolean[m][n];
        int x, y;

        for(String coordinate: coordinates) {
            String[] coord = coordinate.split(GameOfLifeConstants.SPLIT_PARAM);
            x = Integer.parseInt(coord[0]);
            y = Integer.parseInt(coord[1]);
            grid[x + 1][y + 1] = true;
        }

        return grid;
    }

    private static boolean[][] getNextGenerationTick(boolean[][] grid, Integer m, Integer n) {
        boolean[][] nextGrid = new boolean[m][n];

        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                nextGrid[i][j] = isAlive(grid, m, n, i, j);
            }
        }

        return nextGrid;
    }

    private static boolean isAlive(boolean[][] grid, Integer m, Integer n, Integer x, Integer y) {
        boolean isAlive = grid[x][y];
        int startX = x > 0 ? x - 1 : x,
            startY = y > 0 ? y - 1 : y,
            endX = x < m-1 ? x + 1 : x,
            endY = y < n-1 ? y + 1 : y,
            count = isAlive ? -1 : 0;

        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(grid[i][j]) {
                    count++;
                }
            }
        }

        if(!isAlive) return count == 3;

        return (count==3 || count==2);
    }
}
