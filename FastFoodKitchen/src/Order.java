
/**
 *
 * @author baile
 */
public class Order {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 0;
    
    
    //Default Constructor
    public Order(){}
    
    /**
     * Creates an order object
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param toGo
     * @param numO 
     */
    public Order(int ham, int cheese, int veggie, int soda, boolean toGo, int numO){
        numHamburgers = ham;
        numCheeseburgers = cheese;
        numVeggieburgers = veggie;
        numSodas = soda;
        setOrderToGo(toGo);
        setOrderNum(numO);
    }
    
    /**
     * Gets number of hamburgers
     * @return integer
     */
    public int getNumHamburgers(){
        return numHamburgers;   
    }
    
    /**
     * Setter for Hamburgers
     * @param hamburger 
     */
    public void setNumHamburgers(int hamburger){
        
        if(hamburger > 0 ){
           this.numHamburgers = hamburger; 
        }else{
           System.out.println("Error: Invalid Amount");
        }
    }
    
    /**
     * Getter for Cheeseburgers
     * @return integer
     */
    public int getNumCheeseburgers(){
        return numCheeseburgers;   
    }
    
    /**
     * Setter for Cheeseburgers
     * @param cheeseburger 
     */
    public void setNumCheeseburgers(int cheeseburger){
        
        if(cheeseburger > 0 ){
           this.numCheeseburgers = cheeseburger; 
        }else{
           System.out.println("Error: Invalid Amount");
        }
    }
    
    /**
     * Gets total number of burgers
     * @return cheeseburgers + hamburgers
     */
    public int getNumBurger(){
        return numCheeseburgers + numHamburgers + numVeggieburgers;
    }
    
    /**
     * Getter for Veggieburgers
     * @return integer
     */
    public int getNumVeggieburgers(){
        return numVeggieburgers;   
    }
    
    /**
     * Setter for Veggieburgers
     * @param veggieburger 
     */
    public void setNumVeggieburges(int veggieburger){
        
        if(veggieburger > 0 ){
           this.numVeggieburgers = veggieburger; 
        }else{
           System.out.println("Error: Invalid Amount");
        }
    }
    
    /**
     * Gets number of sodas
     * @return integer
     */
    public int getNumSodas(){
        return numSodas;   
    }
    
    /**
     * Setter for Sodas
     * @param sodas 
     */
    public void setNumSodas(int sodas){
        
        if(sodas > 0 ){
           this.numSodas = sodas; 
        }else{
           System.out.println("Error: Invalid Amount");
        }
    }
    
    /**
     * Getter for Order to go
     * @return boolean
     */
    public boolean isOrderToGo(){
        return orderToGo;
    }
    
    /**
     * Setter for Order to go
     * @param order 
     */
    private void setOrderToGo(boolean order){
        this.orderToGo = order;
    }
    
    /**
     * Getter for order number
     * @return integer
     */
    public int getOrderNum(){
        return orderNum;
    }
    
    /**
     * Setter for order number
     * @param orderN 
     */
    private void setOrderNum(int orderN){
        
        if(orderN > 0){
           this.orderNum = orderN;
        }else{
            System.out.println("Error: Invalid Amount");
        }
        
    }
}


