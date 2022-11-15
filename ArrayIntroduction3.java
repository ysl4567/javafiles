import java.util.Scanner;


public class ArrayIntroduction3{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);


        int[] Array_1 = new int[]{1,2,3,4,5,6,7,8,9,10}; //create an array
        System.out.println (Array_1[3]);
        System.out.println (Array_1.length);
        
        for (int i = 0 ; i < Array_1.length ; i ++ ){
            System.out.println (Array_1[i]);
        }


        System.out.println ("\n");

        for (int i = 0 ; i <Array_1.length; i ++){
            int value = (int) (Math.random()*10);
            Array_1[i] = value; //new = old
        System.out.println (Array_1[i]);

        }


        System.out.println ("\n");

        int sum = 0; //the sum of random array;
        for (int i = 0; i <Array_1.length; i ++){
            //int index_value = Array_1[i];
            sum = sum + Array_1[i];
        }
        System.out.println (sum);


        System.out.println ("\n");

        int biggest_value = Array_1[0];
        for (int i = 0; i <Array_1.length; i++){
            if (Array_1[i] > biggest_value){
                biggest_value = Array_1[i]; //most newly updated value = last newly updated value
            }
        }
        System.out.println (biggest_value);
        

        System.out.println ("\n");

        int smallest_value = Array_1[0];
        int smallest_value_index = 0;
        for (int i = 0; i <Array_1.length; i++){
            if (Array_1[i] < smallest_value){
                smallest_value = Array_1[i];
                smallest_value_index = i;
            }
        }
        System.out.println ("Smallest value: " + smallest_value_index);
        System.out.println ("Index value: " + smallest_value);
 
    input.close();
    }
}