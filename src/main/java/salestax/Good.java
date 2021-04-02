package salestax;

import java.math.BigDecimal;

public class Good {
    private Integer quantity;
    private String itemName;
    private Boolean imported;
    private Boolean exempted;
    private BigDecimal price;
    private BigDecimal taxedPrice;

    public Good(Integer quantity, String itemName, Boolean imported, Boolean exempted, BigDecimal price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.imported = imported;
        this.exempted = exempted;
        this.price = price;
    }

    public BigDecimal calculateTax() {
        BigDecimal tax = SalesTaxConstants.ZERO;

        if(!this.exempted) tax = tax.add(SalesTaxConstants.SALES_TAX);
        if(this.imported) tax = tax.add(SalesTaxConstants.IMPORT_DUTY);

        if(tax != SalesTaxConstants.ZERO) {
            tax = tax.multiply(price)
                    .multiply(SalesTaxConstants.TWO)
                    .setScale(1, BigDecimal.ROUND_CEILING)
                    .divide(SalesTaxConstants.TWO);
        }

        this.taxedPrice = this.price.add(tax);

        return tax;
    }

    @Override
    public String toString() {
        return String.join(" ",
                this.quantity.toString(),
                this.itemName+":",
                SalesTaxConstants.FORMAT.format(this.taxedPrice));
    }

    public BigDecimal getTaxedPrice() {
        return taxedPrice;
    }
}
