package chap_one;

public class Duck {

    public void swim(){
        System.out.println("swims");
    }

    public void quack(){
        System.out.println("quacks");
    }

    public void display(){}

}

class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("this is Mallard Duck");
    }
}

class RedHeadedDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is RedHeadedDuck");
    }
}

class FlyingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is Flying Duck");
    }
    //Missing Flying functionality
    //First Change in Design is to add the method fly() in Parent Class - Duck

}

