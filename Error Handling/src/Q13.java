import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            double sinValue = Math.sin(x);
            double cosValue = Math.cos(x);

            double denominator = sinValue + cosValue;

            if (Math.abs(denominator) < 1e-10) {
                throw new ArithmeticException("Denominator is zero.");
            }

            double result = (sinValue * cosValue) / denominator;
            System.out.println("Value of the function for x = " + x + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
