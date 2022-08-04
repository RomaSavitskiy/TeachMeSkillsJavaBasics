package teachmeskills.lesson7.DocumentSystem.document;

import java.util.Date;

public class ContractWorker extends Document {
    Date dateContractOver;
    String workerName;

    public ContractWorker(long documentNumber, Date documentDate, Date dateContractOver, String workerName) {
        super(documentNumber, documentDate);
        this.dateContractOver = dateContractOver;
        this.workerName = workerName;
    }

    public Date getDateContractOver() {
        return dateContractOver;
    }

    public void setDateContractOver(Date dateContractOver) {
        this.dateContractOver = dateContractOver;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    @Override
    public String toString() {
        return "Контракт с сотрудником {" + "Номер документа = " + documentNumber + "; Имя ='" + workerName + '\'' +
                "; Дата окончания контракта = " + dateContractOver + "; Дата = " + documentDate + '}';
    }
}
