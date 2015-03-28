/**
 * Write a description of class Week here.
 * 
 * @Alexander Drabek 
 * @1.0
 *
 * Develop the following program in the main() method only.
 */
import java.util.Scanner;// importing Scanner class
public class Week
{
   public static void main(String[] args){
        Scanner inputVarible= new Scanner(System.in);
        //inputVarible is an object with the methods that allow capture data using keyboard.
        System.out.println("I am waiting for the number in range of 1 to 7");//actually it is not waiting yet.
        int number=inputVarible.nextInt(); //using Scanner class to Input data from keyboard and store result in number variable.
        if (number<=7 && number>=1) 
        System.out.println("OK");//just text to say everything is OK
        else 
        System.out.println("Error!");//number is out of range ( week is 1 to 7 )!
        /**if user type 1 and enter it will execute case with "name" 1.
         * if user put other number it will execute appropriate case according to the number given
         * if number is out of range switch will do nothing because there is no default action
        */
        switch (number){
        case 1 : System.out.println("1 is Monday");//printing to the screen
                break;//relly important if we want to execute only statements from 1 case.
        case 2 : System.out.println("2 is Tuesday");
                break;
        case 3 : System.out.println("3 is Wednesday");
                break;
        case 4 : System.out.println("4 is Thursday");
                break;
        case 5 : System.out.println("5 is Friday");
                break;
        case 6 : System.out.println("6 is Saturday");
                break;
        case 7 : System.out.println("7 is Sunday");
                break;
            }
    }
}