package gameoflife;

import solver.ISolver;
import util.ETestCaseFile;
import util.TestCaseLoader;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class GameOfLifeSolver implements ISolver {
    @Override
    public void solve(ETestCaseFile file) throws Exception {
        solveInternal(file.toString(), false);
    }

    @Override
    public void solve(String file) throws Exception {
        solveInternal(file, false);
    }

    @Override
    public List<String> solveAsLine(ETestCaseFile file) throws Exception {
        return solveInternal(file.toString(), true);
    }

    @Override
    public List<String> solveAsLine(String file) throws Exception {
        return solveInternal(file, true);
    }

    private List<String> solveInternal(String fileName, Boolean asList) throws Exception {
        BufferedReader reader = TestCaseLoader.getInputBufferForFile(fileName);
        String line;
        int m = 0, n = 0, x, y;

        List<String> coordinates = new ArrayList<>();

        while((line = reader.readLine()) != null) {
            coordinates.add(line);
            String[] coord = line.split(GameOfLifeConstants.SPLIT_PARAM);
            x = Integer.parseInt(coord[0]);
            y = Integer.parseInt(coord[1]);

            if(m < x) m = x;
            if(n < y) n = y;
        }

        List<String> outputList = GameOfLifeHelper.solveGameOfLife(coordinates, m + 1, n + 1);

        if(!asList) {
            for(String outputLine: outputList) {
                System.out.println(outputLine);
            }
            return null;
        }

        return outputList;
    }
}
