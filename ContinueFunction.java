//import java.util.Scanner;
//import java.util.Random;

public class ContinueFunction{
    public static void main (String[] args){

        int sum = 0;
        int number = 0;

        while (number < 20){
            // number ++; placement 
            number = number + 1;
        
            System.out.println ("Sum: " +  sum + "\n");
            System.out.println ("Number: " + number + "\n");
            if (number == 10 || number == 11){
                continue;
            }
            // sum += number; placement
            sum = number + sum;
            
            
            System.out.println (sum);
            System.out.println (number);

        }
        
    }
}