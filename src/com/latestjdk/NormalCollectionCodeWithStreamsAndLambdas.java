package com.latestjdk;

import java.util.ArrayList;
import java.util.Collections;

public class NormalCollectionCodeWithStreamsAndLambdas {

	public static void main(String[] args) {

		// normal code with for each iteration
		ArrayList<String> countriesArrayList = new ArrayList<>();
		countriesArrayList.add("spain");
		countriesArrayList.add("india");
		countriesArrayList.add("usa");
		countriesArrayList.add("bangladesh");

		// how to use streams and lambdas together
		// first we use map -- it will another object after performing operation
		// then we will try to filter
		// after filter if we want to sort then use sort
		// finally print in output using for each

		countriesArrayList.stream().map(c -> c.toUpperCase()).filter(c -> !c.startsWith("I")).sorted()
				.forEach(c -> System.out.println(c));

	}
}
