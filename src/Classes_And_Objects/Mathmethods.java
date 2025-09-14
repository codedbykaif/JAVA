package Classes_And_Objects;

public class Mathmethods {
    public static void main(String[] args) {
        System.out.println(Math.abs(-562));
        System.out.println(Math.ceil(-562.66));
        System.out.println(Math.floor(-562.66));
        System.out.println(Math.round (-562.66));
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.PI);

        for(int i=0; i<10; i++) {
            long random = Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}

