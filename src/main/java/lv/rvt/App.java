package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int NumberOfNumbers = 0;
        int sum = 0;

        while (true){
            System.out.println("Give a number:");
            int Usernumber = Integer.valueOf(scanner.nextLine());

            if (Usernumber == 0) {
                break;
            }

            if (Usernumber > 0 || Usernumber < 0) {
                NumberOfNumbers = NumberOfNumbers + 1;
                sum = sum + Usernumber;
            }
        }    
        if (NumberOfNumbers != 0){
            System.out.println("Number of numbers:" + " " + NumberOfNumbers);
            System.out.println("Sum of the numbers:" + " " + sum);
        }
    

}      
}
