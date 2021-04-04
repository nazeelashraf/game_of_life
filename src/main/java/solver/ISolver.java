package solver;

import gameoflife.pojo.Coordinate;

import java.util.List;

public interface ISolver {
    List<Coordinate> solve(List<Coordinate> coordinates) throws Exception;
}
