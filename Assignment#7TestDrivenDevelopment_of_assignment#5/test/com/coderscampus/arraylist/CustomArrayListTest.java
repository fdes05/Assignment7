package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	// Test-Driven-Development Methodology
	// Step 1: Write failing test
	// Step 2: Write business logic to make test pass
	// Step 3: Refactor your code
	
	// Three A's
	// Arrange
	// Act
	// Assert
	
	@Test
	void should_add_one_item_to_list() {
		
		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		
		// Act
		boolean verify = customList.add(10);
		
		// Assert

		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
	}

//	void should_get_size_of_array();{
//		
//	}
	
//	void should_get_object_of_array_at_certain_index();{
//		
//	}
	
	@Test
	void should_add_item_at_defined_index_of_array(){
		
		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		customList.add(9);
		customList.add(8);
		customList.add(7);
		customList.add(6);
		customList.add(5);
		
		// Act
		customList.add(2, 4);
	
		// Assert
		assertEquals(customList.get(2), 4);
		assertEquals(customList.get(3), 7);
		assertEquals(customList.get(4), 6);
		assertEquals(customList.get(5), 5);
	}

	@Test
	void should_remove_item_at_defined_index_of_array(){
		//Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		customList.add(1);
		customList.add(2);
		customList.add(3);
		customList.add(4);
		customList.add(5);
		
		//Act
		customList.remove(1);
		
		//Assert
		assertEquals(customList.get(0), 1);
		assertEquals(customList.get(1), 3);
		assertEquals(customList.get(2), 4);
		assertEquals(customList.get(3), 5);
	}

}
