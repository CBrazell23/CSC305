import java.util.ArrayList;
import java.util.List;

   public class Invoker {
   private List<Command> commandList = new ArrayList<Command>(); 

   public void takeOrder(Command com){
	   commandList.add(com);		
   }

   public void placeOrders(){
   
      for (Command com : commandList) {
    	  com.execute();
      }
      commandList.clear();
   }
   
   public void placeOrdersBackwards() {
	   ArrayList<Command> revArrayList = new ArrayList<Command>();
       for (int i = commandList.size() - 1; i >= 0; i--) {

           // Append the elements in reverse order
           revArrayList.add(commandList.get(i));
       }
       for (Command com : revArrayList) {
     	  com.execute();
       }
       revArrayList.clear();
   }
}