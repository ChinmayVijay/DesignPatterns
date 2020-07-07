package chap_three;

public class StarbuzzCafe {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
//        System.out.println("The cost for "+beverage.getDescription()+ " is: $"+ beverage.cost());
        beverage.setSize(Beverage.Size.GRANDE);

        Beverage beverage1 = new HouseBlend();
        beverage1.setSize(Beverage.Size.VENTI);

        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println("The cost for "+beverage1.getDescription()+ " is: $"+ beverage1.cost());


    }
}
