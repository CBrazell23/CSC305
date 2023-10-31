package lab4b;

import java.util.List;

public class IssueFour {
  /*
    You will need to update these methods to accomplish the intended task (there
    are a few ways to do this) and update the tests based on your solution.
   */
  public String buildString(List<?> strings) {
    StringBuilder builder = new StringBuilder();

    for (Object string : strings) {
      if(string.getClass() == String.class) {
    	  builder.append(String.format("string: %s\n", string));
      }
      else if(string.getClass() == Integer.class) {
    	  builder.append(String.format("integer: %s\n", string));
      }
    }

    return builder.toString();
  }
}
