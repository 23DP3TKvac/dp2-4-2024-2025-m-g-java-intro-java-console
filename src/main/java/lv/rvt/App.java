package lv.rvt;


public class App 
{
    public static void main( String[] args ) {
        printTriangle(4);
    }
    

    public static void printSpaces(int size) {
        for(int j = 0; j < size; j++){
            System.out.print(" ");
        }
    }
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++){                                             
            printSpaces(size - i - 1);
            printStars(i + 1);
            System.out.println("");
        }
    }

    public static void printStars(int number) {
        for(int a = 0; a < number; a++){
            System.out.print("*");
        }
    }
}
