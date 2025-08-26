package Challenges;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table program: ");
        System.out.println("Enter your number to print table: ");
        int mul = input.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(mul + " x " + i + " = " + (mul * i));

        }

    }
}
