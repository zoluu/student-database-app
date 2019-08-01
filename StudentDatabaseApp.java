package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask user how many new students will be added to the database
        System.out.print("Enter number of new students to enrol: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enrol();
            students[n].payTuition();
        }

        // Print new student details out
        for(int n = 0; n < numOfStudents; n++){
            System.out.println(students[n].toString());
        }

    }
}
