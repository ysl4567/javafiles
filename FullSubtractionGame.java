import java.util.Scanner;
//import java.util.Random;


public class FullSubtractionGame{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Welcome to the subtraction game");
        System.out.println ("Please enter 999 to quit the game");

        boolean TF = true;
        double number_correct = 0; //need double value here to compute percentage_correct
        double total_answered = 0; //need double value here to compute percentage_correct

        while (TF == true){
            int number1 = (int)(Math.random() * 20);
            int number2 = (int)(Math.random() * 20);
    
            int correct_answer = number1 - number2;
            System.out.println ("What is " + number1 + "-" + number2 + "?");
            int user_answer = input.nextInt();
            

                if (user_answer == correct_answer){
                System.out.println ("Correct!");
                number_correct = number_correct + 1;
                total_answered = total_answered + 1;
                //System.out.println (number_correct);
                //System.out.println (total_answered);
                }

                else if (user_answer == 999){
                System.out.println ("Your total score summary: ");
                System.out.println ("Total Correct: " + number_correct);
                System.out.println ("Total answered: " + total_answered);
                double percentage_correct = (double) ((number_correct / total_answered) * 100);
                System.out.println ("Percentage correct:" + percentage_correct);
                break;
        
                }

                else if (user_answer != correct_answer){
                System.out.println ("Not correct. " + "The correct answer is: " + correct_answer);
                number_correct = number_correct + 0;
                total_answered = total_answered + 1;
                //System.out.println (number_correct);
                //System.out.println (total_answered);
                }

            

        }
            
    input.close();    
    }
    
}