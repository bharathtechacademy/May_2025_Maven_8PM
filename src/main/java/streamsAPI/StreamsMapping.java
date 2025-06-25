package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);

		//Regular Procedure
		List<Integer> squareNumbersList = new ArrayList<Integer>();

		for (int val : list) {
			
			squareNumbersList.add(val * val);
		}

		System.out.println(squareNumbersList);
		
		//Streams API - filter
		List<Integer> squareNumbers = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squareNumbers);
	}

}
