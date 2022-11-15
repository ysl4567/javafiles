import java.util.Scanner;
import java.util.Arrays;
public class OccurenceOfEachLetter{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int[] array_1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] array_2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] array_3 = new int[]{4,3,9,4,7,9,2,0,1,5}; //len 9
        sum (array_1);
        sum (array_2);
        largest_value (array_3);
        Nine_L(array_3);
        Order (array_3);

    input.close();   
    }
//Total Sum of Array
    public static void sum(int... numbers){
        int total_sum = 0;

        for (int i = 0; i < numbers.length ; i ++){
            total_sum = total_sum + numbers[i];
        }
        System.out.println (total_sum);
    }
// Greatest Value in Array
    public static void largest_value(int ... numbers){
        int greatest_value = numbers[0];

        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] > greatest_value){
                greatest_value = numbers[i];
            }
        }
        System.out.println (greatest_value);
    }

//Linear Search for 9
    public static void Nine_L(int... numbers){
        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] ==9){
                System.out.println ("Index value is: " + i);
            }
        }
    }

//Order array_3 - REVIEW
    public static void Order(int... numbers){
        Arrays.sort(numbers); //sort in ascending order
        System.out.println (Arrays.toString(numbers));
    }

//Binary Search for 9
    public static void Nine_B(int... numbers){

    }
}