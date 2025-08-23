import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args) {
//        simple intrest = (P * T * R)/ 100
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple intrest calculator: ");
        System.out.println("Please enter your principle amount: ");
        double principle = input.nextDouble();
        System.out.println("Enter your intrest rate: ");
        double rate = input.nextDouble();
        System.out.println("Enter time in year: ");
        double year = input.nextDouble();

        double intrest = (principle * rate * year) / 100;
        System.out.println("\n\n your simple intrest is: " + intrest);
        System.out.println("\n Your total amount including intrest and principle amount is: " + (principle+intrest));
    }
}