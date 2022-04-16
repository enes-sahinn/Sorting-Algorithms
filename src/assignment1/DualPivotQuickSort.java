package assignment1;
// https://www.geeksforgeeks.org/dual-pivot-quicksort/#:~:text=The%20idea%20of%20dual%20pivot,we%20swap%20them%20if%20necessary.  --> for dual pivot quick sort
public class DualPivotQuickSort {

	public void swap(int[] arr, int i, int j) { // Swapping index
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void dualPivotQuickSort(int[] arr, int low, int high) {
		if (low < high) {  
			int[] piv; // pivot array, piv[0] means left pivot and piv[1] means right pivot 
			piv = partition(arr, low, high); 
			dualPivotQuickSort(arr, low, piv[0] - 1); // 1st part of array 
			dualPivotQuickSort(arr, piv[0] + 1, piv[1] - 1); // 2nd part of array
			dualPivotQuickSort(arr, piv[1] + 1, high); // 3rd part of array
		}   
	} 
	
	public int[] partition(int[] arr, int low, int high) { 	
		if (arr[low] > arr[high]) { // Compare number size and choose outermost elements as pivots
			swap(arr, low, high);
		}	
		int p = arr[low];  // p is the left pivot
		int q = arr[high]; // q is the right pivot
		int j = low + 1;   // left + 1 index
		int g = high - 1, k = low + 1; // right - 1 index, left + 1 index
		
		while (k <= g) { // The loop continues until the right pivot - 1   
			if (arr[k] < p) { // If elements are less than the left pivot
				swap(arr, k, j); 
				j++; }
			else if (arr[k] >= q) {   // If elements are greater than or equal to the right pivot 
				while (arr[g] > q && k < g) { // If elements are greater than right pivot 
					g--; 
				}
				swap(arr, k, g); // Swap indexes
				g--; 
				if (arr[k] < p) {  // If elements are less than left pivot
					swap(arr, k, j); // Swap indexes
					j++; 
				} 
			} 
			k++;
		} 
		j--; g++; // Bring pivots to their appropriate positions. 
		swap(arr, low, j);  // Swapping for pivots
		swap(arr, high, g); 
		// Returning the indices of the pivots because we cannot return two elements from a function, we do that using an array. 
		return new int[] { j, g }; 
	}	
}


