package Com.Test;

import java.util.stream.IntStream;

import Com.Model.BubbleSort;

public class BubbleSortTest {

	public class TestBubbleSort {

		public static void main(String[] args) {
			int[] arr = { 21, 2, 5, 1, 7, 8, 10, 3 };
			// BubbleSortAlgorithm.bubbleSort(arr);
			// BubbleSortAlgorithm.improvedbubbleSort(arr);
			BubbleSort.bubbleSortDescending(arr);
			System.out.println("xbhxbbhs");
			IntStream.of(arr).forEach(n -> System.out.println(n));

		}

	}
}
