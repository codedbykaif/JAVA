package in.kgcoding;

public class Car {
    public String car;
    public String color;
    public String model;
    public double fuelLevel;
    private long costOfPurchase;

    public Car(String black, String bmw, int i, int i1){

    }


    public Car(String car, String color, String model, double fuelLevel, long costOfPurchase) {
        this.car = car;
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }




    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
