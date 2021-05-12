/**
 * MediumQuestionThree
 */
public class MediumQuestionThree {

    public static void main(String[] args) {
        // Which loop will have the right output?
        // x is 100 to start: if x is less than or equal to 100, add 12 to it.
        // if x is greater than 100, take 41 from it
        // get x to exactly 25
        OptionOne();
    }

    public static void OptionOne() {
        int x = 2;
        int i;

        while (x <= 4) {
            x = x + 2;
            if (x == 4) {
                System.out.println("x is exactly 4");
            }
            
        }
    }
}