package Assignemnt1;
public class Q8 {
	public static void main(String[]args) {
	CAR car1=new CAR();
	Bicycle bi1=new Bicycle();
	car1.accelarate();
	car1.accelarate(90);
	car1.accelarate(10.5);
	car1.brake();
	System.out.println();
	bi1.accelarate();
	bi1.accelarate(20);
	bi1.accelarate(6.6);
	bi1.brake();
	}
}
interface Vehicle{
	abstract public void accelarate();
	abstract public void brake();
}
class CAR implements Vehicle{
	public void accelarate() {
		System.out.println("Car is Accelarating");
	}
	public void accelarate(int speed) {
		System.out.println("Speed of the Car (in km/hr) is: "+speed);
	}
	public void accelarate(double duration) {
		System.out.println("Duration of accelaration of the Car (in minutes) is: "+duration);
	}
	public void brake() {
		System.out.println("Brake is being applied on car");
	}
}
class Bicycle implements Vehicle{
	public void accelarate() {
		System.out.println("Bicycle is Accelarating");
	}
	public void accelarate(int speed) {
		System.out.println("Speed of the Bicycle (in km/hr) is: "+speed);
	}
	public void accelarate(double duration) {
		System.out.println("Duration of accelaration of the Bicycle (in minutes) is: "+duration);
	}
	public void brake() {
		System.out.println("Brake is being applied on bicycle");
	}
}