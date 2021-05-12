/**
 * MediumQuestions
 */
public class MediumQuestionOne {

    public static void main(String[] args) {

        // declare myNumber and assign it a value of 10
        double myNumber = 10.0;
        /* Step 2: write a variable 'answer' that is the result of raising myNumber to the power of 3, adding 25 to it, 
        then finding it's total remainder from 12 */
        double answer = (Math.pow(myNumber, 12.0) + 25) % 12;
        // Step 3: print 'answer'
        System.out.println(answer);
        // Correct option is OptionThree
    }

    public static void OptionOne() {
        double myNumber = 10;
        int answer = myNumber * myNumber * myNumber + 25 % 3;
        System.out.println(answer);
    }

    public static void OptionTwo() {
        int myNumber = 10;
        int answer = (Math.pow(myNumber, 12.0) + 25) % 12;
        System.out.println(answer);
    }

    public static void OptionThree() {
        double myNumber = 10.0;
        double answer = (Math.pow(myNumber, 12.0) + 25) % 12;
        System.out.println(answer);
    }

    public static void OptionFour() {
        double powerNumber = 10.0;
        double answer = (Math.pow(powerNumber, 12.0) + 25) % 12;
        System.out.println(answer);
    }
}