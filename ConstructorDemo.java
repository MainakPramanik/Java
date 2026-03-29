class ConstructorDemo {
    String name;
    int id;
    double salary;

    ConstructorDemo() {
        name = "Unknown";
        id = 0;
        salary = 0;
    }

    ConstructorDemo(String n) {
        name = n;
        id = 0;
        salary = 0;
    }

    ConstructorDemo(String n, int i) {
        name = n;
        id = i;
        salary = 0;
    }

    ConstructorDemo(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo();
        ConstructorDemo c2 = new ConstructorDemo("John");
        ConstructorDemo c3 = new ConstructorDemo("Alice", 101);
        ConstructorDemo c4 = new ConstructorDemo("Bob", 102, 50000);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}
