/**
 * Task 10: Jagged array marks calculation (With Functions)
 */
public class JaggedArrayMarks {

    // Function to calculate total marks for an individual student
    public static int calculateStudentTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Function to calculate average percentage for an individual student
    public static double calculateStudentAverage(int[] marks) {
        if (marks.length == 0) {
            return 0.0;
        }
        return (double) calculateStudentTotal(marks) / marks.length;
    }

    // Function to calculate overall class grand total across all students
    public static int calculateGrandTotal(int[][] allMarks) {
        int grandTotal = 0;
        for (int[] studentMarks : allMarks) {
            grandTotal += calculateStudentTotal(studentMarks);
        }
        return grandTotal;
    }

    // Function to print a detailed tabular marks report
    public static void displayReport(int[][] allMarks) {
        System.out.println("======================================================================");
        System.out.println("                 JAGGED ARRAY STUDENT MARKS REPORT                    ");
        System.out.println("======================================================================");
        System.out.printf("%-12s | %-24s | %-8s | %-10s\n", "Student", "Subject Marks", "Total", "Average");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < allMarks.length; i++) {
            StringBuilder marksStr = new StringBuilder();
            for (int m = 0; m < allMarks[i].length; m++) {
                marksStr.append(allMarks[i][m]);
                if (m < allMarks[i].length - 1) {
                    marksStr.append(", ");
                }
            }

            int total = calculateStudentTotal(allMarks[i]);
            double avg = calculateStudentAverage(allMarks[i]);

            System.out.printf("Student %-4d | %-24s | %-8d | %-10.2f%%\n", 
                (i + 1), marksStr.toString(), total, avg);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Total Students: " + allMarks.length);
        System.out.println("Class Grand Total Marks: " + calculateGrandTotal(allMarks));
        System.out.println("======================================================================");
    }

    public static void main(String[] args) {
        // Jagged array: each row represents a student with different number of subject marks
        int[][] studentMarks = {
            {85, 90, 78},             // Student 1: 3 subjects
            {72, 88, 91, 65},         // Student 2: 4 subjects
            {95, 98},                 // Student 3: 2 subjects
            {60, 75, 82, 70, 89}      // Student 4: 5 subjects
        };

        displayReport(studentMarks);
    }
}
