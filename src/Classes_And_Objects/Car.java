package Classes_And_Objects;

public class Car {
    // INSTANCE VARIABLES
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSheets;

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSheets = 5;
    }

    public Car() {

    }

    public Car start(){
        if(currentFuelInLitres <= 0){
            System.out.println("Car is out of fuel, cannot start");
        } else if(currentFuelInLitres < 5){
            System.out.println("Car is in reserved mode, please refuel");
        } else{
            System.out.println("Car is driving, bruhhhhh....");
        }
        return this;
    }

    public void drive(){
        currentFuelInLitres--;
        System.out.println("Car is started");
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I am in finalize");
    }
}
