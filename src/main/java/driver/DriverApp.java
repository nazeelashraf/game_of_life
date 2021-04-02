package driver;


import salestax.SalesTaxSolver;
import util.ETestCaseFile;

public class DriverApp {

    public static void main(String[] args) throws Exception {

        new DriverApp().solveSalesTaxProblem();
    }

    private void solveSalesTaxProblem() throws Exception {
        SalesTaxSolver solver = new SalesTaxSolver();

        solver.solve(ETestCaseFile.salesTaxInput1);
        System.out.println("---------------");
        solver.solve(ETestCaseFile.salesTaxInput2);
        System.out.println("---------------");
        solver.solve(ETestCaseFile.salesTaxInput3);
    }
}
