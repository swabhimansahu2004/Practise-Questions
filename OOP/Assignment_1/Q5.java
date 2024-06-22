package Assignment_1;

public class Q5 {
public static void main(String[]args) {
	College col1=new College("ITER","Khandagiri,BBSR");
	College col2=new College("KIIT","Patia,BBSR");
	Student stu1=new Student("AB0123","Ajay Nayak","ITER","Khandagiri,BBSR");
	Student stu2=new Student("CD4567","Manisha Pandey","KIIT","Patia,BBSR");
	System.out.println("Details of Student 1:");
	stu1.displayStudentInfo();
	System.out.println("Details of Student 2:");
	stu2.displayStudentInfo();
}
}
class College{
	public static String collegeName;
	public static String collegeLoc;
	public College(String a,String b){
		this.collegeName=a;
		this.collegeLoc=b;
	}
}
class Student extends College{
	public String studentId;
	public String studentName;
	public Student(String a,String b,String c,String d) {
		super(collegeName=c,collegeLoc=d);
		studentId=a;
		studentName=b;
	}
	public void displayStudentInfo() {
		System.out.println("\n"+"Student ID: "+studentId+"\n"+"Student Name: "+studentName+"\n"+"College Name: "+collegeName+"\n"+"College Location: "+collegeLoc+"\n");
	}
}
