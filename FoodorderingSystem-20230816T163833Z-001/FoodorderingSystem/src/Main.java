import java.util.Scanner;
class FoodOrder{
   String item1="Burgger";
   String item2="Pizza";
   String item3="Sandwitch";
   String item4="FriedChiken";
   String item5="Shawrma";
   
   
   private final double burggerPrice=180;
   private final double pizzaPrice=250;
   private final double sandwitchPrice=100;       
   private final double friedChikenPrice=150;
   private final double  shawrmaPrice=200;
   
   
   
   public double getBurggerPrice(){
       return burggerPrice;
   }
   
   public double getPizzaPrice(){
       return pizzaPrice;
   }
   
   public double getSandwitchPrice(){
       return sandwitchPrice;
   }
   
   public double getFriedChikenPrice(){
       return friedChikenPrice;
   }
   
   public double getShawrmaPrice(){
       return shawrmaPrice;
   }
   
   
   public void displayItem(){
    System.out.println("\n Food Menu:");
    System.out.println("1. "+item1+" - Price: "+getBurggerPrice());
    System.out.println("2."+item2+" _ Price: "+getPizzaPrice());
    System.out.println("3."+item3+" _ Price: "+getSandwitchPrice());
    System.out.println("4."+item4+" _ price: "+getFriedChikenPrice());
    System.out.println("5."+item5+" _ price: "+getShawrmaPrice());
   }
   
}
public class Main {
          
    public static void main(String[] args) {
         Scanner obj= new Scanner(System.in);
        
        FoodOrder p= new FoodOrder();
        SelectFood s= new SelectFood();
        Payment p1=new Payment();
        
        System.out.println("****************************************");
        System.out.println("         Online Food Delivery          ");
        System.out.println("*****************************************");
        p.displayItem();
        
        System.out.println("\nSelect your Food:");
        int ch=obj.nextInt();
        s.addToChart(ch);
        System.out.println("\nSelect your payment option: \n 1. Bikash \n 2. DBBL \n 3. Cash On Delivery");
        System.out.println("....................................................");
        int chh=obj.nextInt();
        p1.choosePayment(chh);   
    
}
}