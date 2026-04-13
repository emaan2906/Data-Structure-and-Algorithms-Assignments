// NAME - EMAAN MOHSIN
// EB No. - EB25210006022

import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<String>();
        students.add("ALI");
        students.add("SARA");
        students.add("USMAN");
        students.add("FATIMA");
        students.add("BILAL");

        Scanner sc = new Scanner(System.in);

        // 1. Print Linked List
        System.out.println("1. Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("   [" + i + "] " + students.get(i));
        }

        // 2. Length of Linked List
        System.out.println("\n2. Total Students: " + students.size());

        // 3. Search a Student
        System.out.println("\n3. Enter student name to search:");
        String search = sc.nextLine();

        if (students.contains(search.toUpperCase())) {
            System.out.println("✔ " + search + " is FOUND in the list.");
        } else {
            System.out.println("✘ " + search + " is NOT found in the list.");
        }

        // 4. Add a New Student
        System.out.println("\n4. Enter a new student name to add:");
        String newStudent = sc.nextLine();
        students.add(newStudent.toUpperCase());
        System.out.println("✔ " + newStudent + " added successfully!");

        // 5. Print Updated List
        System.out.println("\n5. Updated Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("   [" + i + "] " + students.get(i));
        }

        System.out.println("\nFinal Total Students: " + students.size());

        sc.close();
    }
}
