package Assignment_1;
public class Q6 {
public static void main(String[]args) {
	Book book1=new Book("Harry Potter","J.K.Rowling",100);
	Magazine mag1=new Magazine("Better Photography","Krishna Madhavan Pillai","10th November 2023");
	DVD dvd1=new DVD("CBSE Education DVD","Rama Shankar",1000);
	book1.displayDetails();
	mag1.displayDetails();
	dvd1.displayDetails();
}
}
abstract class LibraryResource{
	public static String Title;
	public static String Author;
	public LibraryResource(String a,String b){
		this.Title=a;
		this.Author=b;
	}
	public void setData(String a,String b) {
		this.Title=a;
		this.Author=b;
	}
	public void getData() {
		System.out.println("Title: "+Title+" ; Author: "+Author);
	}
	public abstract void displayDetails();
}
class Book extends LibraryResource{
	public int pageCount;
	public Book(String a,String b,int c){
		super(Title=a,Author=b);
		this.pageCount=c;
	}
	public void setData(String a,String b,int c) {
		this.Title=a;
		this.Author=b;
		this.pageCount=c;
	}
	public void getData() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Page Count: "+pageCount);
	}
	public void displayDetails() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Page Count: "+pageCount);
	}
}
class Magazine extends LibraryResource{
	public String issueDate;
	public Magazine(String a,String b,String c){
		super(Title=a,Author=b);
		this.issueDate=c;
	}
	public void setData(String a,String b,String c) {
		this.Title=a;
		this.Author=b;
		this.issueDate=c;
	}
	public void getData() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Issue Date: "+issueDate);
	}
	public void displayDetails() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Issue Date: "+issueDate);
	}
}
class DVD extends LibraryResource{
	public int Duration;
	public DVD(String a,String b,int c){
		super(Title=a,Author=b);
		this.Duration=c;
	}
	public void setData(String a,String b,int c) {
		this.Title=a;
		this.Author=b;
		this.Duration=c;
	}
	public void getData() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Duration(in minutes): "+Duration);
	}
	public void displayDetails() {
		System.out.println("Title: "+Title+" ; Author: "+Author+" ; Duration(in minutes): "+Duration);
	}
}