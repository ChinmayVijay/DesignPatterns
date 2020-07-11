package chap_four;

public class CheesePizza extends Pizza {
    @Override
    public void prepare(){
        System.out.println("Preparing Pizza!");

    }

    @Override
    public void bake(){
        System.out.println("Baking Pizza!");
    }

    @Override
    public void cut(){
        System.out.println("Pizza is ready! Lets Cut!");
    }

    @Override
    public void box(){
        System.out.println("Box it and Ready to go!!");
    }
}
