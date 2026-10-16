import java.io.File;
import java.io.IOException;

/**
 * File Metadata Exploration in Java:
 * Demonstrates inspecting file properties using java.io.File methods:
 * - getName()
 * - getAbsolutePath()
 * - length()
 * - exists()
 * - canRead()
 * - canWrite()
 * - isFile()
 * - isDirectory()
 */
public class FileMetadata {

    public static void printFileDetails(File file) {
        System.out.println("=========================================");
        System.out.println("         FILE METADATA INSPECTION        ");
        System.out.println("=========================================");
        System.out.println("File Name:        " + file.getName());
        System.out.println("Absolute Path:    " + file.getAbsolutePath());
        System.out.println("Exists:           " + file.exists());
        System.out.println("File Size (bytes):" + file.length());
        System.out.println("Can Read:         " + file.canRead());
        System.out.println("Can Write:        " + file.canWrite());
        System.out.println("Is Normal File:   " + file.isFile());
        System.out.println("Is Directory:     " + file.isDirectory());
        System.out.println("=========================================");
    }

    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        File file = new File(fileName);

        // Ensure the sample file exists for demonstration
        if (!file.exists()) {
            file.createNewFile();
        }

        printFileDetails(file);

        // Cleanup temporary test file
        file.delete();
    }
}
