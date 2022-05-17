package volumeofaspherecalculator;
import java.util.Scanner;
public class VolumeOfASphereCalculator {
    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double diameter;
        System.out.print("Enter the diameter of the sphere: ");
        diameter = computerKeyboardInput.nextDouble();
        double volume = Math.PI / 6.0 * diameter * diameter * diameter;
        System.out.println("Sphere volume in cubic cm = " + volume);
    }
}
