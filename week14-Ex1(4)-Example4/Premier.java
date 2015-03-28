/**
 * Write a description of class Premier here.
 * 
 * @Alexander Drabek
 * @version 1.0
 */
public class Premier extends HolidaySimpleWay//subclass of HolidaySimpleWay
{
    // instance variables
    private String hotelName;
    private String hotelGrade;
    private String resortName;
    public Premier()
    {
        super();
        hotelName="";//we don't know  the value yet so ""
        hotelGrade="";//we don't know the value yet so ""
        resortName="";//we don't know the value yet so ""
    }
public void setHotelName( String hotelName)
         {
             this.hotelName= hotelName;
             //i am aware that this.hotelName it is not the same variable as hotelName
             //for me it is more clear in this way .
            }
            
public void setHotelGrade( String hotelGrade)
            {
             this.hotelGrade= hotelGrade;
            }
public void setResortName( String resortName)
            {
             this.resortName= resortName;
            }
public String getHotelName(){
            return hotelName;
            }
public String getHotelGrade(){
            return hotelGrade;
            }
public String getResortName(){
            return resortName;
            }    
            //I had showAllDataPremier and showAllDataHoliday() but now I changed to the same name and let overriding working.
            public String showAllData(){
                    return (super.showAllData()+".\n The hotel name is "+getHotelName()+" and it grade is "+getHotelGrade()+" .The hotel is placed in  "+ getResortName());
            }
}
