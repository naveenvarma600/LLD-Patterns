package LLD.Concept_And_Coding.L1_Solid.Open_Closed.Good;

import LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Good.Invoice;


public class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save to file
    }
}
