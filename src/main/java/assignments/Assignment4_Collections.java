package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_Collections {

	public static void main(String[] args) {
		// 1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
		// Create an empty list to hold city areas
        List<Double> cityAreas = new ArrayList<>();

        // Add areas of top 5 largest cities one by one
        cityAreas.add(12144.6);  // 1st city
        cityAreas.add(8223.0);   // 2nd city
        cityAreas.add(7894.0);   // 3rd city
        cityAreas.add(7283.0);   // 4th city
        cityAreas.add(6860.0);   // 5th city

        // Calculate total area of 3rd and 4th cities (index 2 and 3)
        double total = cityAreas.get(2) + cityAreas.get(3);

        // Print the result
        System.out.println("Total area of 3rd and 4th cities combined: " + total + " sq km");
        
        
        /**2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.**/
        
        Set<String> attractions = new HashSet<>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Statue of Liberty");
        attractions.add("Louvre Museum");
        attractions.add("Times Square");
        attractions.add("Disneyland");
        attractions.add("Colosseum");
        attractions.add("Niagara Falls");
        attractions.add("Burj Khalifa");
        attractions.add("Machu Picchu");

        System.out.println("Top 10 Tourist Attractions:");
        System.out.println(attractions);
        System.out.println("Total number of attractions: " + attractions.size());
        
        
        /** 3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.*/
        
        int[] numbers = {12, 45, 67, 89, 34, 56, 78, 90, 23, 11};

        double average = (numbers[4] + numbers[5]) / 2.0;
        System.out.println("Average of 5th and 6th values: " + average);
        
        /**4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.**/
     // Create an empty list to store movie names
        List<String> movies = new ArrayList<>();

        // Add the top 5 highest-grossing movies one by one
        movies.add("Avatar");                          // 1st
        movies.add("Avengers: Endgame");               // 2nd
        movies.add("Titanic");                         // 3rd
        movies.add("Star Wars: The Force Awakens");    // 4th
        movies.add("Avengers: Infinity War");          // 5th

        // Print the third movie on the list (index 2)
        System.out.println("Third highest-grossing movie: " + movies.get(2));
	}

}
