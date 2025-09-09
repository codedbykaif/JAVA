package Challenges;
import java.util.Scanner;
public class occurancesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that finds occurances of an element in an array\n");
        int nums[] = arrayUtility.inputArray();
        System.out.print("Now enter the element you want to search: ");
        int element = input.nextInt();
        int occ = countOccurances(nums, element);
        System.out.println("Your element was found " + occ + " times");

    }
    public static int countOccurances(int[] nums, int element){
        int occ = 0;
        for (int num: nums){
            if(num == element){
                occ = occ + 1;
            }
        }
        return occ;
    }
}