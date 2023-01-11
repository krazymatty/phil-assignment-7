package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test-Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass
	// Step 3 - Re-factor your code
	// Arrange-Set things up, Act-Invoke the code, Assert-Expected vs Actual
	// behavior
	public CustomArrayList<Object> sut;

	@BeforeEach
	void setup() {
		sut = new CustomArrayList<>();
	}

	@Test
	void should_add_item_to_list() {
		assertTrue(sut.add(1));
	}

	@Test
	void should_add_item_to_list_by_index() {
		for (int i = 0; i < 10; i++) {
			sut.add((i + 1));
		}
		sut.add(3, 55);
		assertEquals(2, sut.get(1));
		assertEquals(11, sut.getSize());
//		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(10,
//		sut.add((11))), "Index is full");

	}

	@Test
	void should_get_size_of_array() {
		for (int i = 0; i < 5; i++) {
			sut.add(i + 1);
		}
		assertEquals(5, sut.getSize());
	}

	@Test
	void should_get_item_from_array() {
		for (int i = 0; i < 5; i++) {
			sut.add(i + 1);
		}
		assertEquals(5, sut.get(4));
	}

	@Test
	void should_remove_item_from_list_by_index() {
		for (int i = 0; i < 10; i++) {
			sut.add(i + 1);
		}
		assertEquals(10, sut.getSize()); // Gets array size before manipulation
		assertEquals(9, sut.remove(8)); // removes item at index 8
		assertEquals(9, sut.getSize()); // checks to see if arraySize is resized
		assertEquals(10, sut.get(8)); // check to see if the item at index 8 is the item previously at 9.
		// Checks to see if get request is out of bounds.
		assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(11), "Index is out of bounds");
	}
}
