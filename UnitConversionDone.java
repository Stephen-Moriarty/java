import java.util.Scanner;
public class UnitConversionDone {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String userOption = null;
        promptUnitType();
        userOption = k.next();
        whichUnitType(userOption);
        k.close();
    }

    // A method deciding which unit type was given
    public static void whichUnitType(String userOption){
        Scanner k = new Scanner(System.in);
        int userValue = 0;
        if(userOption.equalsIgnoreCase("feet")){
            promptMeasVal(userOption);
            userValue = k.nextInt();
            convertFeetToInches(userValue, userOption);      
        }else if(userOption.equalsIgnoreCase("inch") || userOption.equalsIgnoreCase("inches")){
            promptMeasVal(userOption);
            userValue = k.nextInt();
            convertInchesToFeet(userValue);
        }else{
            System.out.println("Not valid unit type.");
            promptUnitType();
            userOption = k.next();
            whichUnitType(userOption);
        }
        k.close();
    }

    // Conversion methods
    public static void convertFeetToInches(int userValue, String userOption){
        int convertedValue = 0;
        convertedValue =  userValue*12;
        System.out.println(userValue + " " + userOption + " = " + convertedValue + " inch(es).");
    }
    public static void convertInchesToFeet(double userValue){
        double convertedValue = 0;
        convertedValue = (double) (userValue)/12;
        if(convertedValue == 1){
            System.out.println(userValue + " inches = " + convertedValue + " foot.");
        }else if(userValue == 1){
            System.out.println(userValue + " inch = " + convertedValue + " feet.");
        }else{
            System.out.println(userValue + " inches = " + convertedValue + " feet.");
           
        }
    }

    // Prompt methods
    public static void promptUnitType(){
        System.out.print("What units are you measuring in?\n>");
   }
    public static void promptMeasVal(String userOption){
        if(userOption.equalsIgnoreCase("feet")){
            System.out.print("How many " + userOption + " do you have?\n>");
        }else{
            System.out.print("How many inches do you have?\n>");
        }
    }
    
}
