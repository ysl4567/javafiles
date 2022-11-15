public class BreakFunction{
    public static void main (String[] args){
        
        int sum = 0;
        int number = 0;

        while (number < 20){
            number = number + 1;
            //or sum += number;
            sum = sum + number;
            if (sum >= 100){
                break;
            }
        }
        
        System.out.println ("Total sum: " + sum);
        System.out.println ("Total numbers added: " + number);

    }
}


