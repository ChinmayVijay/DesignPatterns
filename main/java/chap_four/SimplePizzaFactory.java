package chap_four;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }
        else if(type.equalsIgnoreCase("pepperoni")){
            return new PeppperoniPizza();
        }
        else if(type.equalsIgnoreCase("veggie")){
            return new VeggiePizza();
        }
        return null;
    }


}
