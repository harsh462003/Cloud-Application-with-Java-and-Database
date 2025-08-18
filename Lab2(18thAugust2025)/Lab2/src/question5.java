//question 4 in the assignment , 3 chances to answer the question
// display a question to the user , allow the user to answer the question , allow 3 chances to the user , if corrct answer display "Good" else display correct answer after 3 attempts

import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cA = "paris";
        int a = 3;

        System.out.println("Question: What is the capital of France?");

        for (int i = 1; i <= a; i++) {
            System.out.print("Attempt " + i + ": ");
            String userAnswer = sc.nextLine().trim().toLowerCase();

            if (userAnswer.equals(cA)) {
                System.out.println("Good");
                return;
            } else {
                if (i < a) {
                    System.out.println("Wrong answer. Try again.");
                }
            }
        }
        System.out.println("Sorry, the correct answer is: " + cA);
    }
}