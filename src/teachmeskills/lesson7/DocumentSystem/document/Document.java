package teachmeskills.lesson7.DocumentSystem.document;

import java.util.Date;

public abstract class Document {
    public long documentNumber;
    public Date documentDate;

    public Document(long documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Document() {
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public void printDocumentInfo(Document document) {

    }

    public void safeNewDocument(Document document) {

    }
}
