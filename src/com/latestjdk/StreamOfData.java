package com.latestjdk;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream comes from java.util package.

public class StreamOfData {

	public static Stream<String> getStreamOfData() {
		// create stream of data using stream of.
		Stream<String> fruitNameStream = Stream.of("papaya", "mango", "orange", "grapes");
		return fruitNameStream;
	}

	public static void main(String[] args) {

		// collect method to get the stream of data in form of list.
		// use collectors and converting to list.
		System.out.println("stream of data is " + getStreamOfData().collect(Collectors.toList()));

	}

}
