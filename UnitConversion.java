import java.util.Scanner;
public class UnitConversion {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String userOption = null;
        System.out.print("Enter a valid unit type\n>");
        userOption = k.next();
        getUnitType(userOption);
        k.close();
    }
    // A method deciding which unit type was given and then passing along the requisite parameters to calculations methods
    public static void getUnitType(String userOption){
        Scanner k = new Scanner(System.in);
        boolean keepGo = false;
        int userValue = 0;
        do {
            
            // I might change withg a switch case later idk yet
            if(userOption.equalsIgnoreCase("feet")){
                keepGo = false;
                System.out.print("Enter a measurement value\n>");
                userValue = k.nextInt();
                convertFeetToInches(userValue);
                
            }else if(userOption.equalsIgnoreCase("inch") || userOption.equalsIgnoreCase("inches") ){
                keepGo = false;
                System.out.print("Enter a measurement value\n>");
                userValue = k.nextInt();
                convertInchesToFeet(userValue);
                
            }else{
                keepGo = true;
                System.out.println("Not valid");
                System.out.print("Enter a VALID unit type\n>");
                userOption = k.next();
                getUnitType(userOption);
            }

        } while(keepGo);
    }

    //These bottom two are similar so I wrote this note as to not get confused
    
    public static void convertFeetToInches(int userValue){
        double convertedValue = 0;
        convertedValue = userValue*12;
        System.out.println(convertedValue + " inch(es)");
    }

    public static void convertInchesToFeet(int userValue){
        double convertedValue = 0;
        convertedValue = userValue/12;
        if(convertedValue == 1){
            System.out.println(convertedValue + " foot");
        }else{
            System.out.println(convertedValue + " feet");
        }
    }

}
