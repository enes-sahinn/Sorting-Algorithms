package assignment1;
//https://www.programiz.com/dsa/bucket-sort         --> for bucket sort
//https://www.geeksforgeeks.org/insertion-sort/     --> for insertion sort														
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	
	public void bucketSort(int[] arr, int n) {
		if (n <= 0)
			return;
		
		int bucketNumber = (n/3);  // Choose bucket number
		ArrayList<Integer>[] bucket = new ArrayList[bucketNumber]; // Create arraylist for hold buckets
		
		for (int i = 0; i < bucketNumber; i++)   // Create empty buckets according to bucket number 
			bucket[i] = new ArrayList<Integer>();
		
		int largest = 1;
		for (int i = 0; i < arr.length; i++) {   // Find largest number to find interval
			if (arr[i] > largest) {
				largest = arr[i];
			}
		} largest++;  // Increment largest number by one
		
		float interval = (float) largest /(float)  bucketNumber;  // Find interval in float format
		
		for (int i = 0; i < n; i++) { // Add elements into the appropriate buckets
			int bucketIndex = (int) ((float)arr[i] / (float)interval); // Find bucket index
			bucket[bucketIndex].add(arr[i]);
		}
		// Sort the elements of each bucket by using insertion sort algorithm
		for (int i = 0; i < bucketNumber; i++) { 
			bucket[i] = insertionSort(bucket[i].toArray(new Integer[0])); // Convert arraylist to array
		
		}		
		// Concatenate the sorted arrays 
		int index = 0;
		for (int i = 0; i < bucketNumber; i++) {
			for (int j = 0, size = bucket[i].size(); j < size; j++) {
				arr[index++] = bucket[i].get(j);
			}
		}
	}
	// Insertion sort for sorting bucket
	public ArrayList<Integer> insertionSort(Integer arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) { // Checking for zero and one element arrays beacuse they are already sorted
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {  // Loop for finding appropriate position for key
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key; // Indexing key after loop
		}
		ArrayList<Integer> arrList= new ArrayList(); // Convert array to array list and return it
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		return arrList;
	}
}

