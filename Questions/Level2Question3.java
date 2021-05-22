/**
 * MediumQuestionTwo
 */
public class Level2Question3 {

    public static void main(String[] args) {
        /* Write a function for a string ‘midString’ that represents the middle 
        8 characters of a string theString which is “Where’s my hat”. Then output that string. */

        // Step One: create a string variable 'theString' and assign "Where's my hat" to it.
        String theString = "Where's my hat";

        // Step Two: create a string variable 'midString'.
        String midString;

        // Step Three: assign the middle eight characters of theString to midString.
        midString = theString.substring(3,11);

        // Step Four: output midString.
        System.out.println(midString);

        // Correct option is OptionTwo.
    }

    public static void OptionOne() {
        String hat = "Wheres my hat";
        String midString;
        midString = "eres my ";
        System.out.println(midString);
    }

    public static void OptionTwo() {
        String theString = "Wheres my hat";
        String midString;
        midString = theString.substring(3,11);
        System.out.println(midString);
    }

    public static void OptionThree() {
        String theString = "Wheres my hat";
        String midString;
        midString = theString.substring(3,11);
        System.out.println(theString);
    }

    public static void OptionFour() {
        String theString = "Wheres my hat";
        String midString;
        midString = "eres my ";
        System.out.println(theString);
    }
}