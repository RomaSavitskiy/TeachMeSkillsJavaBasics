package teachmeskills.lesson7.DocumentSystem.document;

import java.util.Date;

public class ContractProduct extends Document {
    private String productType;
    private long productAmount;

    public ContractProduct(long documentNumber, Date documentDate, String productType, long productAmount) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public ContractProduct() {
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public long getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(long productAmount) {
        this.productAmount = productAmount;
    }

    @Override
    public String toString() {
        return "Контракт на поставку товаров {" + "Номер документа = " + documentNumber + "; Тип = '" + productType +
                '\'' + "; Количество = " + productAmount +  "; Дата = " + documentDate + '}';
    }
}

