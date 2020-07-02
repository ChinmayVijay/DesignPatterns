package chap_one;

/**
 * Integrating the Duck Behaviour:
 * Add Behaviour to Duck Class - Has-A-Relationship - {@link FlyableBehaviour} and {@link QuackableBehaviour}
 *
 * Rather than handling the quack and fly behaviour itself, Duck Class
 * Delegates to the object referenced to @flyableBehaviour and @quackableBehaviour
 *
 * Design Principle: "<b>Favour Composition over Inheritance</b>"
 * Simpler Terms:
 * Here in our case Ducks get their behaviour by being composed
 * instead of inheriting the behaviour.
 * Pros:
 * 1. Encapsulate a family of algorithms into their own set of classes
 * 2. Lets you change the behaviour at runtime
 *
 */
public abstract class DuckFinal {
    FlyableBehaviour flyableBehaviour;
    QuackableBehaviour quackableBehaviour;
    public void swim(){
        System.out.println("swims");
    }
    public abstract void display();

    void performQuack(){
        quackableBehaviour.quack();
    }

    void performFly(){
        flyableBehaviour.fly();
    }

    public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
    }
}

class MallardDuckNew extends DuckFinal{

    public MallardDuckNew() {
        quackableBehaviour = new Quack();
        flyableBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }
}

 class ModelDuck extends DuckFinal{
     public ModelDuck() {
         quackableBehaviour = new QuackNotPossible();
         flyableBehaviour = new FlyNotPossible();
     }

     @Override
     public void display() {
         System.out.println("I am a model duck ♥");
     }
 }

 class FlyRocketPowered implements FlyableBehaviour{
     @Override
     public void fly() {
         System.out.println("Flying with JetPack");
     }
 }

