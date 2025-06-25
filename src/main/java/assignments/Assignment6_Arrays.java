package assignments;

public class Assignment6_Arrays {

	public static void main(String[] args) {
		 // Step 1: Create arrays for student names and marks
        String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
        int[] originalMarks = {75, 80, 82};

        // Step 2: Add 10 marks to each student manually using assignment operators
        originalMarks[0] += 10; // Suresh
        originalMarks[1] += 10; // Mahesh
        originalMarks[2] += 10; // Naresh

        // Step 3: Display updated marks
        System.out.println("Updated Marks:");
        System.out.println(studentNames[0] + ": " + originalMarks[0]);
        System.out.println(studentNames[1] + ": " + originalMarks[1]);
        System.out.println(studentNames[2] + ": " + originalMarks[2]);

        // Step 4: Calculate average manually
        int totalMarks = originalMarks[0] + originalMarks[1] + originalMarks[2];
        double average = totalMarks / 3;

        // Step 5: Display average
        System.out.println("Average Marks: " + average);
	}

}
