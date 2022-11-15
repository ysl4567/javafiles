import java.util.Arrays;

public class ArrayIntroduction4{
    public static void main (String[] arg){

//All values in array 

        int[] Array_1 = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i  = 0 ; i < Array_1.length+1 ; i++){
            System.out.println (i);
        }

        System.out.println("\n");

//Shift one spot

        int[] Array_2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int first_value = Array_2[0]; 
        for (int i = 1 ; i < Array_2.length ; i++){
            Array_2[i-1] = Array_2[i]; //new = old value
        }
        Array_2[Array_2.length-1] = first_value;
        System.out.println (Arrays.toString(Array_2));

        System.out.println("\n");

//Shuffle

        int[] Array_3 = new int[]{1,2,3,4,5,6,7,8,9};
        int j = (int) ((Math.random() * Array_3.length));
        for (int i = 0 ; i < Array_3.length ; i ++){
            int temp  = Array_3[i];
            Array_3[i] = Array_3[j];
            Array_3[j] = temp;
        }
        System.out.println (Arrays.toString(Array_3));

        System.out.println("\n");

// Shift two spots 

        int[] Array_4 = new int[]{1,2,3,4,5,6,7,8,9};
        int zeroth_index = Array_4[0];
        int first_index = Array_4[1];

        for (int i = 2 ; i < Array_4.length ; i++){
            Array_4[i-2] = Array_4[i];
        }
        Array_4[Array_4.length-2] = zeroth_index;
        Array_4[Array_4.length-1] = first_index;

        System.out.println (Arrays.toString(Array_4));

        System.out.println("\n");

    
// Array of random values
        int[] deck_of_cards = new int[10];
        System.out.println(deck_of_cards.length);
        for (int i = 0 ; i <deck_of_cards.length; i ++){
            deck_of_cards[i] = (int)(Math.random() * 100);
        }

        System.out.println(Arrays.toString(deck_of_cards));

        System.out.println("\n");

//Copy a list

        int[] list_4 = new int[]{2,4,6,8,10};
        int[] list_5 = new int[list_4.length];
        for (int i = 0 ; i <list_4.length ; i ++){
            list_5[i] = list_4[i];
        }
        System.out.println (Arrays.toString(list_5));

        System.out.println("\n");

//

     
        


      

    }
}