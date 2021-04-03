package driver;


import gameoflife.GameOfLifeSolver;
import salestax.SalesTaxSolver;
import util.ETestCaseFile;

public class DriverApp {

    public static void main(String[] args) throws Exception {

        DriverApp driver = new DriverApp();

//        driver.solveSalesTaxProblem();
        driver.solveGameOfLife();
    }

    private void solveSalesTaxProblem() throws Exception {
        SalesTaxSolver solver = new SalesTaxSolver();

        solver.solve(ETestCaseFile.salesTaxInput1);
        System.out.println("---------------");
        solver.solve(ETestCaseFile.salesTaxInput2);
        System.out.println("---------------");
        solver.solve(ETestCaseFile.salesTaxInput3);
    }

    private void solveGameOfLife() throws Exception {
        GameOfLifeSolver solver = new GameOfLifeSolver();
//        solver.solve(ETestCaseFile.gameOfLifeInput1);
//        System.out.println("---------------");
//        solver.solve(ETestCaseFile.gameOfLifeInput2);
        solver.solve(ETestCaseFile.gameOfLifeInput4);
    }

}
