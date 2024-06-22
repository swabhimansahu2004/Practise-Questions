package CSW_Assignement2;
import java.util.Scanner;

public class Q5 {
	public static void main(String[]args) {
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
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(array[i].compareTo(array[j])) {
					Student temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Name of Students in Sorted Order is: ");
		for(int k=0;k<n;k++) {
			System.out.println(array[k].name+" ; "+array[k].rollno+" ; "+array[k].totalmarks);
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
			if(student.get_totalmarks()>this.totalmarks) {
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
