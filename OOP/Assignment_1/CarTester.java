package Assignment_1;

class Car{
	private String make;
	private String model;
	public Car(String a,String b){
		make=a;
		model=b;
	}
	public void setData(String a,String b) {
		this.make=a;
		this.model=b;
	}
	public void getData() {
		System.out.println("Make: "+make+" ; Model: "+model);
	}
}
public class CarTester{
	public static void main(String[]args) {
		Car myCar1=new Car("Mahindra","Thar");
		Car myCar2=new Car(null,null);
		System.out.println("Initial Make and Model of Car 1 is:");
		myCar1.getData();
		System.out.println("Initial Make and Model of Car 2 is:");
		myCar2.getData();
		myCar2.setData("TATA","Harrier");
		System.out.println("Updated Make and Model of Car 2 is:");
		myCar2.getData();
	}
}