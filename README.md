# Sorting Algorithms

## Table of Contents

* [About the Project](#about-the-project)
* [Information About Algorithms](#information-about-algorithms)
  * [Heapsort Algorithm](#heapsort-algorithm)
  * [Dual Pivot Quick Sort Algorithm](#dual-pivot-quick-sort-algorithm)
  * [Bucket Sort Algorithm](#bucket-sort-algorithm)
* [Analysis of Algorithms](#analysis-of-algorithms)
  * [Comparison Table](#comparison-table)
  * [Running Time Table](#running-time-table)
* [Analysis of Tables](#analysis-of-tables)
  * [Heapsort Algorithm](#heapsort-algorithm)
  * [Dual Pivot Quick Sort Algorithm](#dual-pivot-quick-sort-algorithm)
  * [Bucket Sort Algorithm](#bucket-sort-algorithm)
* [Built With](#built-with)
* [Contact](#contact)

## About The Project
This project aims to implement,test and compare all three sorting algorithms: Heapsort, DualPivotQuickSort and Bucketsort.

## Information About Algorithms

### Heapsort Algorithm
The Heapsort algorithm involves preparing the list by first turning it into a max heap. The algorithm then repeatedly swaps the first value of the list with the last value, decreasing the range of values considered in the heap operation by one, and sifting the new first value into its position in the heap. This repeats until the range of considered values is one value in length.

### Dual Pivot Quick Sort Algorithm
The idea of dual pivot quick sort is to take two pivots, one in the left end of the array and the second, in the right end of the array. The left pivot must be less than or equal to the right pivot, so we swap them if necessary.

### Bucket Sort Algorithm
Bucket Sort is a sorting technique that sorts the elements by first dividing the elements into several groups called buckets. The elements inside each bucket are sorted using any of the suitable sorting algorithms or recursively calling the same algorithm.

## Analysis of Algorithms
### Comparison Table
![alt text](https://github.com/enes-sahinn/Sorting-Algorithms/blob/master/comparison_table.png)

### Running Time Table
![alt text](https://github.com/enes-sahinn/Sorting-Algorithms/blob/master/running_time_table.png)

## Analysis of Tables
### Heapsort Algorithm
According to my observations, the most effective and efficient algorithm in all cases was heap sort. The result was growing by approximately nlgn rate. Time was going from 2 to 15 if I multiply the n with 10. \
The max-heapify fuction of heapsort running in O(lgn) time. Because according to our lecture book children subtree size would be 2n/3 at the most. So the T(n) function would be T(n) = T(2n/3) + 1. If we solve this function with Master Method. A comparison will occur as follows: nlog13/2  versus 1. The result would be           O(lgn * 1) = O(lgn) because they are equal.\
When we are building max heap we invoke max-heapify function n/2 times. So the time complexity this part is O(nlgn). 
In the sorting part of this algorithm we invoke max-heapify function n-1 times. So the time complexity this part is approximately O(nlgn).\
As a result if we add them all we get the approximately O(2nlgn) = O(nlgn).

### Dual Pivot Quick Sort Algorithm
The time results of the dual pivot quick sort algorithm changed according to the situation. I got a stack overflow error when the elements of the array have 100,000 elements in ascending or descending order. Because the Quick sort algorithm requires more stack space due to its recursive nature. I solved this problem by changing VM arguments with “-Xss100m”. Also when the elements distrubuted randomly or evenly, the algorithm runned very well because in the randomly distrubuted situation, one side of the pivot was not empty. So it runned more faster than descending or ascending ordered array.\
In the partition function, it runs at approximately the same speed (O(n)) with single pivot quick sort, although slightly faster than it.\
In the sorting part, if the array ordered descending or ascending order it would be worst case. T(n) function would be T(n) = T(n-1) + T(0) + O(n) so if I solve this by recursion tree method, I get O(n2). If the array ordered randomly it would be best case or average case. T(n) function would be T(n) = 2T(n/2) + O(n) like merge sort algorithm. And if I solve this by substitution method, I guess T(n) = O(nlgn) so I get the cn <= dn equality and this would be true for positive constants. So the the time complexity for average and best case would be O(nlgn).

### Bucket Sort Algorithm
According to the results, I can say that the bucket sort works a little slower than the other algorithms except for the worst case situation of dual pivot quick sort. But in theorotical, the best and average case of bucket sort (O(n)) is smaller than other algorithms’ cases. I could not understand that this was practically different. Also there is one thing that affect the runtime of algorithm, probably most importing thing according to my observations. The bucket number. At the beginning of the algorithm I choosed a elements number in the array(n) for bucket number. And I observed that the runtime was a little too much. And I decided to decrease it. And after many trials I decided that the optimal number for bucket number was n/3. n/2 was fine too, but n/3 was slightly faster.\
In the insertion sort function, if the array is in ascending order, it would be best case and time complexity would be O(n), in all other case O(n2).\
In the sorting part, the worst-case scenario occurs when all the elements are placed in a single bucket. In other words if all elements are clustered in a one range it occurs and the time complexity would be O(n2). In all other cases, the average case and the best case generally have the same time complexity, O(n).

## Built With
* Java

## Contact
Mail: enessah200@gmail.com\
LinkedIn: [linkedin.com/in/enes-sahinn](https://www.linkedin.com/in/enes-sahinn/)\
Project Link: [Sorting-Algorithms](https://github.com/enes-sahinn/Sorting-Algorithms)

