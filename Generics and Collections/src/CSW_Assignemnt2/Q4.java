package CSW_Assignemnt2;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Insert Size of Array");
		int n=scnr.nextInt();
		Student[]array=new Student[n];	
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the Name:");
			String a=scnr.next();
			System.out.println("Enter the Roll Number:");
			int b=scnr.nextInt();
			System.out.println("Enter the Total Marks:");
			int c=scnr.nextInt();
			array[i]=new Student(a,b,c);
		}
		System.out.println("Enter the details of student:");
		String a=scnr.next();
		int b=scnr.nextInt();
		int c=scnr.nextInt();
		boolean flag=false;
		Student check=new Student(a,b,c);
		for(int j=0;j<array.length;j++) {
			if(check.compareTo(array[j])) {
				System.out.println("Found the element at position "+(j+1));
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Student Found");
		}
	}

}
class Student{
	public String name;
	public int rollno;
	public int totalmarks;
	public Student(String a,int b,int c) {
		this.name=a;
		this.rollno=b;
		this.totalmarks=c;
	}
	public void set_name(String a){
		this.name=a;
	}
	public void set_rollno(int b){
		this.rollno=b;
	}
	public void set_totalmarks(int c){
		this.totalmarks=c;
	}
	public String get_name() {
		return name;
	}
	public int get_rollno() {
		return rollno;
	}
	public int get_totalmarks() {
		return totalmarks;
	}
	public void displayDetails() {
		System.out.println(name+" ; "+rollno+" ; "+totalmarks);}
	
	public boolean compareTo(Object o) {
		if(o instanceof Student ) {
			Student student=(Student) o;
			if(student.get_totalmarks()==this.totalmarks && student.get_name()==this.name && student.get_rollno()==this.rollno) {
				return true; 
			}
			else {
				return false;
			}
		}
		else{
			return false;
			}
		}
		}

