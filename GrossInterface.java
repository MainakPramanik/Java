interface Gross {
    double calculateGross();
}

class Employee {
    private String empName;
    private int empId;

    Employee(String name, int id) {
        this.empName = name;
        this.empId = id;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }

    String getEmpName() {
        return empName;
    }

    int getEmpId() {
        return empId;
    }
}

class Salary extends Employee implements Gross {
    private double basicSalary;
    private double hra;
    private double da;
    private double ta;

    Salary(String name, int id, double basic) {
        super(name, id);
        this.basicSalary = basic;
        this.hra = basic * 0.20;
        this.da = basic * 0.10;
        this.ta = basic * 0.05;
    }

    public double calculateGross() {
        return basicSalary + hra + da + ta;
    }

    void displaySalaryDetails() {
        System.out.println("Basic Salary: Rs." + basicSalary);
        System.out.println("HRA (20%): Rs." + hra);
        System.out.println("DA (10%): Rs." + da);
        System.out.println("TA (5%): Rs." + ta);
        System.out.println("Gross Salary: Rs." + calculateGross());
    }

    public static void main(String[] args) {
        Salary sal = new Salary("John Doe", 101, 50000);
        System.out.println("===== Employee Salary Details =====");
        sal.displayEmployee();
        sal.displaySalaryDetails();
    }
}
