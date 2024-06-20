import java.util.Scanner;

/**
 * Brocode
 */
public class Brocode {

    public static void main(String args[]) {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();
        z = Math.sqrt((x * x) + (y * y));

        System.out.println("the hypotenuse equal:" + z);

        scanner.close();
    }
}