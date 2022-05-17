/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumeofaspherecalculator;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class VolumeOfASphereCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        double diameter;
        System.out.print("Enter the diameter of the sphere: ");
        diameter = computerKeyboardInput.nextDouble();
        double volume = Math.PI / 6.0 * diameter * diameter * diameter;
        System.out.println("Ballon volume in cubic cm = " + volume);
    }
}
