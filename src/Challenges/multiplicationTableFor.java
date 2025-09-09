package Challenges;
import java.util.Scanner;
public class multiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to table printing program\n");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        for(int i=1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }


    }
}
