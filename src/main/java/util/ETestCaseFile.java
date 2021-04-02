package util;

public enum ETestCaseFile {
    salesTaxInput1("SalesTax_Input1.txt"),
    salesTaxInput2("SalesTax_Input2.txt"),
    salesTaxInput3("SalesTax_Input3.txt"),
    salesTaxOutput1("SalesTax_Output1.txt"),
    salesTaxOutput2("SalesTax_Output2.txt"),
    salesTaxOutput3("SalesTax_Output3.txt")
    ;

    private final String fileName;

    ETestCaseFile(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return fileName;
    }
}
