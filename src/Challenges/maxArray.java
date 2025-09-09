package Challenges;

import javax.naming.InsufficientResourcesException;

public class maxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum\n");
        int[] arr = arrayUtility.inputArray();
        int max = Integer.MIN_VALUE;

        for(int num: arr){
            if(max < num) {
                max = num;
            }
        }
        System.out.println("maximum number is: " + max);

    }
}
