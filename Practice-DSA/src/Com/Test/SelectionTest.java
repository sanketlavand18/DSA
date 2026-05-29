package Com.Test;

import java.util.Arrays;

import Com.Model.SelectionSort;

public class SelectionTest {
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 7, 12, 9, 13, 15, 7, 2, 1, 8, 5 };
		SelectionSort.selectionSort(arr);
		
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr));
		
        SelectionSort.selectionSortDescending(arr);
		
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr));
		
		
	} 
	
}


