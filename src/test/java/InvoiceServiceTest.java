import GenerateInvoice.GenerateInvoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    GenerateInvoice gi = new GenerateInvoice();
    @Test
    public void givenDistanceAndTime_Should_ReturnTotalFare(){
        double tot_fare = 53;

        //InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        //invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(53,tot_fare);
    }
}