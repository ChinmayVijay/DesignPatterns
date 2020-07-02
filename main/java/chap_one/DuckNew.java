package chap_one;

public class DuckNew {
    public void swim(){
        System.out.println("swims");
    }

    public void quack(){
        System.out.println("quacks");
    }

    public void display(){}

    public void fly(){
        System.out.println("flying");
    }

}

class FlyingDuckNew extends DuckNew{
    @Override
    public void display() {
        System.out.println("Flying Duck");
    }
}

class RubberDuck extends DuckNew{
    @Override
    public void display() {
        System.out.println("Rubber Ducks");
    }
}

// But now the problem is that: RubberDucks can also fly - as we added flying functionality in the Base Class
// This is a design Problem - Immediate Solution that comes to mind is to
// Create a Flyable Interface and have the ducks that can fly implement that interface

