package assignments; 

public class Assignment15_ReverseSentence {

	public static void main(String[] args) {
		
		// Initialize a sentence
		String sentence = "Java programming is fun and challenging";
		
		// Split the sentence into an array of words using space as the delimiter
		String[] words = sentence.split(" ");
		
		// Count and print the total number of words in the sentence
		System.out.println("Total words in the sentence are " + words.length);
		
		// Reverse the order of words in the sentence
		String reverseSentence = ""; // Variable to store the reversed sentence
		for (int i = words.length - 1; i >= 0; i--) {
			reverseSentence = reverseSentence + words[i] + " "; // Append words in reverse order
		}
		System.out.println("Reverse Sentence is: " + reverseSentence);
		
		// Capitalize the first letter of each word and build a new sentence
		String uppercaseSentence = ""; // Variable to store the sentence with each word capitalized
		for (String word : words) {
			// Capitalize first character + keep rest of the word as is, then add a space
			uppercaseSentence = uppercaseSentence + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}
		System.out.println("Uppercase Sentence is: " + uppercaseSentence);
	}
}
