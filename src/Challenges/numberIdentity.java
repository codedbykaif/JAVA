import java.util.Scanner;

public class numberIdentity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number identifier program");
        System.out.println("Enter your number to check: ");
        int number = input.nextInt();

        if(number>0){
            System.out.println("The entered number is positive ");
        }
            else if(number <0){
            System.out.println("The enterd number is negative ");
        }
            else if(number == 0) {
            System.out.println("The entered number is zero");
        }

    }
}
