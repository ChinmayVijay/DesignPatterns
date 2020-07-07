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
        double condimentCost=0;
        switch(beverage.getSize()){
            case TALL:
                condimentCost = 0.15;
                break;
            case GRANDE:
                condimentCost =0.19;
                break;
            case VENTI:
                condimentCost = 0.24;
                break;
        }
        return beverage.cost() + condimentCost;
    }
}
