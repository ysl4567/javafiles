//import java.util.Arrays;
import java.util.Scanner;
public class ClassAsArray{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int x = 2;
        int[] y = new int[10];
        
        m(x,y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
        System.out.println (10 % 15);

        System.out.println ("Enter first value: ");
        int a = input.nextInt();
        System.out.println ("Enter second value: ");
        int b= input.nextInt();


        SwitchNumbers(a,b);


        


    input.close();
    }

// assign values

    public static void m(int number, int[] numbers){
        number = 0;
        numbers[0] = 5555;
    }


// flip numbers
    public static void SwitchNumbers(int a, int b){
        int temp = a;
        a =b ;
        b = temp;
        System.out.println ("a =" + a + "b=" + b);
        
    }

    


}
    