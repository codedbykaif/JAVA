package Classes_And_Objects;

public class forEach {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Aastha", "Kanhiya", "Shubham", "Karan", "kartik"
        };
//        printArray(array);
        printArrayForEach(array);

        }

        public static void printArrayForEach(String[] array){
        for(String name : array) {
            System.out.println(name);
        }
        }
        public static void printArray(String[] array){
        for(int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
