import java.io.*;
import java.util.*;
public class Q_1_2 {
	public static void main(String[]args) {
		File obj=new File("diary.txt");
	try {
		if(!obj.exists()) {
			System.out.println("File Doesnot Exists.Added the file: "+obj.getName());
			FileWriter fw=new FileWriter("diary.txt");
			fw.write("29/04/24");
			fw.close();
			System.out.println("Successfully Written");
			//writting content in File
		}
		else {
			System.out.println("File is already Present");
		}
		System.out.println();
		System.out.println("Content of the File is:");
		Scanner read=new Scanner(obj);
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
		}
		read.close();
		//reading content from file
		
	}
	catch(IOException e){
		System.out.println("Please Provide Correct Input");
	}
	}
		}