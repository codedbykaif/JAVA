package in.kgcoding;

public class accessTest {
    public static void main(String[] args){
         Car car = new Car();
         car.color = "red";
         car.model = "m5";
    //         car.costOfPurchase = 323;
        System.out.println(car);

        Car newCar = new Car("Black", "BMW", 1, 5000);
        System.out.println(newCar);
    }


}
