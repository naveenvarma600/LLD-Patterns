package LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Good;


public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // print the invoice
    }
}
