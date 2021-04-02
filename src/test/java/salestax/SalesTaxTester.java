package salestax;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ETestCaseFile;
import util.TestCaseLoader;

import java.io.BufferedReader;
import java.util.List;

public class SalesTaxTester {

    private static final SalesTaxSolver salesTaxSolver = new SalesTaxSolver();

    @Test
    public void testInput1() {
        try {
            List<String> outputList = salesTaxSolver.solveAsLine(ETestCaseFile.salesTaxInput1);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.salesTaxOutput1.toString());

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
            List<String> outputList = salesTaxSolver.solveAsLine(ETestCaseFile.salesTaxInput2);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.salesTaxOutput2.toString());

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
            List<String> outputList = salesTaxSolver.solveAsLine(ETestCaseFile.salesTaxInput3);

            BufferedReader reader = TestCaseLoader.getInputBufferForFile(ETestCaseFile.salesTaxOutput3.toString());

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
