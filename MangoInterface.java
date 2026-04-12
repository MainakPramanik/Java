interface Mango {
    void mangoType();
    void mangoColor();
}

class Winter implements Mango {
    public void mangoType() {
        System.out.println("Winter Mango: Dasheri");
    }

    public void mangoColor() {
        System.out.println("Color: Yellow-Green");
    }

    void display() {
        System.out.println("This is a Winter Mango variety.");
    }
}

class Summer implements Mango {
    public void mangoType() {
        System.out.println("Summer Mango: Alphonso");
    }

    public void mangoColor() {
        System.out.println("Color: Golden-Yellow");
    }

    void display() {
        System.out.println("This is a Summer Mango variety.");
    }
}

public class MangoInterface {
    public static void main(String[] args) {
        System.out.println("===== Winter Mango =====");
        Winter w = new Winter();
        w.mangoType();
        w.mangoColor();
        w.display();

        System.out.println("\n===== Summer Mango =====");
        Summer s = new Summer();
        s.mangoType();
        s.mangoColor();
        s.display();
    }
}
