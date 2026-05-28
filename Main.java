package swapna.com;
import java.util.Scanner;
import java.util.ArrayList;

class Student {

    int id;
    String name;
    int marks;
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Student s = new Student();

                    System.out.print("Enter ID: ");
                    s.id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    s.name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    s.marks = sc.nextInt();

                    students.add(s);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No Students Found!");

                    } else {

                        for (Student stu : students) {

                            System.out.println("------------------");
                            System.out.println("ID: " + stu.id);
                            System.out.println("Name: " + stu.name);
                            System.out.println("Marks: " + stu.marks);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student stu : students) {

                        if (stu.id == searchId) {

                            System.out.println("------------------");
                            System.out.println("ID: " + stu.id);
                            System.out.println("Name: " + stu.name);
                            System.out.println("Marks: " + stu.marks);

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (Student stu : students) {

                        if (stu.id == deleteId) {

                            students.remove(stu);

                            removed = true;

                            System.out.println("Student Deleted Successfully!");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID to Update Marks: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Student stu : students) {

                        if (stu.id == updateId) {

                            System.out.print("Enter New Marks: ");
                            stu.marks = sc.nextInt();

                            updated = true;

                            System.out.println("Marks Updated Successfully!");
                        }
                    }

                    if (!updated) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 6:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}