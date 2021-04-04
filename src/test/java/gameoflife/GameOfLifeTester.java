package gameoflife;

import gameoflife.pojo.Coordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ETestCaseFile;
import java.util.List;

public class GameOfLifeTester {
    private static final GameOfLifeTestSolver GAME_OF_LIFE_TEST_SOLVER = new GameOfLifeTestSolver();
    private static final GameOfLifeTestHelper GAME_OF_LIFE_TEST_HELPER = new GameOfLifeTestHelper();

    @Test
    public void testInput1() {
        try {
            List<Coordinate> actualOutputList = GAME_OF_LIFE_TEST_SOLVER.solveAsList(
                    GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeInput1));

            List<Coordinate> expectedOutputList = GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeOutput1);

            Assertions.assertEquals(expectedOutputList, actualOutputList);

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput2() {
        try {
            List<Coordinate> actualOutputList = GAME_OF_LIFE_TEST_SOLVER.solveAsList(
                    GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeInput2));

            List<Coordinate> expectedOutputList = GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeOutput2);

            Assertions.assertEquals(expectedOutputList, actualOutputList);

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput3() {
        try {
            List<Coordinate> actualOutputList = GAME_OF_LIFE_TEST_SOLVER.solveAsList(
                    GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeInput3));

            List<Coordinate> expectedOutputList = GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeOutput3);

            Assertions.assertEquals(expectedOutputList, actualOutputList);

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void testInput4() {
        try {
            List<Coordinate> actualOutputList = GAME_OF_LIFE_TEST_SOLVER.solveAsList(
                    GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeInput4));

            List<Coordinate> expectedOutputList = GAME_OF_LIFE_TEST_HELPER.getCoordinateFromInputStream(ETestCaseFile.gameOfLifeOutput4);

            Assertions.assertEquals(expectedOutputList, actualOutputList);

        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

}
