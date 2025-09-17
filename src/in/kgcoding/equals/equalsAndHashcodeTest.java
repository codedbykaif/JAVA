package in.kgcoding.equals;

public class equalsAndHashcodeTest {
    static void main() {
        Person person1 = new Person("kaif", "001", 3);
        Person person2 = new Person("kaif", "001", 3);

        if(person1.equals(person2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
    }
}
