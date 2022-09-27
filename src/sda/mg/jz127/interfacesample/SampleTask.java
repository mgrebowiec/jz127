package sda.mg.jz127.interfacesample;

public class SampleTask {

    interface Root {
        void rootMethod();
    }

    abstract class A implements Root {
        abstract void methodA();

        public void rootMethod() {
            System.out.println("Klasa A::rootMethod");
        }
    }

    class B extends A {
        @Override
        void methodA() {
            System.out.println("Klasa B::methodA");
        }

        @Override
        public void rootMethod() {
            System.out.println("Klasa B::rootMethod");
        }
    }

    class C extends A {
        @Override
        void methodA() {
            System.out.println("klasa C::methodA");
        }

    }
    void runExample() {
        A obj = new B();
        obj.methodA();
        obj.rootMethod();

        A objC = new C();
        objC.methodA();
        objC.rootMethod();
    }

    public static void main(String[] args) {
        SampleTask sampleTask = new SampleTask();
        sampleTask.runExample();
    }

}
