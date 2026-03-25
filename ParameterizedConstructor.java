class ParameterizedConstructor {
    String name;
    int age;
    
    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("John", 25);
        obj.display();
    }
}
