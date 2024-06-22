import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();
            x=Math.toRadians(x);
            double sinValue = Math.sin(x);
            double cosValue = Math.cos(x);

            double denominator = Math.tan(x)-(1/Math.tan(x));

            if (Math.abs(denominator) < 1e-10) {
                throw new ArithmeticException("Denominator is zero.");
            }
            else {
            double result =Math.abs(sinValue + cosValue) / denominator;
            if(result<0) {
            	throw new Exception("Negative values is not allowed inside the logarithmic function"); 
            }
            double finalresult=Math.log(result);
            System.out.println("Value of the function for x = " + x + " is: " + finalresult);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception a) {
            System.out.println("Error: "+a.getMessage());
        } finally {
            scanner.close();
        }
    }
}
