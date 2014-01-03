import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 22/10/2013
 * Time: 12:44
 * To change this template use File | Settings | File Templates.
 */
public class PayCalculatorTest {

    @Test
    public void shouldReturn200WhenHoursWorkedIs20AndPayRateIs10() {
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(200.0, payCalculator.getPay(20, 10));
    }

    @Test
    public void shouldReturn475WhenHoursWorkedIs45AndPayRateIs10(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(475.0, payCalculator.getPay(45, 10));
    }

}
