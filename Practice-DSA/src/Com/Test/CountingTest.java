package Com.Test;

import java.util.Arrays;

import Com.Model.CountingSort;

public class CountingTest {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 4, 5, 2, 3, 1, 6, 8, 9, 7, 8, 9, };
		int[] fmxnv = CountingSort.count(arr);
		System.out.println(Arrays.toString(fmxnv));
	}
}
