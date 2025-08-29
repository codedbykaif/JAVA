package whileLoop_methods_Arrays;


import java.util.Scanner;
public class searchingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 42, 2, 45, 44, 32, 643, 32, 52, 523, 24, 53};
        System.out.println("Welcome to array searching");
        System.out.println("Enter the number you want to search");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("your number was found in the array");

        }
        else{
            System.out.println("Your number was not found in the array");

        }

    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }

        return false;
    }
}
