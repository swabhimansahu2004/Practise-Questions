import java.io.File;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current file name: ");
        String currentFileName = scanner.nextLine();
        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();
        boolean success = renameFile(currentFileName, newFileName);
        if (success) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
    private static boolean renameFile(String currentFileName, String newFileName) {
        File file = new File(currentFileName);
        File newFile = new File(newFileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return false;
        }
        if (newFile.exists()) {
            System.out.println("A file with the new name already exists.");
            return false;
        }
        if (file.renameTo(newFile)) {
            return true;
        } else {
            System.out.println("Failed to rename the file.");
            return false;
        }
    }
}
