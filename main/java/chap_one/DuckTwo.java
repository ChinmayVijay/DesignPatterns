package chap_one;

public class DuckTwo {
    public void swim(){
        System.out.println("swims");
    }

    public void display(){}
}

/**
 * We create - Interface for each particular functionality like - Quackable , Flyable -
 * as all ducks dont fly and also all ducks cant quack
 */

interface Flyable{
    void fly();
}

interface Quackable{
    void quack();
}

class FlyingDucks extends DuckTwo implements Flyable, Quackable{
    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void display() {
        System.out.println("This is a flying duck");
    }
}

//Solution : Pros: This solves part of the problem - as now we can separately implement fly and quack functionality
// Cons: This destroys the code re-usability principle.

/*
    Zeroing in on the problem:
    Java Interfaces: have no implementation code -> means that whenever
    you need to modify a behaviour you need to track down all the classes implementing
    that behaviour and make appropriate changes
    This may introduce new bugs along the way
 */

/**
 * Design Principle:
 * " Identify the aspects of your application that vary and separate them from what stays the same"
 * Simpler Terms:
 * Encapsulate the part that varies so that later you can alter or extend the parts that vary
 * without affecting the part that does not change
 *
 */
