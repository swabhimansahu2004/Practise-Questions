import java.util.Scanner;
public class Q15 {
	public static void main(String[]args) {
		Scanner scnr=new Scanner(System.in);
		try {
			System.out.println("Enter an Integer Number:");
            String input = scnr.next();
            int a = Integer.parseInt(input);
            System.out.println("Enter another Integer Number:");
            String input2 = scnr.next();
            int b = Integer.parseInt(input2);
            try {
            	if(b==0) {
            		throw new ArithmeticException("Denominator is 0");
            	}
            	else {
            		System.out.println("a/b is: "+a/b);
            	}
            }
            catch(ArithmeticException x) {
            	System.out.println("Error is: "+x.getMessage());
            }
		}
		catch(NumberFormatException e){
			System.out.println("Incorrect Number Format.Enter a Valid Number");
		}
		finally {
			scnr.close();
		}
	}
}