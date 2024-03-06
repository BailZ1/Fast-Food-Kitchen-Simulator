
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baile
 */
public class Module3Test {
    public static void main(String[] args) {
        FastFoodKitchenSimulation kitchen = new FastFoodKitchenSimulation();
        Scanner sc = new Scanner(System.in);
        
        int orderPosition = kitchen.findOrderBin(2);
        System.out.println("Order Bin:" +orderPosition);
        
        kitchen.insertionSort();
//      kitchen.selectionSort();
//      kitchen.findOrderSeq();
        
        ArrayList<Order> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for(Order order : sortedOrders){
            orderSize = order.getNumBurger();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        }
    }
}
