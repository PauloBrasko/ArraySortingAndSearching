package arraysortingandsearching;

public class ArraySorting {

    public static int[] selectionSort(int[] originalArray) {
        int startScan, index, minIndex, minValue;
        
        // just to avoid destroying the original array, let's clone it
        int[] array = ArrayUtilities.cloneArray(originalArray);
        
        System.out.println("\n\n*********** Selection Sort **************\n");
        System.out.print("Original Array: ");
        ArrayUtilities.printArray(array);
    
        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            System.out.println("Filling slot #" + startScan);
            minIndex = startScan;
            minValue = array[startScan];
            System.out.println("Current minimum value in this array pass: " + minValue);
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                    System.out.println("NEW minimum value in this array pass: " + minValue + " at location " + minIndex);
                }
            }
            System.out.println("Placing the minimum value into its right location\n"
                + "by swiping " + minValue + " with " + array[startScan]);
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
            
            ArrayUtilities.printArray(array);
        }
        return array;
    }
    
    // This sort moves the items into sorted order by "inserting" them
    // from the right side of the array (the unsorted part) into the left
    // side of the array (the sorted part).
    public static int[] insertionSort(int[] originalArray) {

        // just to avoid destroying the original array, let's clone it
        int[] array = ArrayUtilities.cloneArray(originalArray);
        
        System.out.println("\n\n*********** Insertion Sort **************\n");
        System.out.print("Original Array: ");
        ArrayUtilities.printArray(array);

   	// Move each item (starting at index 1) over to its correct spot
        // on the "left", sorted side of the array.
        for (int index = 1; index < array.length; index++) {
            int currentValue = array[index];
            int currentIndex = index;

            // Move the current item to the left "past" any items that 
            // are larger than it.  This is accomplished by shifting the
            // larger items to the right.
            System.out.println("analyzing number " + currentValue);

            while (currentIndex > 0 && currentValue < array[currentIndex - 1]) {
                array[currentIndex] = array[currentIndex - 1];
                System.out.println("moving " + array[currentIndex] + " to the right");
                currentIndex--;
                
                array[currentIndex] = 0;
                ArrayUtilities.printArray(array);
            }

            System.out.println("inserting " + currentValue + " to its final location");
            array[currentIndex] = currentValue;
            ArrayUtilities.printArray(array);
        }
        return array;
    }
}
