package sda.mg.jz127.genericssample;

import sda.mg.jz127.interfacesample.Car;
import sda.mg.jz127.interfacesample.DefaultCar;

public class ArrayUtilMain {
    public static void main(String[] args) {
        String searchElement = "a";
        boolean result = ArrayUtil.isContainElement(searchElement, "b", "a", "c", "aa", "A", "z");
        System.out.println("Element " + searchElement + " znajduje sie w tablicy: " + result);


        Integer searchInt = 10;
        result = ArrayUtil.isContainElement(searchInt, 1,2,10,3,4,20,30,50);
        System.out.println("Element int " + searchInt + " znajduje sie w tablicy: " + result);

        Car searchCar = new DefaultCar();
        result = ArrayUtil.isContainElement(searchCar, new DefaultCar(), searchCar, new DefaultCar());
        System.out.println("Element car " + searchCar + " znajduje sie w tablicy: " + result);
    }
}
