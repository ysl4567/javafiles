//import java.util.Scanner;
//import java.util.Random;

public class ArrayIntroduction{
    public static void main (String[] args){
        String[] cars = {"Volvo" , "Volkswagen" , "Chevy" , "Totoya"};
        System.out.println (cars[1]);
        System.out.println (cars.length); //length of an array string_name.length

        for (int i = 0 ; i < (cars.length) - 1 ; i = i + 1){
            System.out.print (cars[i] + "\n");
        }
        //N/A
        char[] Dallas = {'D', 'a', 'l', 'l', 'a', 's'};
        //char[] Dallas_empty = {};
        //double total = 0;
        System.out.println (Dallas.length);
        for (int i= 0; i < Dallas.length ; i = i+1){
            
        }
        //greatest value
        int[] Numbers = {1,2,3,6,5,9,2,5,4,7,8};
        int max = Numbers[0];
        System.out.println (Numbers.length);
        for (int i = 0; i < Numbers.length ; i ++ ){
            if (Numbers[i] > max){
                max = Numbers[i]; // equal value, new value = old value;
                System.out.println (max); 
            }
           
        } 
        //shift elements by 2 indices
        int[] Numbers_2 = {1,2,3,4,5,6,7,8,9};
        
        for (int i =0; i < Numbers_2.length ; i=i+1){
            Numbers_2[i++] = Numbers_2[i];
        System.out.println(Numbers_2);
        }

        
        
    }

}