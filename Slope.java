import java.util.Scanner;
public class Slope {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x1 = 0;
        int y1 = 0;

        int x2 = 0;
        int y2 = 0;
        
        System.out.print("Give me x1\n>");
        x1 = keyboard.nextInt();
        System.out.print("Give me y1\n>");
        y1 = keyboard.nextInt();

        System.out.print("\nGive me x2\n>");
        x2 = keyboard.nextInt();
        System.out.print("Give me y2\n>");
        y2 = keyboard.nextInt();
        keyboard.close();

        System.out.println("The slope is " + (getyNum(y2, y1) + "/" + getxNum(x2, x1)));
    }

    //Methods
    public static int getyNum(int y2, int  y1){
        int rise = y2-y1;

        return rise; 
    }

    public static int getxNum(int x2, int x1){
        
        int run = x2-x1;
        return run;
    }

}
