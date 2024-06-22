import java.util.*;
public class Q1 {
	public static void main(String[]args)throws Exception {
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System. out. println("An exception occurred: " + e. getMessage());	
		}
	}
}
