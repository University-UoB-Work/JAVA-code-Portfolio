
/**
 * Write a description of class OrchestratingPremier here.
 * 
 * @Alexander Drabek) 
 * @version 1.0
 */
public class OrchestratingPremier
{

    public OrchestratingPremier()
    {
    }

   public static void main(String [] args)
    
    {
        System.out.println("Hello in Orchestrating Class");
      Premier object1= new Premier();
      HolidaySimpleWay object2= new HolidaySimpleWay();
      object1.setPlace("Katowice");
      object1.setPrice("1000");
      object1.setStartYear("2012");
      object1.setStartMonth("1");
      object1.setStartDay("20");
      object1.setEndYear("2012");
      object1.setEndMonth("2");
      object1.setEndDay("20");
      
      object1.setHotelName("Alex's Hotel");
      object1.setHotelGrade("5");
      object1.setResortName("Alex Resort");
      System.out.println("Object1 of a class Premier");
      System.out.println(object1.showAllData());
      
         System.out.println("");
       //object2 parameters
      object2.setPlace("Sirilanka");
      object2.setPrice("9999000");
      object2.setStartYear("2012");
      object2.setStartMonth("4");
      object2.setStartDay("09");
      object2.setEndYear("2012");
      object2.setEndMonth("6");
      object2.setEndDay("19");
      System.out.println("Object2 of a class Holiday");
      System.out.println(object2.showAllData());
    }
}
