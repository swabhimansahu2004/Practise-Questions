import java.util.Scanner;
public class Q10 {
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	double x=scnr.nextDouble();
	x=Math.toRadians(x);
	try {
        if (Math.abs(Math.tan(x)) < 1e-10) {
            throw new ArithmeticException("Denominator is zero.");
        }
		else {
			double c=(Math.sin(x)+Math.cos(x))/Math.tan(x);
			System.out.println(c);
		}
	}
	catch(ArithmeticException e) {
		System.out.println("Error : "+e.getMessage());
	}
}
}