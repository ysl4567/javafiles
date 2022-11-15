import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArraysIntroduction{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double[][] array_1 = new double[][]{{0,1,2,3},{4,5,6,7}};
        System.out.println (array_1[0][3]);
        System.out.println (array_1.length); //2

// #2, Random Values 
        System.out.println ("\n");

        int [][]matrix = new int[10][10];

        for (int row = 0; row < matrix.length ; row++){
            for (int column = 0 ; column < matrix[row].length ; column++){
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        System.out.println (Arrays.deepToString(matrix));  //deepToString for multi-d arrays

        System.out.println ("\n");

// #2 b - input, Random Values

        System.out.println ("Enter row value: ");
        int row_2 = input.nextInt();
        System.out.println ("Enter column value: ");
        int column_2 = input.nextInt();

        int [][]matrix_2 = new int[row_2][column_2];

        for (int i = 0; i < row_2 ; i++){
            for (int j = 0 ; j < column_2 ; j++){
                matrix_2[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println (Arrays.deepToString(matrix_2));

        System.out.println ("\n");


// #3 - Print Multi-D Array

        System.out.println (Arrays.deepToString(array_1));
        System.out.println ("\n");


// #4 - Summing all elements

        System.out.println (matrix_2.length); // number of rows
        System.out.println (matrix_2[1].length); //number of columns
        System.out.println ("\n");
        int total_sum = 0;
        for (int i = 0 ; i < matrix_2.length ; i++){
            for (int j = 0 ; j < matrix_2[i].length ; j ++){
                total_sum = total_sum + matrix_2[i][j];
            }
        }
        System.out.println (total_sum);
        System.out.println ("\n");

// #7 - Random Shuffling
        

        for (int i = 0 ; i < matrix_2.length ; i++){
            for (int j = 0 ; j < matrix_2[i].length ; j ++){
                int i1 = (int)(Math.random() * matrix_2.length);
                int j1 = (int)(Math.random() * matrix_2[i].length);
                int temp = matrix_2[i][j];
                matrix_2[i][j] = matrix_2[i1][j1];
                matrix_2[i1][j1] = temp;
            }
        }
        System.out.println (Arrays.deepToString(matrix_2));

        System.out.println("\n");



// #6 - Which row has the largest sum
        int max_sum = 0;
        for (int i = 0 ; i < matrix_2[0].length ; i ++){
            max_sum = max_sum + matrix_2[0][i];
        }
        for (int i = 0 ; i < matrix_2.length ; i ++){
            int row_sum = 0;
            for (int j = 0 ; j < matrix_2[i].length ; j ++){
                row_sum = row_sum + matrix_2[i][j];
                if (row_sum > max_sum){
                    max_sum = row_sum;
                }
            }
        }
        System.out.println (max_sum);


        System.out.println ("\n");


// #5 - Summing elements by column 
        int column_number = 0;
        for (int i  = 0; i < matrix_2[0].length ; i ++){
            int total_sum_2 = 0;
            column_number = column_number + 1;
            for (int j = 0 ; j < matrix_2.length ; j++){
                total_sum_2 = total_sum_2 + matrix_2[j][i];
                
            
            }
        System.out.println ("colum " + column_number + "-" +  total_sum_2);
        }

        System.out.println ("\n");
        



        
    input.close();
    }
}