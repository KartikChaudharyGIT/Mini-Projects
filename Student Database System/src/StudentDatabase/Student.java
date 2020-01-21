package StudentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses = "";
    private int gradeYear;
    private String studentID;
    private int tuitionBalance = 0;
    private static int id = 1000;

    // Constructor prompts user to enter name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's First name:");
        this.firstName = in.nextLine();

        System.out.println("Enter Student's Last name:");
        this.lastName = in.nextLine();

        System.out.println("1 - FreshMen\n2- Sophmore\n3 - Junior\n4 - Senior Enter Student's Grade year:");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    // Generate Id

    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course number to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n " + course;
                int costOfCourse = 600;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }
        while (1 != 0);
    }

    // View balance
    public void ViewBalance() {
        System.out.println("Your Balance is: $" + tuitionBalance);

    }

    // Pay tuition
    public void pay() {
        ViewBalance();
        System.out.println("Enter your Payment:");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You for your payment: " + payment);
        System.out.println("YOUR BALANCE: " + tuitionBalance);

    }

    // Show Status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Year: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nYour balance is: $" + tuitionBalance;

    }
}
