
/**
 * Write a description of class Premier here.
 * 
 * @Alexander Drabek
 * @version (a version number or a date)
 */
public class BetterPremier extends Premier
{
    // instance variables
        private String hotelName;
        private int validation;
        private String hotelGrade;
        private String resortName;
        //variables for each method are needed if we want to overwrite methods
        //could be different name convention i left the same naming for variables
         private String price;
         private String startYear;
         private String startMonth;
         private String startDay;
         private String endYear;
         private String endMonth;
         private String endDay;
         
         
    public BetterPremier()
    {
       super();
       //set all data to 0 and null, default
       hotelName="";
       validation=0;
       hotelGrade="";
       resortName="";
       price="";
       startYear="";
       startMonth="";
       startDay="";
       endYear="";
       endMonth="";
       endDay="";
    }
    
       public void setPrice(String price) {
   
        validation=Integer.parseInt(price);
             if (validation<0) 
             System.out.println("Check the price and set it again!/Can not be less than 0!");
             else
             this.price = price;
    }
    
     public void setStartYear(String startYear ) {
        validation=Integer.parseInt(startYear);
        //better to use Data object and calculate current year.
       if (validation<2013) //will work till the end of 2013 year :/
             System.out.println("Check the start year and set it again!/Must be at least current year.");
             else
             this.startYear = startYear;
    } 
  
    public void setStartMonth(String startMonth) {
      validation=Integer.parseInt(startMonth);
       if (validation<1 ||validation>12)
             System.out.println("Check the start month and set it again!/Must be at least 1 and max 12.");
             else
             this.startMonth = startMonth;
     } 
    
    public void setStartDay(String startDay) {
         validation=Integer.parseInt(startDay);
        if (validation<1 ||validation>31) 
             System.out.println("Check the start day and set it again!/Must be at least 1 and max 31.");
             else
             this.startDay = startDay;
        }     

     public void setEndYear(String endYear ) {
        validation=Integer.parseInt(endYear);
       // super. setEndYear("" )
       if (validation<2013) 
             System.out.println("Check the end year and set it again!/Must be at least 1 and max 12.");
             else
             this.endYear = endYear; 
    }        
        
   public void setEndMonth(String endMonth) {
         validation=Integer.parseInt(endMonth);
       if (validation<1 ||validation>12)
             System.out.println("Check the end month and set it again!/Must be at least 1 and max 12.");
             else
             this.endMonth = endMonth;
        }           

    public void setEndDay(String endDay) {
                 validation=Integer.parseInt(endDay);
        if (validation<1 ||validation>31) 
             System.out.println("Check the end day and set it again!/Must be at least 1 and max 31.");
             else
               this.endDay = endDay;    
        }       
    public String getEndDay() {
       return endDay;
                               }
    public String getEndMonth() {
       return endMonth;
                                }
    public String getEndYear() {
        return endYear;
                               }
    public String getPrice() {
       return price;
                              }
    public String getStartDay() {
       return startDay;
                                }
    public String getStartMonth() {
       return startMonth;
                                  }
    public String getStartYear() {
       return startYear;
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
public void setHotelName( String hotelName)
         {
              if (hotelName!=null && hotelName.length()>0)
               this.hotelName=hotelName;
              else
               System.out.println("Please type resort name! Detect 0 characters.");
            }
            
public void setHotelGrade(String hotelGrade)
            {
                //this.[instancevarible declarated]= parse int ->String variable
             validation=Integer.parseInt(hotelGrade);
             
             if (validation<1 || validation>6) 
             System.out.println("Check the hotel grade and set it again!");
             else
             this.hotelGrade=hotelGrade;
            }
public void setResortName( String resortName)
            {
             if (resortName!=null && resortName.length()>0)
               this.resortName= resortName;
               else
               System.out.println("Please type resort name! Detect 0 characters.");
            }
  
            //i had showAllDataPremier and showAllDataHoliday() but now i changed to the same name and let overriding working:)
            public String showAllData(){
                    return ("Holiday will start on : "+ getStartDay()+"-"+getStartMonth()+"-"+getStartYear()+" and end on : "+ getEndDay()+"-"+ getEndMonth()+"-"+getEndYear()+".\nThe hotel name is "+getHotelName()+" and it grade is "+getHotelGrade()+" .\nThe hotel is placed in  "+ getResortName())+" \n total price is : "+getPrice();

            }
}
