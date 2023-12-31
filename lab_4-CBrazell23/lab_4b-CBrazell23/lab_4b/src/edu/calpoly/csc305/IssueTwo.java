package lab4b;

import java.util.ArrayList;
import java.util.List;

public class IssueTwo {
  /**
   * Method to illustrate common issue with generics.
   *
   * @param items list to copy
   * @return duplicate of input list
   */
  public <T> List<T> duplicate(List<T> items) {
    List<T> copy = new ArrayList<T>();

    for (Object item : items) {
      copy.add((T)item);
    }

    return copy;
  }
}