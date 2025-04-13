
class Espresso extends CoffeeTemplate {

    @Override
    protected void grindBeans() {
        System.out.println("Finely grinding coffee");
    }

    @Override
    protected void brewCoffee() {
        System.out.println("The coffee is being brewed!");
    }
    

    @Override
    protected void pourCoffee() {
        System.out.println("Pouring coffee into a small cup");
    }

    @Override
    protected void serve() {
        System.out.println("Serving espresso with a muffin!");
    }
}