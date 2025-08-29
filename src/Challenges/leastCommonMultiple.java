import java.util.Scanner;

     public class leastCommonMultiple{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Function to calculate GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
