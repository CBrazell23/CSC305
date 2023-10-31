import java.util.ArrayList;

public class Driver {
   public static void main(String[] args) {
      Document doc = new Document();

      ReadFile reader = new ReadFile(doc);
      WriteFile writer = new WriteFile(doc);

      Invoker coolGuy = new Invoker();
      coolGuy.takeOrder(reader);
      coolGuy.takeOrder(writer);

      coolGuy.placeOrders();
//      coolGuy.placeOrdersBackwards();
      ArrayList<String> arr = new ArrayList<String>();
      arr = doc.getArr();
      for (String x : arr) {
    	  System.out.println(x);
      }
   }
}