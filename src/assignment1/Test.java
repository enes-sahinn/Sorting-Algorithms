package assignment1;

import java.util.Random;
import java.util.stream.IntStream;

public class Test {
	
	public static void main(String[] args) {
		// Create input limits
		int border1 = 1000;    
		int border2 = 10000;
		int border3 = 100000;
		// Create arrays and fill them
	    int[] increasing1 = IntStream.range(1, border1+1).toArray(); // increasing order
	    int[] increasing2 = IntStream.range(1, border2+1).toArray();
	    int[] increasing3 = IntStream.range(1, border3+1).toArray();
	    
	    int[] decreasing1 = reverse(increasing1, border1);           // decreasing order
	    int[] decreasing2 = reverse(increasing2, border2);
	    int[] decreasing3 = reverse(increasing3, border3);
	    	    
		int[] random1 = random(border1);							 // random order
		int[] random2 = random(border2);
		int[] random3 = random(border3);
		
		int[] equal1 = equal(border1);                               // equal order
		int[] equal2 = equal(border2);
		int[] equal3 = equal(border3);
	    
		// Create sorting objects	
		HeapSort hp = new HeapSort();
		DualPivotQuickSort dpqs = new DualPivotQuickSort();
		BucketSort bs = new BucketSort();
		
		/*  // I create all possible sorting process and make them comment line. If I want trying one of them, I copy from here
		hp.sort(increasing1); hp.sort(increasing2); hp.sort(increasing3);
		hp.sort(decreasing1); hp.sort(decreasing2); hp.sort(decreasing3);
		hp.sort(random1);     hp.sort(random2);     hp.sort(random3);
		hp.sort(equal1);      hp.sort(equal2);      hp.sort(equal3);
		
		dpqs.dualPivotQuickSort(increasing1, 0, border1-1); dpqs.dualPivotQuickSort(increasing2, 0, border2-1); dpqs.dualPivotQuickSort(increasing3, 0, border3-1);
		dpqs.dualPivotQuickSort(decreasing1, 0, border1-1); dpqs.dualPivotQuickSort(decreasing2, 0, border2-1); dpqs.dualPivotQuickSort(decreasing3, 0, border3-1);
		dpqs.dualPivotQuickSort(random1, 0, border1-1);     dpqs.dualPivotQuickSort(random2, 0, border2-1);     dpqs.dualPivotQuickSort(random3, 0, border3-1);
		dpqs.dualPivotQuickSort(equal1, 0, border1-1);      dpqs.dualPivotQuickSort(equal2, 0, border2-1);      dpqs.dualPivotQuickSort(equal3, 0, border3-1);
		
		bs.bucketSort(increasing1, border1); bs.bucketSort(increasing2, border2); bs.bucketSort(increasing3, border3);
		bs.bucketSort(decreasing1, border1); bs.bucketSort(decreasing2, border2); bs.bucketSort(decreasing3, border3);
		bs.bucketSort(random1, border1);     bs.bucketSort(random2, border2);     bs.bucketSort(random3, border3);
		bs.bucketSort(equal1, border1);      bs.bucketSort(equal2, border2);      bs.bucketSort(equal3, border3);
		*/
		
		// Time calculation part
		long startTime = System.currentTimeMillis();
		bs.bucketSort(random1, border1);   // run one of the sorting methods
		long estimatedTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Estimated time is:");
		System.out.println((long)estimatedTime);
		/*
		System.out.println("Sorted array is");  // Print function
		printArray(random1);	
	    */	
	}
	
	static int[] equal(int n) {     // For fill array with equal value
		int[] equal = new int[n]; 
		for (int i = 0; i < n; i++) {
			equal[i] = 11;
		}
		return equal;
	}
	
	static int[] reverse(int a[], int n) {  // For reverse incresing ordered array
		int[] reverse = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			reverse[j - 1] = a[i];
			j = j - 1;
		}
		return reverse;
	}
	
	static int[] random(int n) {  // For fill array with random value
		Random rd = new Random(); // creating Random object
		int[] random = new int[n];
		for (int i = 0; i < n; i++) {
			random[i] = rd.nextInt(n); // storing random integers in an array between 0 and n(elements number)
		}
		return random;
	}	
	
	static void printArray(int arr[]) { // print array
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i]);
		System.out.println();
	}
}
