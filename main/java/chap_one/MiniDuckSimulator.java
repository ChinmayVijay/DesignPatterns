package chap_one;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuckNew mallardDuckNew = new MallardDuckNew();
        mallardDuckNew.performQuack();
        mallardDuckNew.performFly();


        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();

//        To change the duck's behaviouir at runtime just call the duck's setter method
        modelDuck.setFlyableBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
