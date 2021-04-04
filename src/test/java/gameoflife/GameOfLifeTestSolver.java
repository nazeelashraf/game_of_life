package gameoflife;

import gameoflife.pojo.Coordinate;
import solver.ITestSolver;
import util.ETestCaseFile;

import java.util.List;

public class GameOfLifeTestSolver extends GameOfLifeSolver implements ITestSolver {

    @Override
    public List<Coordinate> solveAsList(List<Coordinate> coordinates) throws Exception {
        return super.solveInternal(coordinates);
    }
}
