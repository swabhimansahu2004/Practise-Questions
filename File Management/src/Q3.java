import java.io.*;
import java.util.*;
public class Q3 {
public static void main (String[] args) {
	Scanner scnr=new Scanner(System.in);
	System.out.println("Append any line");
	String s=scnr.nextLine();
	File file=new File("diary.txt");
	try {
		if(file.exists()) {
			BufferedWriter writter=new BufferedWriter(new FileWriter("diary.txt",true));
			writter.write("\n"+s);
			writter.close();
			System.out.println("Text appended successfully.");
		}
		else {
			System.out.println("File Doesnot Exists");
		}
	}
	catch(IOException e) {
		System.out.println("Error");
	}
}
}
