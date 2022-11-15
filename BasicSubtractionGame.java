import java.util.Scanner;
//import java.util.Random;
//import java.lang.Math;


public class BasicSubtractionGame{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Subtraction Game");
        System.out.println ("Please enter a value");
        int integer_1 = input.nextInt();
        System.out.println ("Please enter a value");
        int integer_2 = input.nextInt();
        System.out.println("What is the value of " + integer_1 + "-" + integer_2);
        int answer = input.nextInt();
        int difference = integer_1 - integer_2;
        
        if (answer == difference){
            System.out.println ("Correct!");
        }

        else if (answer != difference){
            System.out.println ("Not correct");
        }  
        //Random math value
        //double integer_2 = ((Math.random() * 10) % 20)
    input.close();
    }
} 


/*import java.lang.Math;
 
class SubtractionGame {
 
    // driver code
    public static void main(String args[])
    {
        // Generate random number
        double rand = Math.random();
 
        // Output is different everytime this code is executed
        System.out.println("Random Number:" + rand);
    }
} */