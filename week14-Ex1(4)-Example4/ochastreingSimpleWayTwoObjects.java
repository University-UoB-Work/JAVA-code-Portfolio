
/**
 * Write a description of class ochastreingSimpleWay here.
 * HolidaySimpleWay
 * @Alexander Drabek
 * @version (a version number or a date)
 */
public class ochastreingSimpleWayTwoObjects 
{


    public ochastreingSimpleWayTwoObjects()
    {
      //empty  
      
    }

    public static void main(String [] args)
    
    {
        System.out.println("Hello in week14...");//Sometimes I just like to print out some text on start.
        //It helps with "where is my program" problem.
        
    //Declaring objects.
      HolidaySimpleWay object1= new HolidaySimpleWay();
      HolidaySimpleWay object2= new HolidaySimpleWay();
    //object1 parameters
      object1.setPlace("Katowice");
      object1.setPrice("1000");
      object1.setStartYear("2012");
      object1.setStartMonth("1");
      object1.setStartDay("20");
      object1.setEndYear("2012");
      object1.setEndMonth("2");
      object1.setEndDay("20");
      
    //object2 parameters
     object2.setPlace("Sirilanka");
      object2.setPrice("9999000");
      object2.setStartYear("2012");
      object2.setStartMonth("4");
      object2.setStartDay("20");
      object2.setEndYear("2012");
      object2.setEndMonth("6");
      object2.setEndDay("19");
        System.out.println("object1");
    System.out.println(object1.showAllData());
      System.out.println("object2");
      System.out.println(object2.showAllData());
    }
}
