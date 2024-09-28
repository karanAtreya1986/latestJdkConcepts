package com.latestjdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Streams-
//Perform operation on group of objects. Streams not for storage purpose.

//Map- 
//Always gives new object every time after performing operation. Map is intermediate method in streams. 

//how to write map
//collections.stream().map(functions)

//more methods in streams
//filter - intermediate method
//sorted
//foreach - for displaying data

//streams coding and how it works
//first call map and get new object
//apply filter on the object -- like a where clause
//sorted -- to sort the data if needed
//then print using for each or we will see if any other way

public class UsesOfStreams {

	public static void main(String[] args) {

		// normal code with for each iteration
		ArrayList<String> countriesArrayList = new ArrayList<>();
		countriesArrayList.add("spain");
		countriesArrayList.add("india");
		countriesArrayList.add("usa");
		countriesArrayList.add("bangladesh");

		// sort countries
		Collections.sort(countriesArrayList);

		// use for each loop
		// convert country characters to upper case
		// if the name does not start with I then print it

		for (String countryString : countriesArrayList) {
			countryString = countryString.toUpperCase();
			if (!countryString.startsWith("I")) {
				System.out.println(countryString);
			}

		}
	}
}
