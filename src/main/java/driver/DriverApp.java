package driver;


import gameoflife.GameOfLifeHelper;
import gameoflife.GameOfLifeSolver;
import gameoflife.pojo.Coordinate;

import java.util.List;

public class DriverApp {

    private static GameOfLifeHelper gameOfLifeHelper = new GameOfLifeHelper();

    public static void main(String[] args) throws Exception {

        DriverApp driver = new DriverApp();

        try {
            printMenu();
            List<Coordinate> output = driver.solveGameOfLife();
            System.out.println("Output: ");
            for(Coordinate coordinate: output) {
                System.out.println(coordinate);
            }
        } catch (Exception e) {
            System.out.println("An error has occurred. Quitting...");
        }
    }

    private static void printMenu(){
        System.out.println("\nHello and welcome to the Game of Life tick generator.");
    }

    private List<Coordinate> solveGameOfLife() throws Exception {
        List<Coordinate> coordinateList = gameOfLifeHelper.getCoordinateFromInputStream();
        GameOfLifeSolver solver = new GameOfLifeSolver();
        return solver.solve(coordinateList);
    }

}
