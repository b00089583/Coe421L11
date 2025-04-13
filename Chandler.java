public class Chandler {
    private Humor humor;  
    
    public Chandler() {
        
        this.humor = new SarcasticHumor();
        
       
        startDay();
    }
    
   
    private void startDay() {
        int[] sequence = {0, 1, 0, 0, 0, 2, 0, 2};
        
        for (int i = 0; i < sequence.length; i++) {
            switch (sequence[i]) {
                case 0:
                    humor = new SarcasticHumor();
                    break;
                case 1:
                    humor = new SelfDeprecationHumor();
                    break;
                case 2:
                    humor = new WitHumor();
                    break;
            }
            
            
            humor.tellJoke();
            
           
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}