package driver;


import gameoflife.GameOfLifeSolver;
import salestax.SalesTaxSolver;
import util.ETestCaseFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DriverApp {

    public static void main(String[] args) throws Exception {


            DriverApp driver = new DriverApp();

            if(args.length==0) {
                printMenu(true);

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String choice;
                    while((choice = reader.readLine()) != null && !choice.equals("3")) {
                        try {
                            if("1".equals(choice)) {
                                System.out.println("Sales Tax calculator\nEnter input test file (full path): ");
                                String fileName = reader.readLine();
                                System.out.println("Output: ");
                                driver.solveSalesTaxProblem(fileName);
                                printMenu(true);
                            } else if ("2".equals(choice)) {
                                System.out.println("Game of Life tick generator\nEnter input test file (full path): ");
                                String fileName = reader.readLine();
                                System.out.println("Output: ");
                                driver.solveGameOfLife(fileName);
                                printMenu(true);
                            } else {
                                System.out.println("Invalid choice: '"+choice+"'. Please try again.");
                                printMenu(false);
                            }
                        } catch (Exception e) {
                            System.out.println("An error has occurred. Going back to menu...");
                            printMenu(true);
                        }
                    }

            } else {
                try {
                    if(args[0].equals("1")) {
                        System.out.println("Output: ");
                        driver.solveSalesTaxProblem(args[1]);
                    } else if(args[0].equals("2")) {
                        System.out.println("Output: ");
                        driver.solveGameOfLife(args[1]);
                    } else {
                        System.out.println("Invalid arg: '"+args[0]+"'. Please use 1 for Sales Tax Calculator and 2 for Game of Life.");
                    }
                } catch (Exception e) {
                    System.out.println("An error has occurred.");
                }
            }


    }

    private static void printMenu(Boolean printIntro){
        if(printIntro) System.out.println("\nHello and welcome to the Sales Tax calculator and Game of Life tick generator.");
        System.out.println("Select the program you would like to run:\n\t1. Sales Tax\n\t2. Game of Life\n\t3. Exit");
        System.out.print("Enter your choice: ");
    }

    private void solveSalesTaxProblem(String fileName) throws Exception {
        SalesTaxSolver solver = new SalesTaxSolver();
        solver.solve(fileName);
    }

    private void solveGameOfLife(String fileName) throws Exception {
        GameOfLifeSolver solver = new GameOfLifeSolver();
        solver.solve(fileName);
    }

}
