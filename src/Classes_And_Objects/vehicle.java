package Classes_And_Objects;

public class vehicle {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public vehicle(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args){
        vehicle M5 = new vehicle(4, 2,700,"ferrari", "M5", "Car crasher" );
        System.out.println(M5.toString());

    }
    }

