import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();
            x=Math.toRadians(x);

            double sinValue = Math.sin(x);
            double cosValue = Math.cos(x);
            double tanValue = Math.tan(x);

            if (Math.abs(tanValue+1) < 1e-10) {
                throw new ArithmeticException("Tangent value leads to division by zero.");
            }

            if (x < 0) {
                throw new ArithmeticException("Value of x is negative.");
            }

            double expressionValue = Math.sqrt(Math.abs(sinValue * cosValue)) / (tanValue + 1);
            System.out.println("Value of the expression for x = " + x + " is: " + expressionValue);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
