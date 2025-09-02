package Challenges;
import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray() {
        Scanner input   = new Scanner(System.in);
        System.out.println("Please enter number of elements: ");;
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i<size){
            System.out.println("Please enter element number " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;

    }
    public static void displayArray(int[] numArr){
        int i = 0;
        while(i < numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
