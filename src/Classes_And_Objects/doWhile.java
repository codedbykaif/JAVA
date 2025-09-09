package Classes_And_Objects;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        while(age < 0 || age > 100){
            System.out.print("Please emter your correct age: ");
            age = input.nextInt();
        }
        System.out.println("Your age is " + age);

    }
}
