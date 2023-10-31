package lab4a;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class MultisetImplementerTest {

	@Test
	void testAddString() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		assertEquals(bag.getBag().get(0), "Hello!");
	}
	
	@Test
	void testAddInt() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add(25);
		assertEquals(bag.getBag().get(0), 25);
	}
	
	@Test
	void testRemove() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		assertEquals(bag.getBag().get(0), "Hello!");
		bag.remove("Hello!");
		assertEquals(bag.size(), 0);
	}
	
	@Test
	void testMultipleRemovals() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		bag.add("Hello! Hello");
		assertEquals(bag.getBag().get(0), "Hello!");
		bag.remove("Hello!");
		bag.remove("Hello! Hello");
		assertEquals(bag.size(), 0);
	}
	
	@Test
	void testSizeZero() {
		MultisetImplementer bag = new MultisetImplementer();
		assertEquals(bag.size(), 0);
	}
	
	@Test
	void testSizeNotZero() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		assertEquals(bag.size(), 1);
	}
	
	@Test
	void testCountZero() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		int i = bag.count(10);
		assertEquals(i, 0);
	}
	
	@Test
	void testCountGreaterThanZero() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		int i = bag.count("Hello!");
		assertEquals(i, 1);
	}
	
	@Test
	void testGrabEmpty() {
		MultisetImplementer bag = new MultisetImplementer();
		assertEquals(bag.grab(), Optional.empty());
	}
	
	@Test
	void testGrabNotEmpty() {
		MultisetImplementer bag = new MultisetImplementer();
		bag.add("Hello!");
		assertEquals(bag.grab(), Optional.ofNullable("Hello!"));
	}

}
