package streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 3, 37, 91, 9, 13, 9, 37, 46, 1, 58, 37, 94);

		// Streams API - distinct
		List<Integer> uniqueNumbers = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNumbers);

		// Streams API - order
		List<Integer> sortedNumbers = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		
		// Streams API - reverse order
		List<Integer> reverseOrderedNumbers = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrderedNumbers);
	}

}
