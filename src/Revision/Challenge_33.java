package Revision;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Challenge_33 {

    public static int HCF(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;

    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int result = HCF(num1,num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + result);




    }
}
