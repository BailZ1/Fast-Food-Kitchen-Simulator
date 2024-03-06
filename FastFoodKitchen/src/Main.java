/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author baile
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
// lab 1

//        
//        Order order1 = new Order(3, 5, 4, 10, true, 1);
//        Order order2 = new Order(0, 0, 3, 3, false, 2);
//        Order order3 = new Order(1, 1, 0, 2, false, 3);
//        
//        order1.setNumSodas(12);
//        
//        System.out.println("Order{" + "numHambers=" + order1.getNumHamburgers() + ", numCheeseburgers=" + order1.getNumCheeseburgers() + ", numVeggieburgers=" + order1.getNumVeggieburgers()+ ", numSodas=" + order1.getNumSodas() + ", orderToGo=" + order1.isOrderToGo()+ ", orderNum=" + order1.getOrderNum() + '}');
//        System.out.println("Order{" + "numHambers=" + order2.getNumHamburgers() + ", numCheeseburgers=" + order2.getNumCheeseburgers() + ", numVeggieburgers=" + order2.getNumVeggieburgers()+ ", numSodas=" + order2.getNumSodas() + ", orderToGo=" + order2.isOrderToGo()+ ", orderNum=" + order2.getOrderNum() + '}');
//        System.out.println("Order{" + "numHambers=" + order3.getNumHamburgers() + ", numCheeseburgers=" + order3.getNumCheeseburgers() + ", numVeggieburgers=" + order3.getNumVeggieburgers()+ ", numSodas=" + order3.getNumSodas() + ", orderToGo=" + order3.isOrderToGo()+ ", orderNum=" + order3.getOrderNum() + '}');
//  


// Lab 2

//while (kitchen.getNumOrdersPending() >= 0) {
//                    // see what the user wants to do
//                    System.out.println("Please select from the following menu of options, by typing a number:");
//                    System.out.println("\t 1. Order food");
//                    System.out.println("\t 2. Cancel last order");
//                    System.out.println("\t 3. Cancel order number");
//                    System.out.println("\t 4. Find if order is preparing");
//                    System.out.println("\t 5. Show number of orders currently pending.");
//                    System.out.println("\t 6. Exit");
//
//                    int num = sc.nextInt();
//                    switch (num) {
//
//                        case 1:
//                            System.out.println("How many hamburgers do you want?");
//                            int ham = sc.nextInt();
//                            System.out.println("How many cheeseburgers do you want?");
//                            int cheese = sc.nextInt();
//                            System.out.println("How many veggieburgers do you want?");
//                            int veggie = sc.nextInt();
//                            System.out.println("How many sodas do you want?");
//                            int sodas = sc.nextInt();
//                            System.out.println("Is your order to go? (Y/N)");
//                            char letter = sc.next().charAt(0);
//                            boolean TOGO = false;
//                            if (letter == 'Y' || letter == 'y') {
//                                TOGO = true;
//                            }
//                            int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
//                            System.out.println("Thank-you. Your order number is " + orderNum);
//                            System.out.println();
//                            break;
//                        case 2:
//                            boolean ready = kitchen.cancelLastOrder();
//                            if (ready) {
//                                System.out.println("Thank you. The last order has been canceled");
//                            } else {
//                                System.out.println("Sorry. There are no orders to cancel.");
//                            }
//                            System.out.println();
//                            break;
//                        case 3: 
//                            System.out.println("Which order would you like to cancel?");
//                            num = sc.nextInt();
//                            boolean cancel = kitchen.cancelOrder(num);
//                            if (cancel) {
//                                System.out.println("Your order has been successfully cancelled");
//                            } else {
//                                System.out.println("Sorry, we can’t find your order number in the system");
//                            }
//                            System.out.println();
//                            break;
//                        case 4:    
//                            System.out.println("Which order would you like to check on?");
//                            num = sc.nextInt();
//                            boolean n = kitchen.isOrderDone(num);
//                            if (!n) {
//                                System.out.println("No order was found.");
//                            } else {
//                                System.out.println("Your order is being prepared");
//                            }
//                            System.out.println();
//                            break;
//                        case 5:
//                            System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
//                            break;
//                        case 6:
//                            System.exit(0);
//                            break;
//                        default:
//                            System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
//
//                    } // end switch statements
//
//                } // end while loop
        
        
        
    }//end of method 
}//end of class
