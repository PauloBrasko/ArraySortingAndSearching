package arraysortingandsearching;

import java.util.Random;

public class ArrayUtilities {
    public static int[] cloneArray(int[] originalArray) {
        int[] clonedArray = new int[originalArray.length];
        for (int index = 0; index < originalArray.length; index++) {
            clonedArray[index] = originalArray[index];
        }
        return clonedArray;
    }
    
    public static void printArray(int[] array) {
        for (int i=0; i < (array.length-1); i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }
    
    public static void printArray(int[] array, int startPoint, int endPoint) {
        for (int i=startPoint; i < endPoint; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[endPoint]);
    }
    
    public static int[] createIntegerArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i=0; i<arraySize; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomIntegerArray(int arraySize, int minValue,
            int maxValue) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i=0; i<arraySize; i++) {
            array[i] = random.nextInt(maxValue-minValue) - minValue;
        }
        return array;
    }

}
