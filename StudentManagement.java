import java.util.ArrayList;
import java.util.Scanner;

interface Department {
    String getDeptName();
    String getDeptHead();
    void printDepartment();
}

class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostel() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;
    private String deptName;
    private String deptHead;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();
        getHostelData(sc);
        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
        System.out.print("Enter Department Head: ");
        deptHead = sc.nextLine();
    }

    void printData() {
        System.out.println("\n===== Student Details =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostel();
        printDepartment();
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void printDepartment() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    String getRegdNo() {
        return regdNo;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    students.add(s);
                    System.out.println("Student admitted successfully!");
                    break;
                case 2:
                    System.out.print("Enter Registration Number to Migrate: ");
                    String regdNo = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getRegdNo().equals(regdNo)) {
                            students.remove(i);
                            System.out.println("Student migrated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Registration Number: ");
                    regdNo = sc.nextLine();
                    found = false;
                    for (Student st : students) {
                        if (st.getRegdNo().equals(regdNo)) {
                            st.printData();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
