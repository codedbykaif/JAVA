

public class learningIF {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Bob";
        System.out.println("Before if");
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("ms." + name);
        }
        System.out.println("After if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;


        if(isSeniorCitizen) {
            System.out.println("Hello senior citizen");
        }
        else if (isAnAdult) {
                System.out.println("Hello adult");
            } else {
                System.out.println("Hello child");
            }
        }
    }

