
/**
 *
 * @author bailey
 */
import java.util.*;

public class FastFoodKitchenSimulation {
    
    //List of Order Objects
    private ArrayList<Order> orderList = new ArrayList<>();
    
    /**
     * Getter for OrderList ArrayList
     * @return orderList ArrayList
     */
    public ArrayList<Order> getOrderList(){
        return orderList;
    }
    
    // integer for Next Order Num
    private static int nextOrderNum = 1;
    
    
    public FastFoodKitchenSimulation(){
        
        //Order no.1
        Order order1 = new Order(3, 5, 4, 10, true, FastFoodKitchenSimulation.getNextOrderNum());        
        FastFoodKitchenSimulation.incrementNextOrderNum();
        
        //Order no.2
        Order order2 = new Order(345, 0, 4, 3, false, FastFoodKitchenSimulation.getNextOrderNum());
        FastFoodKitchenSimulation.incrementNextOrderNum();
        
        //Order no.3
        Order order3 = new Order(1, 1, 0, 2, false, FastFoodKitchenSimulation.getNextOrderNum());
        FastFoodKitchenSimulation.incrementNextOrderNum();
        
        //Adding orders to the list
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
    }
    
    /**
     * Method for returning the next order number
     * @return integer
     */
    public static int getNextOrderNum(){
        return nextOrderNum;
    }
    
    /**
     * Method for raising order number
     * @return void
     */
    
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    /**
     * Method for adding orders
     * @param ham ham
     * @param cheese cheese
     * @param veggie veggie
     * @param soda soda
     * @param toGo toGo
     * @return integer
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        
        orderList.add(new Order(ham, cheese, veggie, soda, toGo, nextOrderNum));
        nextOrderNum++;
        return nextOrderNum - 1;
        
    }
    
    /**
     * Method for canceling last order
     * @return boolean
     */
    
    public boolean cancelLastOrder(){
        if(orderList.isEmpty()){
            return false;
        }else{
           orderList.remove(orderList.size()-1);
           nextOrderNum--;
           return true; 
        }
        
    }
    
    /**
     * Method for getting number of orders pending
     * @return integer
     */
    
    public int getNumOrdersPending(){
        return nextOrderNum - 1;
    }
    
    /**
     * Method for checking if order is still in progress
     * @param orderID Order Number
     * @return boolean
     */
    public boolean isOrderDone(int orderID){
        for(int i = 1; i <= orderList.size() - 1; i++){
            if( i == nextOrderNum - 1){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Method to cancel specific order number
     * @param orderID Order number
     * @return boolean
     */
    public boolean cancelOrder(int orderID){
        for(int i = 1; i <= orderList.size() - 1; i++){
            if( i == orderID ){
                orderList.remove(i);
                nextOrderNum--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param orderID
     * @return Order Index or -1
     */
    public int findOrderSeq(int orderID){
        for(int i = 0; i < orderList.size(); i++){
//            System.out.println(orderList.get(i).getOrderNum() + "\n " + orderID);
            if(orderList.get(i).getOrderNum() == orderID){
                return i;
            }
        }
        return -1;
    }
    
    
    /**
     * Selection Sort
     */
    
    public void selectionSort(){
        for(int j = 0; j < orderList.size(); j++){
            int minIndex = j;
            for(int k = j + 1; k < orderList.size(); k++){
                if(orderList.get(k).getNumBurger() < (orderList.get(minIndex).getNumBurger())){
                    minIndex = k;
                }
            }            
            Order temp = orderList.get(j);
            orderList.set(j, orderList.get(minIndex));
            orderList.set(minIndex, temp);
        }
        
    }
    
    /**
     * Insertion Sort
     */
    
    public void insertionSort(){
        
        for (int i = 1; i < orderList.size(); i++) {
            int temp = orderList.get(i).getNumBurger();
            Order T = orderList.get(i);
            int possibleIndex = i;
            while ((possibleIndex > 0) && (temp < orderList.get(possibleIndex - 1).getNumBurger()) ){
                
                Order tem = orderList.get(possibleIndex - 1);
                orderList.set(possibleIndex, tem);
                possibleIndex--;
            }
            
            orderList.set(possibleIndex, T);
        }
        
    }
    
    public int findOrderBin(int orderID){
        int left = orderList.get(0).getOrderNum();
        int right = orderList.get(orderList.size()-1).getOrderNum();
        
        while (left <= right){
            int middle = (left + right)/ 2;
            if(orderID > orderList.get(middle).getOrderNum()){
                right = middle - 1;
            }
            else if(orderID > orderList.get(middle).getOrderNum()){
                left = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
