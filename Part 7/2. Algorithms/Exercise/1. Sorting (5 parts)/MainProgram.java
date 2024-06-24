import java.util.*;
// The idea of selection sort is:

// Move the smallest number in the array to index 0.
// Move the second smallest number to index 1.
// Move the third smalles number in the array to index 2.
// Etc.
// In other words:

// Examine the array starting from index 0. Swap the following two numbers with each other: the number at index 0, and the smallest number in the array starting from index 0.
// Examine the array starting from index 1. Swap the following two numbers with each other: the number at index 1, and the smallest number in the array starting from index 1.
// Examine the array starting from index 2. Swap the following two numbers with each other: the number at index 2, and the smallest number in the array starting from index 2.
// Etc.
public class MainProgram{
    public static void main(String[] args){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfSmallest(int[] array){
        int index = 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[index]){
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;

        for(int i = startIndex + 1; i < table.length; i++){
            if(table[i] < table[index]){
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length - 1; i++){
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}