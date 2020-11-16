import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(30);
    }

    @Test
    public void canPrintIfEnoughPaper() {
        myPrinter.print(5,3);
        assertEquals(15, myPrinter.getSheetsLeft());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper() {
        myPrinter.print(10, 4);
        assertEquals(30, myPrinter.getSheetsLeft());
    }
}
