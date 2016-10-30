import Zyun.Lam.IO.ConsoleInput;
import java.io.IOException;
public class binomialMultiplier {
    public static void main (String [] args) {
        //Variables
        String equation = "";
        int num = 2;
        int num1ToMultiply;
        StringBuilder number = new StringBuilder ();
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Please enter a binomial to caculate.");
        System.out.println("Use a space to seperate each item: \nExample:(x + 3)(x + 4)\nFractions are not yet out. We may add it in a future update. ;)");
        try {
            equation = ConsoleInput.readString();
            System.out.println(equation);
        } catch (IOException ioe) {
            System.out.println ("I/O Error: " + ioe);
            System.exit(1);
        }
        //Is this empty? or in not the right format
        if (equation.isEmpty() | equation.charAt(0) != '('){
            System.out.println ("Usage of this program: Binomial Multiplier\nIncorrect format!!!");
            System.exit (0);
        }
        //Get first number
        /**
         *  Problem with this: you need a space between each thing.
         */
        if (binomialMultiplier.isNum (equation.charAt (1))) {
            number.append(equation.charAt(1));
            System.out.println("Calculating number 1");
            while ( true ) {
                if (binomialMultiplier.isNum (equation.charAt (num))){
                    //Add this number to the back of equation.charAt (1)
                    number.append(equation.charAt (num));
                }
                else {
                    num1ToMultiply = Integer.parseInt(number.toString());
                    //Exit loop
                    break;
                }
                //Add value to 
                num ++;
            }
            System.out.println("Value: " + number.toString());
        }
        else {
            num1ToMultiply = 1;
            num--;
        }
        //Detect variable ( assume there is only one ), 
        System.out.println("num1ToMultiply:" +  num1ToMultiply);
        char var1 = equation.charAt (num);
        System.out.println(num + "\nCharacter that is multiplied by =  " + var1);
        num += 2;
        boolean number1isNeg = true;
        switch (equation.charAt(num)){
            case '+':
                number1isNeg = false;
                System.out.println("Positive");
                break;
            case '-':
                number1isNeg = true;
                System.out.println("Negative");
                break;
            default:
                break;
        }
        num+=2;
        System.out.println("Caculating number 2");
        int num2ToMultiply = 0;
        StringBuilder number2 = new StringBuilder();
        if (binomialMultiplier.isNum (equation.charAt (num))) {
            while ( true ) {
                if (binomialMultiplier.isNum (equation.charAt (num))){
                    //Add this number to the back of equation.charAt (1)
                    number2.append(equation.charAt (num));
                }
                else {
                    num2ToMultiply = Integer.parseInt(number2.toString());
                    //Exit loop
                    break;
                }
                //Add value to 
                num ++;
            }
        }
        if (number1isNeg){
            num2ToMultiply *= -1;
        }
        System.out.println ("Number = " + num2ToMultiply);
        //read finishing bracket
        if (equation.charAt(num) != ')'){
            System.out.println ("Incorrect format!!!\nThing = " + equation.charAt(num) + "Num = " + num);
            System.exit (0);
        }
        System.out.println("Num = " + num);
        num+=3;
        //Read the second part
        //Variables
        int num3ToMultiply;
        StringBuilder number3 = new StringBuilder ();
        ////////////////////////////////////////////////////////////////////////
        //Get third number
        /**
         *  Problem with this: you need a space between each thing.
         */
        if (binomialMultiplier.isNum (equation.charAt (num))) {
            number.append(equation.charAt(num));
            System.out.println("Calculating number 3");
            while ( true ) {
                if (binomialMultiplier.isNum (equation.charAt (num))){
                    //Add this number to the back of equation.charAt (1)
                    number3.append(equation.charAt (num));
                }
                else {
                    num3ToMultiply = Integer.parseInt(number3.toString());
                    //Exit loop
                    break;
                }
                //Add value to 
                num ++;
            }
            System.out.println("Value: " + number3.toString());
        }
        else {
            num3ToMultiply = 1;
            num--;
        }
        //Detect variable ( assume there is only one ), 
        System.out.println("num3ToMultiply:" +  num3ToMultiply);
        char var2 = equation.charAt (num);
        System.out.println(num + "\nCharacter that is multiplied by =  " + var2);
        num +=2;
        boolean number2isNeg = true;
        switch (equation.charAt(num)){
            case '+':
                number2isNeg = false;
                System.out.println("Positive");
                break;
            case '-':
                number2isNeg = true;
                System.out.println("Negative");
                break;
            default:
                System.out.println("Error. Character : " + equation.charAt(num));
                System.exit(0);
        }
        num+=2;
        System.out.println("Caculating number 4");
        int num4ToMultiply = 0;
        StringBuilder number4 = new StringBuilder();
        //if (binomialMultiplier.isNum (equation.charAt (num))) {
            while ( true ) {
                if (binomialMultiplier.isNum (equation.charAt (num))){
                    //Add this number to the back of equation.charAt (1)
                    number4.append(equation.charAt (num));
                }
                else {
                    num4ToMultiply = Integer.parseInt(number4.toString());
                    //Exit loop
                    break;
                }
                //Add value to 
                num ++;
            }
        //}
        //else {
        //    System.out.println("Incorrect format!");
        //}
        if (number2isNeg){
            num4ToMultiply *= -1;
        }
        System.out.println ("Number = " + num4ToMultiply);
        //read finishing bracket
        if (equation.charAt(num) != ')'){
            System.out.println ("Incorrect format!!!\nThing = " + equation.charAt(num) + "\nNum = " + num);
            System.exit (0);
        }
        //Do the multiplying
        if (num1ToMultiply * num3ToMultiply != 1){
            System.err.print(num1ToMultiply * num2ToMultiply);
        }
        if (var1 == var2){
            System.out.print("\n\n" + var1 + "^2 ");
        }
        else {
            System.err.println("Incorrect format!");
            System.exit(0);
        }
        if ((num2ToMultiply * num3ToMultiply) + (num1ToMultiply * num4ToMultiply) > 0){
           System.out.print (" + ");
        }
        if ((num2ToMultiply * num3ToMultiply) + (num1ToMultiply * num4ToMultiply) == 0){
            //Print nothing
        }
        else {
            System.out.print(((num2ToMultiply * num3ToMultiply) + (num1ToMultiply * num4ToMultiply)) + " " + var1);
        }
        if (number2isNeg){
           System.out.print (" - ");
        }
        else {
            System.out.print (" + ");
        }
        System.out.println(num2ToMultiply * num4ToMultiply);
    }
    
    static boolean isNum ( char character ){
        return (character == '1' | character == '2' | character == '3' | character == '4' | character == '5' | character == '6' | character == '7' | character == '8' | character == '9' | character == '0');
    }
}