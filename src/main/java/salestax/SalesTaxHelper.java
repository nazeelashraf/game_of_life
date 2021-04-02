package salestax;

import java.math.BigDecimal;

public class SalesTaxHelper {

    public static Good createGoodFromLine(String line) throws Exception {
        String[] split = line.split(SalesTaxConstants.SPLIT_PARAM);

        StringBuilder stringBuilder = new StringBuilder();
        int i;
        for(i=0; i<line.length() && line.charAt(i)!=' '; i++) {
            stringBuilder.append(line.charAt(i));
        }

        String itemName = split[0].substring(i).trim();

        return new Good(
                Integer.parseInt(stringBuilder.toString()),
                itemName,
                itemName.contains(SalesTaxConstants.IMPORT),
                isExempted(itemName),
                new BigDecimal(split[1].trim()));
    }

    private static Boolean isExempted(String itemName) {
        for(String exemptedItem: SalesTaxConstants.EXEMPTION_LIST) {
            if(itemName.contains(exemptedItem))
                return true;
        }
        return false;
    }
}
