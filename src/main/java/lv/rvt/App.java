package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int fac = 1;

        System.out.println("Give a number:");

        int UserInput = Integer.valueOf(scanner.nextLine());

        for(i = 1; i <= UserInput;i++){
            fac = fac * i;
        }
        System.out.println("Factorial:" + "" + fac);



   
    



}      
}
