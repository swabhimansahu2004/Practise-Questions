import java.io.*;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter File Name:");
		String del=scnr.nextLine();
		File file=new File(del);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println("Deleted File is: "+file.getName());
			}
			else {
				System.out.println("Unable to Delete");
			}
		}
		else {
			System.out.println("File Doesnot Exists");
		}
	}
}
