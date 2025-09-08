package Challenges;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that prints absolute value of a given integer number\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int abs = (num < 0) ? -num: num;
        System.out.println("The absolute value of " + num + " is " + abs);

    }
}
