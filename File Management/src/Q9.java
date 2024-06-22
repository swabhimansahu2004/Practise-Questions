import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name with path: ");
        String fileName = scanner.nextLine();
        displayFileMetadata(fileName);
    }
    private static void displayFileMetadata(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Last Modified Date: " + formatDate(file.lastModified()));
        if (file.isFile()) {
            System.out.println("File Type: Regular File");
        } else if (file.isDirectory()) {
            System.out.println("File Type: Directory");
        }
        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writable: " + file.canWrite());
        System.out.println("Is Executable: " + file.canExecute());
    }
    private static String formatDate(long milliseconds) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(milliseconds));
    }
}
