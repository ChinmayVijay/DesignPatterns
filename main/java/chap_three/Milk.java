package chap_three;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
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
                condimentCost = 0.20;
                break;
            case GRANDE:
                condimentCost =0.30;
                break;
            case VENTI:
                condimentCost = 0.38;
                break;
        }
        return beverage.cost() + condimentCost;
    }
}
