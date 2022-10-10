package sda.mg.jz127.genericssample;

public class DriverMain {
    public static void main(String[] args) {
        Driver<String> stringDriver = new Driver<String>() {
            @Override
            public void drive(String vehicle) {
                System.out.println("Drive " + vehicle);
            }
        };

        stringDriver.drive("sample");
    }
}
