import java.util.Scanner;
//import java.util.Random;
public class ArrayIntroduction2{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

// ALL based on intArray
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};   //Defining an array
// #1 Intializing arrays with input values
        System.out.println (intArray[3]); //Output -> 4

        System.out.println ("\n");


        for (int i = 0 ; i < intArray.length  ; i ++){
            System.out.println (intArray[i]); //Output -> 1 2 2 3 4 5 6 7 8 
        }

        System.out.println ("\n");

// #2 Intializing arrays with random values
        for (int j = 0 ; j < intArray.length  ; j++){
            intArray[j] = (int) (Math.random()*10); //don't forget (int)
        System.out.println  (intArray[j]);      
        }
       
        System.out.println ("\n");

// #3 Displaying Arrays with space in between
        for (int k = 0 ; k < intArray.length ; k ++){
            System.out.println (intArray[k] + " " + "\n");
        
        }  
        
        System.out.println ("\n");

// #4 Summing all the elements
        int total_sum_4 = 0;
        for (int l = 0 ; l < intArray.length ; l ++){
            total_sum_4 = total_sum_4 + intArray[l];
        }
        System.out.println ("Total sum: " + total_sum_4);
        System.out.println (total_sum_4);

        System.out.println ("\n");

// #5 Finding the largest element
        int largest_element = intArray[0];

        for (int p = 0 ; p < intArray.length ; p++){
            if (intArray[p] > largest_element){
                largest_element = intArray[p];
            }
        }
        System.out.println (largest_element);

        System.out.println ("\n");

// #5b Finding the smallest element
        int smallest_element = intArray[0];

        for (int q=0; q< intArray.length ; q++){
            if (intArray[q] < smallest_element){
                smallest_element = intArray[q];
            }
        }
        System.out.println (smallest_element);

        System.out.println ("\n");

int[] Array_1 = new int[]{1,2,3,4,5,6,7,8,9,10}; //create an array
// #6 Finding the smallest index of the largest element

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



// #7 Random Shuffling 

        for (int i = 0 ; i < Array_1.length ; i ++){
            int j = (int) (Math.random() * Array_1.length);

            int temp = Array_1[i];
            Array_1[i] = Array_1[j];
            Array_1[j] = temp;

            System.out.println (Integer.toString(Array_1[j]));
        }
System.out.println ("\n");

// #8 Shifting Element
int [] Array_2 = new int[] {1,2,3,4,5,6,7,8,9};
        int temp = Array_2[0];
        for (int i =1; i <Array_1.length- 1; i ++){
            Array_1[i-1] = Array_2[i];
        }
        Array_2[Array_2.length-1] = temp;

       System.out.println((Array_2));

System.out.println ("\n");

// for-each loop

int [] Array_3 = new int[] {1,2,3,4,5,6,7,8,9};

for (double u: Array_3){
    System.out.println(u);
}
        
        
System.out.println ("\n");
        
        

    input.close();
    }
}