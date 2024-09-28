package com.latestjdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConvertArraysToStream {

	public static void main(String[] args) {

		// create integer wrapper array
		Integer[] scoresIntegers = new Integer[] { 1, 2, 3455, 546, 787, 324, 47657, 35345345 };

		// convert arrays to streams
		Stream<Integer> streamScoreStream = Arrays.stream(scoresIntegers);

		// print the sorted order of characters in stream
		streamScoreStream.sorted().forEach(alpha -> System.out.print(alpha + " "));
	}
}
