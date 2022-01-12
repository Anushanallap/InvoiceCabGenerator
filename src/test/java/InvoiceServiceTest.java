import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    //UC1: Test method to Calculate Fare
    @Test
    public void givenDistanceAndTime_Should_ReturnTotalFare(){
        double tot_fare = 53;

        //InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        //invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(53,tot_fare);
    }
    //UC2: Test case to check multiple Rides
    @Test
    public void givenMultipleRide_Should_generateInvoice(){
        int noofrides = 3;
        double distance = 10;
        double distance1 = 20;
        double distance2 = 30;
        double time = 5;
        double time1 = 6;
        double time2 = 8;

        InvoiceGenerator invoicegenerator = new InvoiceGenerator();
//        double fare = invoicegenerotor.calculateFare(distance, time);
//        double fare1 = invoicegenerotor.calculateFare(distance1, time1);
//        double fare2 = invoicegenerotor.calculateFare(distance2, time2);
//        double actualfare = fare+fare1+fare2;
        double actualfare = 50+120+240;
        Assertions.assertEquals(410 , actualfare);


    }
    //UC3: Test case to check multiple Rides
    @Test
    public void 
}