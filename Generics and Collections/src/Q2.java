
public class Q2 {

	public static void main(String[] args) {
		Book obj1=new Book("CD0912","Harry Potter",1234.56);
		Book obj2=new Book("null","null",0);
		obj2.set_bookName("Dumbledore");
		obj2.set_Price(1234.56);
		obj2.set_bookId("AD879");
		System.out.println(obj1);
		System.out.println();
		System.out.println(obj2);
		System.out.println();
		if(obj2.equals(obj1)) {
			System.out.println("Both have same price");
		}
	}

}
class Book{
	public String bookId;
	public String bookName;
	public double price;
	public Book(String a,String b,double c) {
		this.bookId=a;
		this.bookName=b;
		this.price=c;
	}
	public void set_bookId(String a){
		this.bookId=a;
	}
	public void set_bookName(String b){
		this.bookName=b;
	}
	public void set_Price(double c){
		this.price=c;
	}
	public String get_bookId() {
		return bookId;
	}
	public String get_bookName() {
		return bookName;
	}
	public double get_Price() {
		return price;
	}
	public String toString() {
		return bookId+" ; "+bookName+" ; "+price;
	}
	public boolean equals(Object o) {
		if(o instanceof Book) {
			Book book=(Book) o;
			if(book.get_Price()==this.price) {
				return true;
			}
			else {
			return false;
			}
		}
		else {
			return false;
		}
	}
}
