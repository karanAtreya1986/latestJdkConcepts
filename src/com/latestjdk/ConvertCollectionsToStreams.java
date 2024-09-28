package com.latestjdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConvertCollectionsToStreams {

	public static void main(String[] args) {

		// create collections
		// add list of shopping items
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("tea");
		shoppingList.add("vegetables");
		shoppingList.add("fruits");
		shoppingList.add("milk");
		shoppingList.add("oil");

		// convert collections to streams
		Stream<String> shoppinglistsStream = shoppingList.stream();

		// print the sorted order of characters in stream
		shoppinglistsStream.sorted().forEach(alpha -> System.out.print(alpha + " "));
	}
}
