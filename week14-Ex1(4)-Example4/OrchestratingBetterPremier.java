
/**
 * Write a description of class OrchestratingBetterPremier here.
 * 
 * @Alexander Drabek
 * @version (a version number or a date)
 */
public class OrchestratingBetterPremier 
 { 
    // instance variables 
  
    public OrchestratingBetterPremier()
    {
        // initialise instance variables
    }

    public static void main(String [] args)
    
    {
      System.out.println("Hello");
      BetterPremier object1= new BetterPremier();
      BetterPremier object2= new BetterPremier();
      object1.setPlace("Katowice");
      object1.setPrice("1000");
      object1.setStartYear("2013");
      object1.setStartMonth("1");
      object1.setStartDay("20");
      object1.setEndYear("2014");
      object1.setEndMonth("2");
      object1.setEndDay("20");
      
      object1.setHotelName("Alex's Hotel");
      object1.setHotelGrade("5");
      object1.setResortName("Alex Resort");
      System.out.println(object1.showAllData());
    }
}
