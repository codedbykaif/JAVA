import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Program to find area of triangel \n");
        System.out.println("Enter your base in cm: ");
        double base = input.nextDouble();
        System.out.println("Enter your height in cm: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of triangle is: " + area);


    }
}
