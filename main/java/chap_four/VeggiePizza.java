package chap_four;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare(){
        System.out.println("Preparing Pizza!..Assembling Toppings!");

    }

    @Override
    public void bake(){
        System.out.println("Baking Deliciously YummyLicious Pizza!");
    }

    @Override
    public void cut(){
        System.out.println("Pizza is readyLicious! Lets Cut!");
    }

    @Override
    public void box(){
        System.out.println("BoxLiciously Up and Ready to go!!");
    }
}
