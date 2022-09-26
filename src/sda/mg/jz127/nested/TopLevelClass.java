package sda.mg.jz127.nested;

public class TopLevelClass {
    private int a;


    public static class StaticNestedClass {
        private int nestedValue;

        public void printValue() {
            //Nie mamy dostępu do pól klasy nadrzędnej (TopLevelClass)
//            nestedValue = a;
            System.out.println(nestedValue);
        }
    }

    private class NestedInnerClass {
        private int nestedValue;

        public void printValue() {
            nestedValue = a;
            System.out.println(nestedValue);
        }
    }

    public void test() {
        StaticNestedClass staticNestedClassObj = new StaticNestedClass();
        NestedInnerClass nestedInnerClassObj = new NestedInnerClass();

        class InnerMethodClass {
            private int nestedValue;

            public void printValue() {

                System.out.println(nestedValue);
            }
        }

        InnerMethodClass innerMethodClassObj = new InnerMethodClass();
        innerMethodClassObj.printValue();

        staticNestedClassObj.printValue();
        a = 10;
        nestedInnerClassObj.printValue();


        NestedInnerClass anonymous = new NestedInnerClass() {
            @Override
            public void printValue() {
                System.out.println("Klasa anonimowa :)");
            }
        }; // to wymaga średnika ponieważ tworzymy obiekt na podstawie definicji klasy którą też tworzymy.

        NestedInnerClass anonymous2 = new NestedInnerClass() {
            @Override
            public void printValue() {
                System.out.println("Klasa anonimowa :)");
            }
        };

        anonymous.printValue();

    }

}
