public class OuterClass {
    private int outerVariable = 10;
    
    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
            System.out.println("Outer variable: " + outerVariable);
        }
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
