package Revision;
import java.util.Scanner;
public class Challenge_14 {
    public static void main(String[] args) {
        System.out.println("Showing a program that converts temprature farenheit to celcius\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your temprature in farenheit: ");
        float tempInFaren = input.nextFloat();
        float celcius = (tempInFaren - 32)*(5.0f/9);
        System.out.println("The temprature in celcius is: "+ celcius);

    }
}