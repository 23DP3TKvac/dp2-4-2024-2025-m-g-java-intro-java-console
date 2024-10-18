package lv.rvt;


public class App 
{
    public static void main( String[] args ) {
        printRectangle(17, 3);
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++){
            for (int a = 0; a < height; a++){
                System.out.print("*");
            }
            
        }
    } 
}      

