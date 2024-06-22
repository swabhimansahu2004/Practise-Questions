import java.util.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class test {
	public static final int part=4;
	public static final String path="largeFile.txt";
    public static void main(String[] args) throws FileNotFoundException {
       List<String>al=new ArrayList<String>();
       BufferedReader r=new BufferedReader(new FileReader(path));
       Scanner scnr=new Scanner(r);
       while(scnr.hasNextLine()) {
    	   String s=scnr.nextLine();
    	   al.add(s);
       }
       ExecutorService executor=Executors.newFixedThreadPool(part);
       for(String a:al) {
    	   executor.submit(new imgPro(a));
       }
       executor.shutdown();
       }
    static class imgPro implements Runnable{
    	String a;
    	imgPro(String a){
    		this.a=a;
    	}
    	public void run() {
    		process(a);
    	}
    }
    public static void process(String a) {
    	String arrs[]=a.split(" ");
    	int count=arrs.length;
    	System.out.println(a+" has "+count+" words.");
    }
}
