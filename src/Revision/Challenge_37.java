import java.util.Scanner;

public class Challenge_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num; // store for comparison later

        // Step 1: Count digits
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Step 2 & 3: Calculate sum of digits^digits
        int sum = 0;
        temp = num; // reset temp
        while (temp > 0) {
            int digit = temp % 10; // extract last digit
            sum += Math.pow(digit, digits); // add digit^digits
            temp /= 10; // remove last digit
        }

        // Step 4: Check Armstrong
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
