package com.latestjdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConvertCollectionsToStreamsWithFilters {

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

		// apply a filter condition
		Predicate<String> namestartsPredicatewithvPredicate = names -> names.startsWith("V");

		// sort the stream
		// apply map and convert to uppercase
		// apply filter on the upper case
		// for each loop to print the data
		shoppinglistsStream.sorted().map(items -> items.toUpperCase()).filter(namestartsPredicatewithvPredicate)
				.forEach(item -> System.out.println(item + " "));

	}
}
