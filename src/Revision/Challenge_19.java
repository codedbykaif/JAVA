package Revision;
import java.util.Scanner;
public class Challenge_19 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that prints grades based on marks\n");
        System.out.print("Enter marks of sub 1: ");
        int sub1 = input.nextInt();
        System.out.print("Enter makrs of sub 2: ");
        int sub2 = input.nextInt();
        System.out.print("Enter makrs of sub 3: ");
        int sub3 = input.nextInt();
        System.out.print("Enter makrs of sub 4: ");
        int sub4 = input.nextInt();
        System.out.print("Enter makrs of sub 5: ");
        int sub5 = input.nextInt();
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (sum / 500.0f) * 100;
        if (percentage >= 90) {
            System.out.println("A" + " you got " + percentage + "%");
        } else if (percentage >= 75 && percentage < 89) {
            System.out.println("B" + " you got " + percentage + "%");
        } else if (percentage >= 60 && percentage < 74) {
            System.out.println("C" + " you got " + percentage + "%");
        } else if (percentage >= 30 && percentage < 59) {
            System.out.println("D" + " you got " + percentage + "%");
        } else if (percentage < 30) {
            System.out.println("F" + " you got " + percentage + "%");
        }
    }
}


