/** Alexander Drabek-1219460
Exercise 1 from Laboratory Practice Notes2.pdf
*/
public class VolumeConversion
{
 public static final double gallonToLiterConversion=4.546;//1.1 checked

  public static void main(String [] args)
    {
    // Declare variables
    double liter;//1.3 checked
    int numberOfGallons=14; //1.2 checked
    String someTxt= new String("The number of litres in ");
//1.4 checked
    String someTxtTwo= new String(" gallons is ");
//1.5 checked
    // Perform conversion calculation
    liter=numberOfGallons*gallonToLiterConversion;
//1.6 checked
    
    // Complete output with appropriate text  
    System.out.println(someTxt+numberOfGallons+someTxtTwo+liter);//1.7 checked
    }
}
