package salestax;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTaxConstants {

    public static final BigDecimal SALES_TAX = new BigDecimal("0.1");
    public static final BigDecimal IMPORT_DUTY = new BigDecimal("0.05");
    public static final BigDecimal TWO = new BigDecimal("2");
    public static final BigDecimal ZERO = new BigDecimal("0");

    public static final String SPLIT_PARAM = " at ";
    public static final String IMPORT = "imported";

    public static final DecimalFormat FORMAT = new DecimalFormat("#0.00");

    public static final List<String> EXEMPTION_LIST = new ArrayList<>();
    public static final String EXEMPTION_CSV = "book,chocolate,pills";

    static {
        EXEMPTION_LIST.addAll(Arrays.asList(EXEMPTION_CSV.split(",")));
    }
}
