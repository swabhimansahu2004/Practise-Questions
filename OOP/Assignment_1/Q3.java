package Assignment_1;
public class Q3 {

	public static void main(String[] args) {
		Point obj1=new Point(1,2);
		Point obj2=new Point(3,4);
		System.out.println("Coordinates of The Point 1:");
		obj1.getData();
		System.out.println("Coordinates of The Point 2:");
		obj2.getData();
		obj1.setData(5,6);
		obj2.setData(7, 8);
		System.out.println("Updated Coordinates of The Point 1:");
		obj1.getData();
		System.out.println("Updated Coordinates of The Point 2:");
		obj2.getData();
	}

}
class Point{
	private int X;
	private int Y;
	public Point(int X,int Y) {
		this.X=X;
		this.Y=Y;
	}
	public Point(Point another) {
		this.X=X;
		this.Y=Y;
	}
	public void setData(int a,int b) {
		this.X=a;
		this.Y=b;
	}
	public void getData() {
		System.out.println("Coordinates of the point: ("+X+","+Y+")");
	}
}
