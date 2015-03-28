/**
 * Definition of Account. Set of Methods (and variables);
 * that future Account object can perform ( and change a state of a variables) 
 */
public class Account {
//instance variables.
    private int openingBalance;
    private int currentBalance;
    private int creditLimit;//following the rule:"private variable and public methods"
    public static int numOfAccounts = 0;//when start 0 account created.
    public String accountHolderName;
    public String  accountHolderAddress;
    
    public Account( int startAmount, int balance, int credit, String name,String adress)  {       
        //constructor with parameters
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
        numOfAccounts++;
        accountHolderName= name;
        accountHolderAddress=adress;
    }
    public void setBalance( int amountBalance)  {
            currentBalance = amountBalance;//simple set method
    }
    public int getBalance()   {
        return currentBalance;//simple get method
    }
    public void setCreditLimit(int amountCredit) {
        creditLimit = amountCredit;
    }
    public int getCreditLimit()   {
        return creditLimit;
    }
   public void showData()     {
        System.out.println("Name is "+accountHolderName+" and address is "+accountHolderAddress+" \n balance = " + currentBalance + " credit = " + creditLimit);
    }
    public void setAccountHolderAddress(String setsAdress) {
        accountHolderAddress=setsAdress ;
    }
    public String  getAccountHolderAddress()   {
        return accountHolderAddress;
    }
        public void setAccountHolderName(String setsName) {
        accountHolderName=setsName ;
    }
    public String  getAccountHolderName()   {
        return accountHolderAddress;
    }
}