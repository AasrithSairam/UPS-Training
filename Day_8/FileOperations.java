import java.io.*;

/**
 * File Operations in Java:
 * Demonstrates CRUD operations on files using:
 * - File (Create & Delete)
 * - FileWriter & BufferedWriter (Write)
 * - FileReader & BufferedReader (Read)
 * - PrintWriter (Append)
 * - String replacement (Edit content)
 */
public class FileOperations {

    // 1. Create a new file
    public static void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists: " + file.getName());
        }
    }

    // 2. Write to a file using FileWriter
    public static void writeToFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
        System.out.println("Successfully wrote to " + fileName + " using FileWriter.");
    }

    // 3. Write to a file using BufferedWriter (Efficient writing)
    public static void writeWithBufferedWriter(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(content);
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Successfully wrote to " + fileName + " using BufferedWriter.");
    }

    // 4. Append content to an existing file using PrintWriter
    public static void appendToFile(String fileName, String content) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
        writer.println(content);
        writer.close();
        System.out.println("Successfully appended to " + fileName + " using PrintWriter.");
    }

    // 5. Read from file using FileReader and BufferedReader (Efficient reading)
    public static String readFromFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        StringBuilder content = new StringBuilder();

        System.out.println("\n--- Reading Content from " + fileName + " ---");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            content.append(line).append("\n");
        }
        bufferedReader.close();
        reader.close();
        return content.toString();
    }

    // 6. Edit file content by replacing target text
    public static void editFile(String fileName, String targetWord, String replacementWord) throws IOException {
        FileReader reader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        StringBuilder content = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            content.append(line).append("\n");
        }
        bufferedReader.close();
        reader.close();

        // Replace occurrences of target word with replacement word
        String updatedContent = content.toString().replaceAll(targetWord, replacementWord);

        FileWriter writer = new FileWriter(fileName);
        writer.write(updatedContent);
        writer.close();
        System.out.println("Successfully edited " + fileName + ": replaced '" + targetWord + "' with '" + replacementWord + "'.");
    }

    // 7. Delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file: " + file.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        String testFile = "Akash.txt";

        System.out.println("=== 1. Create File ===");
        createFile(testFile);

        System.out.println("\n=== 2. Write to File ===");
        writeToFile(testFile, "Hello java developers! Welcome to java training.");

        System.out.println("\n=== 3. Append to File ===");
        appendToFile(testFile, "This is an appended line using PrintWriter.");

        System.out.println("\n=== 4. Read File ===");
        readFromFile(testFile);

        System.out.println("\n=== 5. Edit File (Replace 'java' with 'world') ===");
        editFile(testFile, "java", "world");

        System.out.println("\n=== 6. Read File After Edit ===");
        readFromFile(testFile);

        System.out.println("\n=== 7. Delete File ===");
        deleteFile(testFile);
    }
}
