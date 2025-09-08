package Challenges;
import java.util.Scanner;
public class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that tells wheter the given number is odd or even");
        System.out.println("Enter your nunmber");
        int num = input.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is " + result);
    }
}
