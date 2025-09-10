package Challenges;
import java.util.Scanner;
public class exitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your command: ");
            String command = input.next();
            if (command == "exit"){
                break;

            }
            System.out.println("You have sucessfully exited");
        }

    }
}
