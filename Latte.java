class Latte extends CoffeeTemplate {

    @Override
    protected void grindBeans() {
        System.out.println(" Grinding coffee in a medium grind");
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
        System.out.println("Steaming the milk");
    }

    @Override
    protected void pourCoffee() {
        System.out.println("Pouring coffee and milk into big cup");
    }

    @Override
    protected void serve() {
        System.out.println("Serve latte with a croissant!");
    }
}
