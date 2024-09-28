package com.latestjdk;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//lets try to use multiple filters, streams together
//Not mandatory to use all functions at a time in streams.

public class StreamOfDataThirdExample {

	public static Stream<String> getStreamOfData() {
		// create stream of data using stream of.
		Stream<String> fruitNameStream = Stream.of("papaya", "mango fruit", "orange fruit", "grapes");
		return fruitNameStream;
	}

	public static void main(String[] args) {

		// convert to list of data
		System.out.println("original stream of data is " + getStreamOfData().collect(Collectors.toList()));

		// apply filter and remove fruits which have word fruit in them.
		// We can create as many filters as we want.
		Predicate<String> namewithoutfruitwordPredicate = names -> !names.contains("fruit");

		// search fruits which do not have "O" in them
		Predicate<String> namecontainsletteroPredicate = names -> !names.contains("o");

		// apply the multiple filter on the method
		// here first filter will be applied
		// second filter will be applied on items filtered from first filter
		// collect in list
		// print
		List<String> collectionList = getStreamOfData().filter(namewithoutfruitwordPredicate)
				.filter(namecontainsletteroPredicate).collect(Collectors.toList());
		System.out.println("Final list after appylying both filter is " + collectionList);

	}

}
