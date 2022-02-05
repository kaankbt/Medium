package openClose.example1;

public class Example {

    public double GetInvoiceDiscount(double amount, InvoiceType invoiceType) {

        double finalAmount = 0;

        switch (invoiceType) {
            case FinalInvoice:
                finalAmount = amount - 100;
                break;
            case ProposedInvoice:
                finalAmount = amount - 50;
        }
        return finalAmount;
    }
}

enum InvoiceType {
    FinalInvoice, ProposedInvoice
}
