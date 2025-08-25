package whileLoop_methods_Arrays;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
//        int num = 1;                                // initialization
//        while( num <=10000){                             // condition
//            System.out.println("\t" +num);          // actual work
//            num = num + 1;                       //updating the condition
//        }
//        int count = 500 ;
//        while(count >= 200){
//            System.out.println(count);
//            count = count - 1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int i  = 0;
            while(i < 5){
                int inp = input.nextInt();
                System.out.println("the number is: " + inp);
                i = i + 1;
            }
        }
    }

