package Exception_and_file_handeling.file;

public class varags {
    static void main(String[] args) {

        System.out.println(sum(4, 5));

    }


    public static int sum(int[] a){
        int sum = 0;
        for (int i : a) {
            sum += i;

        }
        return sum;
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
