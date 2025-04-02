public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60}; // Example array
        int target = 1000; // Value to search
        boolean found = false; // Flag to track if the value is found

        // Using a for loop to search for the value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break; // Exit loop if value is found
            }
        }

        // Print result based on search outcome
        if (found) {
            System.out.println("Value found");
        } else {
            System.out.println("value not");
        }
    }
}
