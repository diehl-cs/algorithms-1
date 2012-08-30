/**
 * Algorithm static class.
 *
 * <p>Contains static methods with several algorithms relevant to this
 * chapter.
 *
 * @author Vinny Diehl
 * @version 0.1
 */
public class Algorithms
{
    /**
     * Calculates the cheapest car.
     *
     * @param a the first car to be compared
     * @param b the second car to be compared
     * @param fuelCost the price of fuel per gallon
     * @return the cheapest car, or a if it is a tie
     */
    public static Car cheaperCar(Car a, Car b, float fuelCost)
    {
        return a.totalCost(fuelCost) > b.totalCost(fuelCost) ? b : a;
    }

    /**
     * Calculate how long it takes for interest to double the inital deposit.
     *
     * @param init the initial deposit to the bank account
     * @param interest the annual interest percentage
     * @return the number of years taken to double the money in the account
     */
    public static int timeToDouble(float init, int interest)
    {
        // It is better, of course, to do this mathematically in practice, but
        // in the interest of showcasing algorithms, here is the algorithmic
        // solution.

        int year = 0;
        float balance = init;

        while (balance < init * 2)
        {
            ++year;
            balance *= 1 + (interest / 100F);
        }

        return year;
    }

    /**
     * Calculates the phone bill for a given number of minutes.
     *
     * <p>This assumes that you are being charged $29.95 for up to 300 minutes
     * of calls, and $0.45 for each additional minute, plus 12.5% for taxes
     * and fees.
     *
     * @param minutes the amount of minutes used
     * @return the phone bill in dollars
     */
    public static float phoneBill(int minutes)
    {
        return (29.95F + Math.max(0, minutes - 300) * 0.45F) * 1.125F % 100;
    }
}
