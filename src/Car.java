/**
 * A simple car class.
 *
 * @author Vinny Diehl
 * @version 0.1
 */
public class Car
{
    private float price, annualMiles, mpg;

    /**
     * Car constructor, initializes members based on input.
     *
     * @param price purchase price of the car
     * @param annualMiles annual miles driven
     * @param mpg fuel efficiency (miles per gallon)
     */
    public Car(float price, float annualMiles, float mpg)
    {
        this.price = price;
        this.annualMiles = annualMiles;
        this.mpg = mpg;
    }

    /**
     * Gets the total cost of the car.
     *
     * @param fuelCost price of fuel per gallon
     * @return the total operating cost of the car
     */
    public float totalCost(float fuelCost)
    {
        return annualMiles / mpg * fuelCost * 10 + price;
    }
}
