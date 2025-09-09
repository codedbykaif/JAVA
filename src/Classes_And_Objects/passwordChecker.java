package Classes_And_Objects;
import java.util.Scanner;
public class passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker\n");
        String password;
        do {
            System.out.println("Please enter your password: ");
            password = input.next();
        } while(!isValidPassword(password));
        System.out.println("Correct password, Acess granted");



        }
        public static boolean isValidPassword(String password){
        return password.length() > 6;
        }

}
