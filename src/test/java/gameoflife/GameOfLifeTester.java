package gameoflife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ETestCaseFile;
import util.TestCaseLoader;

import java.io.BufferedReader;
import java.util.List;

public class GameOfLifeTester {
    private static final GameOfLifeSolver gameOfLifeSolver = new GameOfLifeSolver();

    @Test
    public void testInput1() {
        try {
            List<String> outputList = gameOfLifeSolver.solveAsLine(ETestCaseFile.gameOfLifeInput1);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.gameOfLifeOutput1.toString());

            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\\n");
            }

            Assertions.assertEquals(stringBuilder.toString(), String.join("\\n", outputList) + "\\n");

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput2() {
        try {
            List<String> outputList = gameOfLifeSolver.solveAsLine(ETestCaseFile.gameOfLifeInput2);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.gameOfLifeOutput2.toString());

            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\\n");
            }

            Assertions.assertEquals(stringBuilder.toString(), String.join("\\n", outputList) + "\\n");

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput3() {
        try {
            List<String> outputList = gameOfLifeSolver.solveAsLine(ETestCaseFile.gameOfLifeInput3);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.gameOfLifeOutput3.toString());

            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\\n");
            }

            Assertions.assertEquals(stringBuilder.toString(), String.join("\\n", outputList) + "\\n");

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput4() {
        try {
            List<String> outputList = gameOfLifeSolver.solveAsLine(ETestCaseFile.gameOfLifeInput3);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.gameOfLifeOutput3.toString());

            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\\n");
            }

            Assertions.assertEquals(stringBuilder.toString(), String.join("\\n", outputList) + "\\n");

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

}
