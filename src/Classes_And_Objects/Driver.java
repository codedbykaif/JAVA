package Classes_And_Objects;

public class Driver {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        System.out.println(myCar.getCurrentFuelLevel());
        Car swift = new Car("Red");




//        swift.addFuel(6);
       swift.start().drive();
        System.out.println(swift.color);
    }
}
