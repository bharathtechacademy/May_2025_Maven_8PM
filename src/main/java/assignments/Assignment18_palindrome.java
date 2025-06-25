package assignments; 

public class Assignment18_palindrome { 

    public static void main(String[] args) { 
        String s1 = "A man, a plan, a canal: Panama"; // Example input string 1 (a known palindrome)
        String s2 = "race a car"; // Example input string 2 (not a palindrome)
        
        System.out.println(isPalindrome(s1)); // Prints the result of palindrome check for s1 (expected: true)
        System.out.println(isPalindrome(s2)); // Prints the result of palindrome check for s2 (expected: false)
    }

    public static boolean isPalindrome(String s) { // Method to check if a string is a palindrome
        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize string: lowercase and remove anything that's not a letter or digit

        // Reverse the string
        String reversed = ""; // Initialize an empty string to build the reversed version
        for (int i = cleaned.length() - 1; i >= 0; i--) { // Loop from the end of the cleaned string to the start
			reversed += cleaned.charAt(i); // Append each character in reverse order
		}

        // Compare original cleaned with reversed
        return cleaned.equals(reversed); // Return true if cleaned string is the same forwards and backwards
    }
}
