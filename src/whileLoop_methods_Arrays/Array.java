package whileLoop_methods_Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 35;
//        myArr[1] = 98896;
//        myArr[2] = 3559;
//        myArr[3] = 355;
//        myArr[4] = 6565;
        int[] myArr = {43, 53, 563, 453, 434};
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        Array traversal
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

    }
}
