package teachmeskills.lesson7.DocumentSystem.document;

import java.util.Date;

public class FinancialInvoice extends Document {
   long finalMonthSum;
   long departmentCode;

    public FinancialInvoice(long documentNumber, Date documentDate, long finalMonthSum, long departmentCode) {
        super(documentNumber, documentDate);
        this.finalMonthSum = finalMonthSum;
        this.departmentCode = departmentCode;
    }

    public long getFinalMonthSum() {
        return finalMonthSum;
    }

    public void setFinalMonthSum(long finalMonthSum) {
        this.finalMonthSum = finalMonthSum;
    }

    public long getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(long departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" + "Номер документа = " + documentNumber + "; Код департамента =" + departmentCode +
                "; Итоговая сумма за месяц = " + finalMonthSum + "; documentDate = " + documentDate + '}';
    }
}
