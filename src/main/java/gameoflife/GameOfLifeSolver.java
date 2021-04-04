package gameoflife;

import gameoflife.pojo.Coordinate;
import gameoflife.pojo.GameOfLife;
import gameoflife.pojo.Grid;
import gameoflife.pojo.IGrid;
import solver.ISolver;

import java.util.List;

public class GameOfLifeSolver implements ISolver {

    @Override
    public List<Coordinate> solve(List<Coordinate> coordinates) throws Exception {
        return this.solveInternal(coordinates);
    }

    protected List<Coordinate> solveInternal(List<Coordinate> coordinates) throws Exception {

        int m = 0, n = 0, x, y;

        for(Coordinate coordinate: coordinates) {
            x = coordinate.getX();
            y = coordinate.getY();
            m = m < x ? x : m;
            n = n < y ? y : n;

            coordinate.add(1);
        }

        m += 1;
        n += 1;

        IGrid<Boolean> grid = new Grid<Boolean>(m + 2, n + 2, Boolean.FALSE);
        grid.setValueAtCoordinates(coordinates, Boolean.TRUE);

        GameOfLife gameOfLife = new GameOfLife(grid);
        IGrid<Boolean> newGrid = gameOfLife.getNextGenerationTick();

        List<Coordinate> newCoordinates = newGrid.getCoordinatesWithValue(Boolean.TRUE);

        for(Coordinate coordinate: newCoordinates) {
            coordinate.add(-1);
        }

        return newCoordinates;
    }

}
