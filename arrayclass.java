import java.util.Arrays;
public class ArrayClass{
    public static void main(String[] args){
        char[] character_1 = new char[]{'a','A','4','F','D','P'}; //char = character
        Arrays.sort(character_1);
        System.out.println (Arrays.toString(character_1));

        int[] array_1 = new int[]{5,3,9,2,6,7,1,2,6,8};
        int[] array_2 = new int[]{5,3,9,2,6,7,1,2,6,8};

        Arrays.sort(array_1);
        System.out.println (Arrays.toString(array_1));

        System.out.println(Arrays.equals(array_1,array_2));

        Arrays.fill(array_2,5,7,5);
        System.out.println (Arrays.toString(array_2)); //replaces value

        double[] FiftyTwoNumbers = new double[52];

        for (int i = 0 ; i < FiftyTwoNumbers.length ; i++){
            FiftyTwoNumbers[i] = (double) (Math.random() * 100);
        }

        System.out.println (Arrays.toString(FiftyTwoNumbers));

// Misc - Check for duplicate numbers 
//Linear Tree Search
//Binary Tree Search.
        int[] array_3 = new int[]{1,2,3,3,4,4,5,6,7,8,9};
        for (int i = 0 ; i < array_3.length ; i ++){
            int value  = array_3[i];
            for (int j = 0 ; j < array_3.length ; j++){
                if (array_3[j] == value && j != i){
                    System.out.println ("Indexes " + i + " and " + j + " print value " + array_3[j]);
                    
                }

                
            }
        }
        


        
    }
}
