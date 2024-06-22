package Assignment_1;
public class Main {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		obj1.setModel("ASUS TUF");
		obj1.setPrice(60000);
		System.out.println(obj1.toString());

	}

}
class Laptop{
	private String Model;
	private double  Price;
	public void setModel(String model) {
		this.Model=model;
	}
	public void setPrice(int price) {
		this.Price=price;
	}
	public String toString() {
		return ("Model: "+Model+" ;Price: "+Price);
	}
}
