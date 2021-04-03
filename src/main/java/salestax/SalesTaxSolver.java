package salestax;

import solver.ISolver;
import util.ETestCaseFile;
import util.TestCaseLoader;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalesTaxSolver implements ISolver {

    @Override
    public void solve(ETestCaseFile file) throws Exception{
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
        BufferedReader bufferedReader = TestCaseLoader.getInputBufferForFile(fileName);
        String line;

        List<String> outputList = asList ? new ArrayList<>() : null;

        BigDecimal totalTax = SalesTaxConstants.ZERO;
        BigDecimal totalAmount = SalesTaxConstants.ZERO;

        while((line = bufferedReader.readLine()) != null) {
            Good good = SalesTaxHelper.createGoodFromLine(line);
            totalTax = totalTax.add(good.calculateTax());
            totalAmount = totalAmount.add(good.getTaxedPrice());
            if (asList) {
                outputList.add(good.toString());
            } else {
                System.out.println(good);
            }
        }

        String totalTaxString = "Sales Taxes: " + SalesTaxConstants.FORMAT.format(totalTax);
        String totalPriceString = "Total: " + SalesTaxConstants.FORMAT.format(totalAmount);

        if(asList) {
            outputList.add(totalTaxString);
            outputList.add(totalPriceString);
        } else {
            System.out.println(totalTaxString);
            System.out.println(totalPriceString);
        }


        return outputList;
    }

}
