package chap_two.impl_two;

import java.util.Observable;

/**
 * The way its implemented in java is full of flaws.
 *
 * 1. Observable is a class, not an interface, and worse, it doesn’t even implement an interface.
 * Unfortunately, the java.util.Observable implementation has a number of problems that limit its usefulness and reuse.
 * That’s not to say it doesn’t provide some utility, but there are some large potholes to watch out for.
 * So from design point of view its bad in 2 ways:
 *
 *    A) Because Observable is a class, you have to subclass it. That means you can’t add on the Observable behavior
 *    to an existing class that already extends another superclass. This limits its reuse potential
 *    (and isn’t that why we are using patterns in the first place?).
 *    B) Because there isn’t an Observable interface, you can’t even create your own implementation that plays well
 *    with Java’s built-in Observer API. Nor do you have the option of swapping out the java.util implementation for
 *    another (say, a new, multithreaded implementation).
 *
 * 2. Observable may serve your needs if you can extend java.util.Observable. On the other hand, you may need to roll
 * your own implementation as we did at the beginning of the chapter. In either case, you know the Observer Pattern well
 * and you’re in a good position to work with any API that makes use of the pattern.
 *
 * 3. If you look at the Observable API, the setChanged() method is protected. So what? Well, this means you can’t call
 * setChanged() unless you’ve subclassed Observable. This means you can’t even create an instance of the Observable
 * class and compose it with your own objects, you have to subclass. The design violates a
 * second design principle here…favor composition over inheritance.
 */
public class WeatherDataNew extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this. humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
