package Challenges;
import java.util.Scanner;
public class studentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that shows the score of students");
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is " + category);

    }
}
