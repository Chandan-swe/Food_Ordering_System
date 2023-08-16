import java.util.Scanner;

public class SelectFood extends FoodOrder implements ISelectFood {
        public double bill;
        public double qty;
        public double total;

Scanner input= new Scanner(System.in);

        public void addToChart(int chh) {
           if(chh==1){               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getBurggerPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka    ");
               System.out.println("--------------------------------------------");
               
           }
           else if(chh==2){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getPizzaPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
           }
           else if(chh==3){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getSandwitchPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
          else if(chh==4){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getFriedChikenPrice();
               System.out.println("--------------------------------------------");
               System.out.println("Total Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }
         else  if(chh==5){
               System.out.println("Enter quantity:");
               qty=input.nextInt();
               total=qty*getShawrmaPrice();
               System.out.println("--------------------------------------------");
               System.out.println("\nTotal Amount Payable:" +total +" Taka");
               System.out.println("--------------------------------------------");
               
           }         else{
             System.out.println("Invalid Input");
         }
        }
}

    
    

