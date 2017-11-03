package appconpattern;

/**
 *
 * @author Keith Downing
 */
import java.util.HashMap;



public class AppConPattern {
    
    public static HashMap<String,HandMath> hashMapOfCommands = new HashMap<String,HandMath>();
    
    public void AppContPattern() {  
        
    }
    
    public static void handleCommand(String command, Integer num1, Integer num2) {
        
        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("-", new Subtract());
      
        
        HandMath handler = hashMapOfCommands.get(command);
        
        handler.execute(num1, num2);
        
            }
    
}
