import java.io.File;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        listDirectoryContents(new File(directoryPath));}
    private static void listDirectoryContents(File directory) {
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;}
        if (!directory.isDirectory()) {
            System.out.println("Not a directory.");
            return;}
        listContentsRecursively(directory, 0);}
    private static void listContentsRecursively(File directory, int depth) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");}
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listContentsRecursively(file, depth + 1);}}}}}