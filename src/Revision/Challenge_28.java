package Revision;
import java.util.Scanner;
public class Challenge_28 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a progtam that prints multiplication table of given number\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "x " + i + " = " + (num*i));
        }

    }
}
