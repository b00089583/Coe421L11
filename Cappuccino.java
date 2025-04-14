
class Cappuccino extends CoffeeTemplate {

    @Override
    protected void grindBeans() {
        System.out.println("Grinding coffee in a medium grind here i made a change");
    }

    @Override
    protected void brewCoffee() {
        System.out.println("The coffee is being brewed!");
    }
    
    @Override
    protected boolean needsMilk() {
        return true;
    }
    
    @Override
    protected void processMilk() {
        System.out.println("Frothing the milk");
    }

    @Override
    protected void pourCoffee() {
        System.out.println("Pouring coffee and milk into big cup");
    }

    @Override
    protected void serve() {
        System.out.println("Serving cappucino with a cookie!");
    }
}
