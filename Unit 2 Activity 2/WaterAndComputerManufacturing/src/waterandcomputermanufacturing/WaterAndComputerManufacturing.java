/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterandcomputermanufacturing;
import java.util.Scanner;
/**
 *
 * @author kaiat
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyInput = new Scanner (System.in);
        Double amnt1;
        Double tons = 1.5;
        Double sum = 0.0;
        //Input
        System.out.println("Enter amount of computer/monitor combos you own");
        amnt1 = keyInput.nextDouble();
        //Equation used to find how much water is used to create computer/monitor combo
        sum = amnt1 * tons;
        //Output
        System.out.println("Your " + amnt1 + " computer/monitor combo(s) used " + sum + " tons of water to be manufactured!");
    }
    
}
