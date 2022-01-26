import java.util.Scanner;

public class Loop {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int correctCount = 0; // count the number correct question
        int count = 0; // count the number of question

        do {
            double num1 = Math.floor((Math.random() * 12) + 1); //Picks a number between 1 & 12
            double num2 = Math.floor((Math.random() * 12) + 1); //Picks a number between 1 & 12

            System.out.println(num1 + " * " + num2); //Displays the problem
            int answer = input.nextInt();            //takes users input

            if (num1 * num2 == answer) {             //Checks if answer is correct
               System.out.println("Correct");
                count++;                             //keeps track of how many problems
                correctCount++;                      //Keeps track of correct answers

            } else {                                                   //else to show correct answer if wrong
                System.out.println("Incorrect. \n" + num1 + " * "
                        + num2 + " should be: " + (num1 * num2));
                count++;
            }

        }
        while (count<5);                                                    //loop will happen 5 times
        System.out.println("\nYou've answered " + correctCount + " out of " //tells user how many were correct in total
                + count + " Correct");

    }

}
