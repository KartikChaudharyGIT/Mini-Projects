package StudentDatabase;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        // Ask how many students we want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int noOfStudents = in.nextInt();
        Student[] students = new Student[noOfStudents];

        // Create n number of new students
        {
            for (int n = 0; n < noOfStudents; n++) {
                students[n] = new Student();
                students[n].enroll();
                students[n].pay();
            }

            for (int n = 0; n < noOfStudents; n++) {

                System.out.println(students[n].toString() + "\n-----------------------------------------");
            }
        }
    }
}
