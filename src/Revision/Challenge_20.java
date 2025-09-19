package Revision;
import java.util.Scanner;
public class Challenge_20 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that categorize person into different age groups\n");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age > 0 && age < 13){
            System.out.println("The user is CHILD");
        }
        else if(age > 13 && age <20){
            System.out.println("The user is TEEN");
        }
        else if(age > 20 && age <60){
            System.out.println("The user is ADULT");
        }
        else if(age >60 && age < 100){
            System.out.println("The user is SENIOR");
        }

    }
}
