package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");

        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        

    while (true) {



        int UserInput = Integer.valueOf(scanner.nextLine());
        

        if (UserInput == -1){
            float avg = sum / numbers;
            System.out.println("Thx! Bye!");
            System.out.println("Sum:" + " " + sum);
            System.out.println("Numbers:" + " " + numbers);
            System.out.println("Average:" + " " + avg);
            System.out.println("Even:" + " " + even);
            System.out.println("Odd:" + " " + odd);
            break;
        }
        else {
            sum += UserInput;
            numbers++;
        }

        if (UserInput % 2 == 0){
            even++;
        }
        else {
            odd++;
        }

    }
}      
}
