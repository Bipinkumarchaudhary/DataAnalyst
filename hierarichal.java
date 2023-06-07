public class A {
    int a = 10;

    void display() {
        System.out.println("A");
    }

}

public class B extends A {
    int b = 30;

    void show() {
        System.out.println("B");

    }
}

public class C extends A {
    int c = 40;

    void dis() {
        System.out.println("C");

    }
}

public class Hierarchy {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.dis();
        obj1.display();
        B obj2 = new B();
        obj2.show();
        obj2.display();
    }
}
