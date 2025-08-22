import java.util.Scanner;

public class user_input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning  " + name);
        System.out.println(name + "\nAlso tell me your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
    }
}