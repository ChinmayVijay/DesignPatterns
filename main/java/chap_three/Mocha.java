package chap_three;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage=beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return (beverage.cost() + 0.55) ;
    }
}
