package chap_three;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.65;
    }
}
