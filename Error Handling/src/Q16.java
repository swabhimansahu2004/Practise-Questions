public class Q16 {
	public static void main(String[]args) {
		int n=5;
		int a[]= {1,2,3,4,5};
		try {
			if(a.length<n+1) {
			throw new ArrayIndexOutOfBoundsException("Length of array is less than the number of Iterations"); 
		}
			else {
			for(int i=0;i<=6;i++) {
				System.out.print(a[i]+" ");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
 