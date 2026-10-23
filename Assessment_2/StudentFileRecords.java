import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileRecords {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
            bw.write("101,Aasrith,94");
            bw.newLine();
            bw.write("102,Rohith,85");
            bw.newLine();
            bw.write("103,Senthil,78");
            bw.newLine();
            bw.write("104,Vijay,98");
            bw.newLine();
            bw.write("105,Pooja,88");
            bw.newLine();
            bw.close();
            System.out.println("Written 5 initial student records to " + FILE_NAME);

            BufferedWriter appendWriter = new BufferedWriter(new FileWriter(FILE_NAME, true));
            appendWriter.write("106,Sneha,91");
            appendWriter.newLine();
            appendWriter.close();
            System.out.println("Appended new student (106,Sneha,91) to " + FILE_NAME);

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            String topStudentName = "";
            int topStudentId = 0;
            int maxMarks = -1;

            System.out.println("\n--- All Student Records from File ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int marks = Integer.parseInt(parts[2].trim());

                    if (marks > maxMarks) {
                        maxMarks = marks;
                        topStudentName = name;
                        topStudentId = id;
                    }
                }
            }
            br.close();

            System.out.println("\n--- Topper Information ---");
            System.out.println("Highest Scorer: " + topStudentName + " (ID: " + topStudentId + ") with " + maxMarks + " marks.");

        } catch (IOException e) {
            System.out.println("File I/O Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Data Parsing Error: " + e.getMessage());
        }
    }
}
