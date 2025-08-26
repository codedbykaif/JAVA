package whileLoop_methods_Arrays;

public class parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(53, 533);

        System.out.println(num);

    }
    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number received:  " + first);
        System.out.println("Second number received: " + second);
        int sum = first + second;
        return sum;
    }
}
