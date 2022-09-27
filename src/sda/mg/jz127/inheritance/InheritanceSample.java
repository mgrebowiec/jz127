package sda.mg.jz127.inheritance;

public class InheritanceSample {

    class A {
        void hello() {
            System.out.println("A::hello");
        }
    }

    class B extends A {
        void blink() {
            System.out.println("B::blink");
        }
    }

    void runExample() {
        A a = new A();
        a.hello();

        B b = new B();
        b.hello();
        b.blink();
    }

    public static void main(String[] args) {
        InheritanceSample sample = new InheritanceSample();
        sample.runExample();
    }

}
