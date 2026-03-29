class Parent {
    void display() {
        System.out.println("Parent class display()");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display()");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.display();

        Parent obj = new Child();
        obj.display();
    }
}
