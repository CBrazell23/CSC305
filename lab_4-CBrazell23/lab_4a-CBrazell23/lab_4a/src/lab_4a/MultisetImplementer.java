package lab4a;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class MultisetImplementer {
  ArrayList<Object> bag = new ArrayList<>();

  ArrayList<Object> getBag(){
	  return bag;
  }

  /**
   * Add an element to the multiset. Duplicates are allowed.
   *
   * @param element the value to add to the collection
   */
  void add(Object element) {
	  bag.add(element);
  }

  /**
   * Remove one instance of the element from the multiset.
   *
   * @param element the element to remove as determined by .equals()
   * @return true if element found (before removal), false otherwise
   */
  boolean remove(Object element) {
	return bag.remove(element);
  }

  /**
   * Total number of elements (counting all duplicates) in the multiset.
   *
   * @return total number of elements
   */
  int size() {
	return bag.size();
  }

  /**
   * Total number of times the specified element appears in the multiset
   * (as determined by .equals()).
   *
   * @param element the value to count
   * @return number of occurrences of the element
   */
  int count(Object element) {
	int count = 0;
	for(Object x : bag) {
		if(x.equals(element)) {
			count += 1;
		}
	}
	return count;
  }

  /**
   * Remove and return an arbitrary element from the multiset. There is no
   * requirement on the order in which elements are grabbed.
   *
   * @return element extracted from the multiset; Optional.empty() if empty
   */
  Optional<Object> grab() {
	Random random = new Random();
	if(bag.size() == 0) {
		return Optional.empty();
	}
	else {
		Object obj = bag.get(random.nextInt(bag.size()));
		bag.remove(obj);
		return Optional.ofNullable(obj);
	}
  }
}