package assignment1;
// https://www.geeksforgeeks.org/heap-sort/   --> for heap sort
public class HeapSort {

	public void sort(int arr[]) {
		int n = arr.length;
		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--) {  // Start from n/2 - 1 to 0. Because there is no leaf node between n/2 and n.
			heapify(arr, n, i);  // find correct position for index i
		}
		
		for (int i = n - 1; i > 0; i--) { // Start from last index to second index to extract all element one by one and heapfying
			int temp = arr[0];  // Move current root to end
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);  // call max heapify on the reduced heap
		}
	}

	// To heapify a subtree rooted with node i 
	public void heapify(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left child node = 2*i + 1
		int r = 2 * i + 2; // right child node = 2*i + 2

		if (l < n && arr[l] > arr[largest])  // If left child is larger than root
			largest = l;

		if (r < n && arr[r] > arr[largest])  // If right child is larger than largest
			largest = r;

		if (largest != i) {  // If largest is not root, swap it with root
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest); // Recursively heapify the affected sub-tree
		}
	}
}

