package chap_three;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
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
                condimentCost = 0.10;
                break;
            case GRANDE:
                condimentCost =0.15;
                break;
            case VENTI:
                condimentCost = 0.20;
                break;
        }
        return beverage.cost() + condimentCost;
    }
}
