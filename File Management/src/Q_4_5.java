import java.io.*;
import java.util.Scanner;
public class Q_4_5 {
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter a Directory:");
		String direc=scnr.nextLine();
		File file=new File(direc);
			if(file.exists() && file.isDirectory()) {
				System.out.println("Directory Path is: "+direc);
				File[]files=file.listFiles();
				for(File f:files) {
					System.out.println(f.getName());
				}
			}
			else {
				System.out.println("Directory doesnot exists");
			}
			scnr.close();
	}

}