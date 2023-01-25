package LLD.Concept_And_Coding.L1_Solid.Open_Closed.Bad;

import LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Good.Invoice;

/**
 * <p>
 * Open for extension but closed for modification
 * <p>
 * Reason it's bad:
 * 1. Added new function saveToFile in the existing class, which can be prone to bugs
 * <p>
 * Ways to fix this:
 * 1. Create base interface
 * 2. And then child class which implements such interface
 */
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save the data into DB
    }

    public void saveToFile() {
        // Save the data into File
    }
}
