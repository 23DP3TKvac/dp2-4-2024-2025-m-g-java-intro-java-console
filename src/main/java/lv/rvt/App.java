package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");

        int num = 0;
        
        int UserInput = Integer.valueOf(scanner.nextLine());
        
        for(num = 0; num < UserInput; num++){
            printText();
        
        }
        
    }

    
        
public static void printText() {
    System.out.println("In a hole in the ground there lived a method");
            
    
}
    
}      

