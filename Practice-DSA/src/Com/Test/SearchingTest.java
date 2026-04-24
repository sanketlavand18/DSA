package Com.Test;

import Com.Model.Searching;

public class SearchingTest {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 25, 6, 5, 35, 5, 61 };

		int pos = Searching.sequentialSearch(arr, 225);

		if (pos != -1) {
			System.out.println("number found at pos : " + pos);
		} else {
			System.out.println("not found");
		}

		int[] arr1 = { 5, 7, 12, 15, 26, 31, 33, 34, 38, 56, 67, 77, 78, 89 };

		int pos1 = Searching.binarySearchNonRecurssive(arr1, 31);
		if (pos1 != -1) {
			System.out.println("number found at : " + pos);
		} else {
			System.out.println("not found");
		}

		int pos3 = Searching.binarySearchRecurssive(arr1, 31, 0, 14);
		if (pos3 != -1)
			System.out.println("number found at : " + pos);
		else
			System.out.println("not found");

	}

}
