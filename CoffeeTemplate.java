
abstract class CoffeeTemplate {
   
    public final void makeCoffee() {
        grindBeans();
        brewCoffee();
        if(needsMilk()) {
            processMilk();
        }
        pourCoffee();
        serve();
    }
    
    
    protected abstract void grindBeans();
    
   
    protected abstract void brewCoffee();
    
    
    protected boolean needsMilk() {
        return false;
    }
    
    
    protected void processMilk() {
       
    }
    
    
    protected abstract void pourCoffee();
    
    
    protected abstract void serve();
}
