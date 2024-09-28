package com.latestjdk;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOfDataFourthExample {

	public static void main(String[] args) {

		// create integer wrapper array
		Integer[] scoresIntegers = new Integer[] { 1, 2, 3455, 546, 787, 324, 47657, 35345345 };

		// add list of shopping items
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("tea");
		shoppingList.add("vegetables");
		shoppingList.add("fruits");
		shoppingList.add("milk");
		shoppingList.add("oil");

		// lets create stream of three characters z,a,x
		Stream<String> alphabetPredicate = Stream.of("z", "a", "x");

		// print the sorted order of characters in stream
		alphabetPredicate.sorted().forEach(alpha -> System.out.println("result is " + alpha));
	}
}
