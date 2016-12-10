package arraysortingandsearching;

public class MainClass {

    public static void main(String[] args) {
        new MainClass();
    }

    public MainClass() {
        int[] array = new int[]{5, 2, 3, 1, 7, 10, 4, 9, 6, 8};

        // sorting type #1
    //    int[] sortedArray1 = ArraySorting.selectionSort(array);

        // sorting type #2
      int[] sortedArray2 = ArraySorting.insertionSort(array);

        // searching type #1: binary search
        int searchedNumber = 2;
        int location = SearchingArrays.binarySearch(sortedArray2, searchedNumber);
        if (location == -1) {
            System.out.print("Value " + searchedNumber + "  was not found in array: ");
        } else {
            System.out.println("Value " + searchedNumber + " was found at position " + location);
        }
        ArrayUtilities.printArray(sortedArray2);
        
        // trying different array sizes:
//        sortedArray1 = ArrayUtilities.createIntegerArray(1000000);
//        SearchingArrays.binarySearch(sortedArray1, 999995);
//        
//        SearchingArrays.sequentialSearch(sortedArray1, 999995);
    }
}
