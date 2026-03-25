class DefaultConstructor {
    String name;
    int age;
    
    DefaultConstructor() {
        name = "Unknown";
        age = 0;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}
