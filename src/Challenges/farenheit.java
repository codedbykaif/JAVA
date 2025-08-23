import java.util.Scanner;
public class farenheit {
    public static void main(String[] args) {
//        cel = (F - 32 ) * 5 / 9
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to temprature convertor");
        System.out.println("Enter your temp in fahrenheit (F): ");
        float F = input.nextFloat();
        float cel = ( F - 32) * 5 / 9;
        System.out.println("\n Your temprature in celcius is: " + cel);
    }
}
