import java.util.Scanner;
public class Q11 {
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	double x=scnr.nextDouble();
	x=Math.toRadians(x);
	double denominator = Math.tan(x)-(1/Math.tan(x));
	try {
        if (Math.abs(denominator) < 1e-10) {
            throw new ArithmeticException("Denominator is zero.");
		}
		else {
			double c=((Math.sin(x)+Math.cos(x))/denominator);
			System.out.println(c);
		}
	}
	catch(ArithmeticException e) {
		System.out.println("Error : "+e.getMessage());
	}
}
}