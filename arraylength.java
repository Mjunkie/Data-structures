public class ArrayLength {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60}; // Example array
        int count = 0; // Variable to store the count

        // Using a for loop to count elements
        for (int i = 0; i < numbers.length; i++) {
            count++; // Increment count for each element
        }

        // Print the total count
        System.out.println("Number of elements in the array: " + count);
    }
}
