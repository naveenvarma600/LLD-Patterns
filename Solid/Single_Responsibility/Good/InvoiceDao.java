package LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Good;


public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save the data into DB
    }
}
