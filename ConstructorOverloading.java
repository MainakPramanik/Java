class ConstructorOverloading {
    String name;
    int age;
    double salary;
    
    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
        salary = 0.0;
    }
    
    ConstructorOverloading(String n) {
        name = n;
        age = 0;
        salary = 0.0;
    }
    
    ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
        salary = 0.0;
    }
    
    ConstructorOverloading(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
    
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Alice");
        ConstructorOverloading obj3 = new ConstructorOverloading("Bob", 30);
        ConstructorOverloading obj4 = new ConstructorOverloading("Charlie", 35, 50000.0);
        
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
