
public class Q3 {
	public static void main(String[] args) {
		Car obj1=new Car("Harrier","Black",250.00);
		Car obj2=new Car("null","null",0);
		obj2.set_model("Scorpio");
		obj2.set_speed(200.00);
		obj2.set_color("Grey");
		obj1.displayDetails();
		System.out.println();
		obj2.displayDetails();
		System.out.println();
		if(obj2.compareTo(obj1)==1) {
			System.out.println(obj1.model+" has greater speed than "+obj2.model);
		}
		else if(obj2.compareTo(obj1)==2) {
			System.out.println(obj1.model+" has less speed than "+obj2.model);
		}
		else if(obj2.compareTo(obj1)==3) {
			System.out.println(obj1.model+" has equal speed as "+obj2.model);
		}
		else {
			System.out.println("Invaid Comparison");
		}
}
}
class Car{
	public String model;
	public String color;
	public double speed;
	public Car(String a,String b,double c) {
		this.model=a;
		this.color=b;
		this.speed=c;
	}
	public void set_model(String a){
		this.model=a;
	}
	public void set_color(String b){
		this.color=b;
	}
	public void set_speed(double c){
		this.speed=c;
	}
	public String get_model() {
		return model;
	}
	public String get_color() {
		return color;
	}
	public double get_speed() {
		return speed;
	}
	public void displayDetails() {
		System.out.println(model+" ; "+color+" ; "+speed);
	}
	public int compareTo(Object o) {
		if(o instanceof Car ) {
			Car car=(Car) o;
			if(car.get_speed()>this.speed) {
				return 1; 
			}
			else if(car.get_speed()<this.speed) {
				return 2;
			}
			else {
				return 3;
			}
		}
		else {
			return 0;
		}
		
	}
}
