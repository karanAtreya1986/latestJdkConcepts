package com.latestjdk;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//lets try to use filters, streams together

public class StreamOfDataSecondExample {

	public static Stream<String> getStreamOfData() {
		// create stream of data using stream of.
		Stream<String> fruitNameStream = Stream.of("papaya", "mango fruit", "orange fruit", "grapes");
		return fruitNameStream;
	}

	public static void main(String[] args) {

		// convert to list of data
		System.out.println("original stream of data is " + getStreamOfData().collect(Collectors.toList()));

		// apply filter and remove fruits which have word fruit in them.
		Predicate<String> namewithoutfruitwordPredicate = names -> !names.contains("fruit");

		// apply the filter on the method
		// collect in list
		// print
		List<String> collectionList = getStreamOfData().filter(namewithoutfruitwordPredicate)
				.collect(Collectors.toList());
		System.out.println("Final list after removing fruit word is " + collectionList);

	}

}
