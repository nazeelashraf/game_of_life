package solver;

import util.ETestCaseFile;

import java.util.List;

public interface ISolver {
    void solve(ETestCaseFile file) throws Exception;
    void solve(String file) throws Exception;

    List<String> solveAsLine(ETestCaseFile file) throws Exception;
    List<String> solveAsLine(String file) throws Exception;

}
