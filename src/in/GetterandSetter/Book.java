package in.GetterandSetter;

public class Book {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Book(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

}
