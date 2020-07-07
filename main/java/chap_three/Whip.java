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

        double condimentCost=0;
        switch(beverage.getSize()){
            case TALL:
                condimentCost = 0.12;
                break;
            case GRANDE:
                condimentCost =0.18;
                break;
            case VENTI:
                condimentCost = 0.22;
                break;
        }
        return beverage.cost() + condimentCost;
    }
}
