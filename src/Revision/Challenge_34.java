package Revision;
import java.util.Scanner;
public class Challenge_34 {
    static void main(String[] args) {
        System.out.println("Writting a program that shows whether the entered number is prime or not\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        boolean isPrime = true;
        if(num <=1){
            isPrime = false;

        } else{
            for(int i =2; i <= Math.sqrt(num); i++){
                if(num %i== 0 ){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number1");
        }




    }
}
