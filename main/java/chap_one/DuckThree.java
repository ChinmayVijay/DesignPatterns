package chap_one;

/**
 * Extract the fly and quack behaviour out of the Duck Class :
 *
 * Design Principle: "Program to an Interface and not to an Implementation"
 * Simpler Terms: Program to a SuperType
 *
 * Solution:
 * BaseClass: {@link DuckThree} [swim and display]
 * Interfaces: {{@link FlyableBehaviour}}, {{@link QuackableBehaviour}}
 * Behaviour Classes: {@link FlyableBehaviour} -> implemented by {{@link FlyWithWings}, {{@link FlyNotPossible}} }
 *            : {{@link QuackableBehaviour}} -> {{{@link Quack}}, {@link Squeak}, {@link QuackNotPossible}}
 *
 * Pros:
 * 1. Other types of objects can reuse our fly and quack behaviours - behaviours
 * are no longer hidden in Duck Classes
 * 2. We can add new/ modify existing behaviour without changing
 * any of the Duck Classes [By changing just the Behaviour Classes]
 *
 */
public class DuckThree {
    public void swim(){
        System.out.println("swims");
    }
    public void display(){}
}

interface FlyableBehaviour {
    void fly();
}

class FlyWithWings extends DuckThree implements FlyableBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly using wings");
    }
}

class FlyNotPossible extends DuckThree implements FlyableBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly not Possible");
    }
}

//Similarly for Quack
interface QuackableBehaviour{
    void quack();
}

class Quack extends DuckThree implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

class Squeak extends DuckThree implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeaks");
    }
}

class QuackNotPossible extends DuckThree implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack not possible");
    }
}



