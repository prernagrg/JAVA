
// Import classes for file handling
import java.io.*;

// Import Scanner class for user input
import java.util.Scanner;

// Main class
public class StudentFileStream {

    // Main method
    public static void main(String[] args) {

        // Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        try {
            /* ---------- WRITING DATA TO FILE ---------- */

            // Create FileOutputStream to create/open student.txt file
            FileOutputStream fos = new FileOutputStream("student.txt");

            // Convert byte stream into character stream
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            // BufferedWriter to write data efficiently
            BufferedWriter bw = new BufferedWriter(osw);

            // Loop to take details of 10 students
            for (int i = 1; i <= 10; i++) {

                // Display student number
                System.out.println("\nEnter details of student " + i);

                // Take student name
                System.out.print("Name: ");
                String name = sc.nextLine();

                // Take student class
                System.out.print("Class: ");
                String className = sc.nextLine();

                // Take student marks
                System.out.print("Marks: ");
                int marks = sc.nextInt();

                // Clear buffer after taking integer input
                sc.nextLine();

                // Write student data to file
                bw.write(name + " " + className + " " + marks);

                // Move cursor to new line in file
                bw.newLine();
            }

            // Close BufferedWriter and save data into file
            bw.close();

            /* ---------- READING DATA FROM FILE ---------- */

            // Create FileInputStream to read from student.txt file
            FileInputStream fis = new FileInputStream("student.txt");

            // Convert byte stream into character stream
            InputStreamReader isr = new InputStreamReader(fis);

            // BufferedReader to read data line by line
            BufferedReader br = new BufferedReader(isr);

            // Display heading
            System.out.println("\nStudents who secured 30 or more marks:");

            // Variable to store each line from file
            String line;

            // Read file line by line until end of file
            while ((line = br.readLine()) != null) {

                // Split line into name, class, and marks
                String[] data = line.split(" ");

                // Convert marks from String to integer
                int marks = Integer.parseInt(data[2]);

                // Check if marks are 30 or more
                if (marks >= 30) {

                    // Display eligible student details
                    System.out.println("Name: " + data[0] +
                            ", Class: " + data[1] +
                            ", Marks: " + marks);
                }
            }

            // Close BufferedReader
            br.close();

            // Close Scanner
            sc.close();

        } catch (IOException e) {
            // Handle file related errors
            System.out.println("File error: " + e.getMessage());
        }
    }
}
