import java.util.Scanner;
import java.util.Calendar;

public class Payment extends SelectFood implements IPayment {
    Scanner s = new Scanner(System.in);
    Calendar now = Calendar.getInstance();
    int pnum;
    int tid;
    String address;
    
      @Override
    public void choosePayment(int chh){
        if(chh==1){
                       System.out.println("Enter your phone number");
           pnum=s.nextInt();
           System.out.println("\n!!!!!!!!!YOUR ORDER IS CONFIRM !!!!!\n" +
                               "Order confirmation SMS has been sent to "+pnum
                               + " .Pay for your Bill with bKash  to our Merchant Account No: 01783019655 "
                                 + "and confirm your transaction ID below within 30 minutes");
           
           System.out.println("Please enter your bKash Transaction ID");
           tid=s.nextInt();
           System.out.println("your payment and order is fully succesfull.");
           String n=s.nextLine();
           System.out.println("Enter your full address:");
           address=s.nextLine();
           
            System.out.println("\nOrder Time: " + now.get(Calendar.HOUR) 
                      + ":"
                      + now.get(Calendar.MINUTE) + ":" +now.get(Calendar.SECOND)
                      );
            System.out.println("Order Date: " + now.get(Calendar.DATE)
            + ":"
                      + now.get(Calendar.MONTH) +":" + now.get(Calendar.YEAR)
                    
            );
            
           System.out.println("\nYour Pizza Would deliverd within 1 Hour on your address.\n Thank You for Connecting Us!!");
        }
           else if(chh==2){  
 
                       System.out.println("Enter your phone number");
           pnum=s.nextInt();
           System.out.println("\n!!!!!!!!!YOUR ORDER IS CONFIRM !!!!!\n" +
                               "Order confirmation SMS has been sent to "+pnum
                               + " .Pay for your Bill with  DBBL to our Merchant Account No: 01783019655 "
                                 + "and confirm your transaction ID below within 30 minutes");
           
           System.out.println("Please enter your DBBL Transaction ID");
           tid=s.nextInt();
           System.out.println("your payment and order is fully succesfull.");
           String n=s.nextLine();
           System.out.println("Enter your full address:");
           address=s.nextLine();
           
            System.out.println("\nOrder Time: " + now.get(Calendar.HOUR) 
                      + ":"
                      + now.get(Calendar.MINUTE) + ":" +now.get(Calendar.SECOND)
                      );
            System.out.println("Order Date: " + now.get(Calendar.DATE)
            + ":"
                      + now.get(Calendar.MONTH) +":" + now.get(Calendar.YEAR)
                    
            );
                   }
       else if(chh==3){
           System.out.println("Enter your phone number");
           pnum=s.nextInt();
           String n=s.nextLine();
           
           System.out.println("\nEnter your full address:");
           
           address=s.nextLine();
           
           System.out.println("\nOrder Time: " + now.get(Calendar.HOUR) 
                      + ":"
                      + now.get(Calendar.MINUTE) + ":" +now.get(Calendar.SECOND)
                   
                      );
            System.out.println("Order Date: " + now.get(Calendar.DATE)
            + ":"
                      + now.get(Calendar.MONTH) +":" + now.get(Calendar.YEAR)
                    
            );
           
           System.out.println("\nYour Pizza Would deliverd within 1 Hour on your address.\n Thank You for Connecting Us!!");
       }
    }
}
    

