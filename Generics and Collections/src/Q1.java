
public class Q1 {

	public static void main(String[] args) {
		Student<Integer> obj1=new Student();
		obj1.getName("Janvi");
		obj1.getAge(20);
		obj1.getRollNumber(224101010);
		obj1.displayDetails();
		Student<String> obj2=new Student();
		obj2.getName("Abhilasa");
		obj2.getAge(20);
		obj2.getRollNumber("224101010");
		obj2.displayDetails();
	}

}
class Student<T>{
	public String Name;
	public int Age;
	public T Roll_Number;
	public void getName(String a) {
		this.Name=a;
		}
	public void getAge(int b) {
		this.Age=b;	
		}
	public void getRollNumber(T a) {
		this.Roll_Number=a;	
		}
	public void displayDetails() {
		System.out.println("Name is: "+Name+" ; Roll Number is: "+Roll_Number+" ; Age is: "+Age);
	}
}
