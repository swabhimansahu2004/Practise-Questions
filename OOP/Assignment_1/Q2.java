package Assignment_1;
class Rectangle{
	private double length;
	private double width;
	private double area;
	private double perimeter;
	public Rectangle(Double a,Double b){
		length=a;
		width=b;
	}
	public void setData(Double a,Double b) {
		this.length=a;
		this.width=b;
	}
	public void calculateArea() {
		area=length*width;
	}
	public void calculatePerimeter() {
		perimeter=2*(length+width);
	}
	public void getData() {
		calculateArea();
		calculatePerimeter();
		System.out.println("Length: "+length+" ; width: "+width+" ; Area: "+area+" ; Perimeter: "+perimeter);
	}
}
public class Q2{
	public static void main(String[]args) {
		Rectangle obj1=new Rectangle(12.2,13.3);
		System.out.println("Initial Data of Rectangle:");
		obj1.getData();
		obj1.setData(14.44, 16.66);
		System.out.println("New Data of Rectangle:");
		obj1.getData();
	}
}