package com.test.java.concept.algorithams;

public class Sorting {
	public static void main(String[] args) {
		int[] data = { 5, 3, 4, 1, 2 };
		int size = data.length;
		// Sorting.bubbleSort(data);
		// insertionSort(data);
		mergeSort(data, size);
		printArray(data);

	}

	public static void bubbleSort(int array[]) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void insertionSort(int array[]) {
		int size = array.length;
		for (int i = 1; i < size; i++) {
			// store the current value at current in key
			int key = array[i];
			// pointer to index just before the key's index
			int j = i - 1;
			/*
			 * move values in arr[0...i-1] greater than key one position to their right
			 */
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			/*
			 * store the key just before the last shifted element or after the element just
			 * smaller than or equal to the key
			 */
			array[j + 1] = key;
		}
	}

	public static void mergeSort(int array[], int length) {
		if (length < 2) { // condition for the length of array
			return;
		}

		int middle = length / 2; // defining new parameter middle

		int[] new_array_1 = new int[middle]; /** defining the new first array after division */
		int[] new_array_2 = new int[length - middle];
		/** defining the new second array */

		for (int i = 0; i < middle; i++) { /** applying condition for sorting of new array 1 */
			new_array_1[i] = array[i];
		}

		for (int i = middle; i < length; i++) { /** applying condition for sorting of new array 2 */
			new_array_2[i - middle] = array[i];
		}

		mergeSort(new_array_1, middle); /** calling merge sort function for new array 1 */
		mergeSort(new_array_2, length - middle); /** calling merge sort function for new array 2 */

		merge(array, new_array_1, new_array_2, middle,
				length - middle); /** calling function for merging of new array 1 and new array 2 */
	}

	public static void merge(

		int[] array, int[] new_array_1, int[] new_array_2, int left, int right) {
		// defining parameters

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) { // conditions for merging
			if (new_array_1[i] <= new_array_2[j]) {
				array[k++] = new_array_1[i++];
			} else {
				array[k++] = new_array_2[j++];
			}
		}

		while (i < left) {
			array[k++] = new_array_1[i++];
		}

		while (j < right) {
			array[k++] = new_array_2[j++];
		}
	}

	public static void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
