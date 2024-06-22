import java.util.*;
public class Q17 {
	public static void main(String[]args) throws Exception{
		LinkedList<Integer>a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		int length=0;
		int z=10;
		try {
			for(int i:a) {
				length++;
			}
			if(length<z+1) {
				throw new ArrayIndexOutOfBoundsException("Array index out of bounds"); 
			}
			else {
				for(int j:a) {
					System.out.print(a.get(j)+" ");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e.getMessage());
		}
		}
	}

