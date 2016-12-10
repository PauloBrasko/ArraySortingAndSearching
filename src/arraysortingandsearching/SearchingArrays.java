package arraysortingandsearching;

public class SearchingArrays {

    public static int binarySearch(int[] originalArray, int value) {
        int first;       // First array element
        int last;        // Last array element
        int middle;      // Mid point of search
        int position;    // Position of search value
        boolean found;   // Flag

        // Set the inital values.
        first = 0;
        last = originalArray.length - 1;
        position = -1;
        found = false;

        System.out.println("\n******** Binary Search Algorithm **********\n");
        
        // cloning array, so no changes in the original array
        int[] array = ArrayUtilities.cloneArray(originalArray);
        
        // Search for the value.
        System.out.println("Value being researched:   " + value);

        while (!found && first <= last) {
            // Calculate mid point
            System.out.print("Array being investigated: ");
            ArrayUtilities.printArray(array, first, last);
            middle = (first + last) / 2;
            System.out.println("Array middle point value: " + array[middle]);

            // If value is found at midpoint...
            if (array[middle] == value) {  // YAY!
                found = true;
                position = middle;
            } // else if value is in lower half...
            else if (array[middle] > value) {
                last = middle - 1;
            } // else if value is in upper half....
            else {
                first = middle + 1;
            }
        }

        // Return the position of the item, or -1
        // if it was not found.
        return position;
    }

    static int sequentialSearch(int[] array, int searchedValue) {
        int location = -1;
        for (int i=0; i<array.length; i++) {
            System.out.println("Searching Iteration: " + i);
            if (array[i] == searchedValue) {
                location = i;
                break;
            }
        }
        return location;
    }
}
