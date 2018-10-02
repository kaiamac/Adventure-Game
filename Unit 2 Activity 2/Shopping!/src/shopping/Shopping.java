/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;
import java.util.Scanner;
/**
 *
 * @author kaiat
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyInput = new Scanner (System.in);
        
        Double mouse = 0.0;
        Double USB = 0.0;
        Double keyboard = 0.0;
        Double keyboardcost = 19.99;
        Double mousecost = 25.99;         
        Double USBcost = 19.99;
        Double HST = 0.13;
        Double mousesum = 0.0;
        Double keyboardsum = 0.0;
        Double USBsum = 0.0;
        Double sum = 0.0;
        Double totalsum = 0.0;
        
        System.out.println("How many keyboards would you like to purchase?");
        keyboard = keyInput.nextDouble();
        
        System.out.println("How many computer mice would you like to purchase?");
        mouse = keyInput.nextDouble();
        
        System.out.println("How many USB Storage Devices would you like to purchase?");
        USB = keyInput.nextDouble();
        
        mousesum = mouse * mousecost;
        keyboardsum = keyboard * keyboardcost;
        USBsum = USB * USBcost;
        
        sum = mousesum + keyboardsum + USBsum;
        
        totalsum = sum * HST;
        
        System.out.println("For " + keyboard + " keyboards, " + mouse + " computer mice, and " + USB + " USB storage devices, your grand total is $" + totalsum);
    }
    
}
