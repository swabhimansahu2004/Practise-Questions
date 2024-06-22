import java.io.*;
import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		try {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter File Names:");
		String copy1=scnr.nextLine();
		File file1=new File(copy1);
		String copy2=scnr.nextLine();
		File file2=new File(copy2);

		if(file1.exists() && file2.exists()) {
			BufferedReader fr=new BufferedReader(new FileReader(file1));
			BufferedWriter fw=new BufferedWriter(new FileWriter(file2));
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine()) {
				fw.write(sc.nextLine());
				fw.newLine();
			}
			fw.close();
		}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
