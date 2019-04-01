package com.fellows.day1.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import com.fellows.day1.exception.TekException;

public class TekUtil {

	public static int findMiddle(ArrayList list) throws TekException {
		
		if (list.isEmpty()) {
			throw new TekException("Arraylist must not be empty");
		}

		int size = list.size();
		if (!isEven(size)) {
			return (size / 2);
		} else {
			if (isEven(getRandom())) {
				int i = (size/2) -1;
				System.out.println(i);
				return (size / 2) - 1;
			} else {
				int j = (size / 2);
				System.out.println(j);
				return (size / 2);
			}
			
		}
		
	}
	
	public static int numOfOccurrences(String nameOfOccurrence, ArrayList list) {
		int occurrences = Collections.frequency(list, nameOfOccurrence);
		return occurrences;
		
	}

	public static boolean isEven(int val) {
		return (val % 2 == 0);
	}

	private static int getRandom() {
		Random random = new Random();
		return random.nextInt(50) + 1;
	}

}
