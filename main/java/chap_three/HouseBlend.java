package chap_three;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description ="House Blend";
    }

    @Override
    public double cost() {
        return 3;
    }
}
