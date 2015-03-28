/**
 * Demo class presenting Account objects using GUI.
 */
import java.awt.*;//Abstract Window Tool-kit 
import java.awt.event.*;//
import javax.swing.*;//improved awt classes still dependent on awt.

public class AccountDemoEx2Week11 extends JFrame
{
JTextField credit;//declaring variables in the class not inside a constructor!
JTextField balance;

  public AccountDemoEx2Week11(){
   //constructor
        super();//invoking superclass constructor 
        // get the container object
        Container containerOne = getContentPane();//returns the contentPane object and assigning into containerOne
        // set the layout of the container object
       containerOne.setLayout(new BorderLayout());//setting type of layout
        // now add the buttons
    balance= new JTextField("Current Balance");
    credit = new JTextField("Current credit limit");
    JButton save=new JButton("Save");
    JButton exite = new JButton("Exit");
       containerOne.add(save, BorderLayout.NORTH);//adding and  assigning things to the position on GUI(container) 
       containerOne.add(exite, BorderLayout.SOUTH);
       containerOne.add(balance, BorderLayout.WEST);
       containerOne.add(credit, BorderLayout.EAST);
       
  save.addActionListener(new ActionListener()//action listener for save button
        {
            public void actionPerformed(ActionEvent e)
            {//all this things will be executed when the save button will be clicked.
                System.out.println("Object " + e.getActionCommand());
                if (e.getActionCommand().equals("Save"))
                {
                    String bal=balance.getText();
                    int bala=Integer.parseInt(bal);
                    String cred = credit.getText();
                    int credi=Integer.parseInt(cred);
                    Account createdByGuiAccount =new Account(0, bala, credi,"Default_Name","Poland ,Katowice[default]");
                    //we are creating an object and passing some random/default data because task is only about the balance and credit.
                    createdByGuiAccount.showData();//we are showing what was just done.including new balance and credit limit.
                }
            }
        });      
  exite.addActionListener(new ActionListener()//action listener for existing button
        {
            public void actionPerformed(ActionEvent e)
            {//all this things will be executed when the existing button will be clicked.
                System.out.println("Object " + e.getActionCommand());
                if (e.getActionCommand().equals("Exit"))
                {
                  dispose();//clear the memory
                }
            }
        });       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if we want to close using default X button, it will actually kill program.
        pack();//
        
        setVisible(true);// shows the window
}
  public static void main(String [] args)  {
      AccountDemoEx2Week11 showTime = new AccountDemoEx2Week11();//creating an object ,GUI and all this things.
    }
}