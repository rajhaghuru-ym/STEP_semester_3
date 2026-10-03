package class_problems;

public class StudentRecordParser {

    public void parseStudentRecord(String csvLine) {
        // Split the text by commas into an array
        String[] fields = csvLine.split(",");

        // Check if we got exactly 3 pieces of data
        if (fields.length == 3) {
            String name = fields[0];
            String rollNumber = fields[1];
            String department = fields[2];

            // Standard beginner string addition
            System.out.println("Name: " + name + " | Roll No: " + rollNumber + " | Dept: " + department);
        } else {
            System.out.println("Invalid Record");
        }
    }

    public static void main(String[] args) {
        StudentRecordParser parser = new StudentRecordParser();
        parser.parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parser.parseStudentRecord("Ananya Verma,CSE");
    }
}