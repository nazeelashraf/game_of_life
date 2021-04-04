package solver;

import gameoflife.pojo.Coordinate;
import util.ETestCaseFile;

import java.util.List;

public interface ITestSolver {
    List<Coordinate> solveAsList(List<Coordinate> coordinates) throws Exception;
}
