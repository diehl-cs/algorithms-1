import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test suite for the Algorithms class.
 *
 * @author Vinny Diehl
 * @version 0.1
 */
public class AlgorithmsTestSuite
{
    @Test
    public void testCarAWin()
    {
        Car carA = new Car(10000, 20, 40000);
        Car carB = new Car(15000, 15, 50000);

        assertEquals(carA, Algorithms.cheaperCar(carA, carB, 4.9F));
    }

    @Test
    public void testCarBWin()
    {
        Car carA = new Car(15000, 15, 50000);
        Car carB = new Car(10000, 20, 40000);

        assertEquals(carB, Algorithms.cheaperCar(carA, carB, 4.9F));
    }

    @Test
    public void testTieReturnsCarA()
    {
        Car carA = new Car(15000, 15, 50000);
        Car carB = new Car(15000, 15, 50000);

        assertEquals(carA, Algorithms.cheaperCar(carA, carB, 4.9F));
    }

    @Test
    public void testTimeToDouble()
    {
        // $10,000 takes 15 years to double on 5% interest.
        assertEquals(15, Algorithms.timeToDouble(10000, 5));
        // It takes 4 years on 20% interest.
        assertEquals(4, Algorithms.timeToDouble(10000, 20));
    }

    @Test
    public void testPhoneBill()
    {
        // All phone bills for usage up to 300 minutes should be $33.70.
        for (int i = 0; i <= 300; ++i)
            assertEquals(33.7F, Algorithms.phoneBill(i), 1e-2);
        
        // Going 50 minutes over will take the bill up to $59.
        assertEquals(59F, Algorithms.phoneBill(350), 1e-2);
        // Going 100 minutes over will take the bill up to $84.32.
        assertEquals(84.32F, Algorithms.phoneBill(400), 1e-2);
    }
}
