import java.io.*;

public class StudentDao {

    private final String FILE_NAME="students.txt";

    public void writeStudent(Student student) throws IOException{
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
        bw.write(student.getId()+","+student.getName());
        bw.newLine();
        bw.close();
        System.out.println("Student added successfully!");
    }

    public void readStudents() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("\n--- Student List ---");
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }
        br.close();
    }

    public void deleteStudent(int targetId) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
        String line;
        String keepData="";
        String searchId=targetId+""; 

        while ((line=br.readLine()) != null) {
            if (line.startsWith(searchId) == false) {
                keepData=keepData+line+"\n";
            }
        }
        br.close();

        BufferedWriter bw=new BufferedWriter(new FileWriter(FILE_NAME));
        bw.write(keepData);
        bw.close();

        System.out.println("delete process finished.");
    }
}