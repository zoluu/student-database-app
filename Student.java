package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses = "";
    private int enrolYear;
    private String studentID;
    private double tuitionFee = 0;
    private static double costOfCourse = 600;
    private static int id = 1000;

    // Constructor: Ask user to enter name and year for each student
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student enrolment year: ");
        this.enrolYear = in.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastName + " " + enrolYear + " " + studentID);


    }
    // Assign 6-digit unique ID to student (first two numbers corresponds to enrolment year)
    private void setStudentID(){
        // Year + ID
        id++;
        this.studentID = String.valueOf(enrolYear).substring(2) + id;
    }

    // What courses has the student enrolled on?

    public void enrol() {
        // Get inside a loop, user hits Q
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionFee = tuitionFee + costOfCourse;
            } else { break; }
        } while ( 1 != 0 );
        //System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUITION FEES: £" + tuitionFee);
    }

    // View the balance
    public void viewBalance(){
        System.out.println("Your balance is: £" + tuitionFee);
    }

    // Pay tuition fee
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        Double payment = in.nextDouble();
        tuitionFee = tuitionFee - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }

    // Allow user to see the status of the student (name, ID, courses enrolled, balance)
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nEnrolment Year: " + enrolYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: £" + tuitionFee;
    }
}
