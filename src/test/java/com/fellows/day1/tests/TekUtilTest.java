package com.fellows.day1.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.fellows.day1.exception.TekException;
import com.fellows.day1.util.TekUtil;

class TekUtilTest {

	@Test
	public void findMiddleWithOddNumberOfElements() throws TekException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bob");
		list.add("Tom");
		list.add("Jim");
		list.add("Mark");
		list.add("Mary");
		 
		int theMiddle = TekUtil.findMiddle(list);
		
		assertTrue(theMiddle==2);
		assertEquals("Jim", list.get(theMiddle));
	}
	
	
	@Test
	public void findMiddleWithEvenNumberOfElements() throws TekException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bob");
		list.add("Tom");
		list.add("Jim");
		list.add("Mark");
        int theMiddle = TekUtil.findMiddle(list);
        
		assertTrue(theMiddle == 1 || theMiddle == 2);
		assertTrue(Arrays.asList("Tom","Jim").contains(list.get(theMiddle)));
	}
	
	@Test
	public void showNumberOfOccurrences() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bob");
		list.add("Tom");
		list.add("Jim");
		list.add("Mark");
		list.add("Bob");
		list.add("Bob");
		
		assertEquals(3, TekUtil.numOfOccurrences("Bob", list));
	}


	@Test
	public void findMiddleThrowsExceptionOnEmptyList() {
		ArrayList<String> list = new ArrayList<>();
		try {
			TekUtil.findMiddle(list);
		} catch (TekException ex) {
			assertEquals("Arraylist must not be empty", ex.getMessage());
		}
	}

	@Test
	public void testIsEven() {
		assertFalse(TekUtil.isEven(3));
		assertFalse(TekUtil.isEven(9));
		assertTrue(TekUtil.isEven(4));
		assertTrue(TekUtil.isEven(10000));
	}

	

}
