package Com.Model;



public class CountingSort {

	private static int findmaxint(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

	public static int[] count(int[] arr) {

		int max = findmaxint(arr);
		int[] cn = new int[max + 1];

		for (int i = 0; i < cn.length; i++) {
			cn[i] = 0;
		}
		for (int i = 0; i < cn.length; i++) {
			int pos = arr[i];
			cn[pos]++;
		}

		int[] cumalativesum = new int[max + 1];
		cumalativesum[0] = 0;
		for (int i = 0; i < cn.length; i++) {
			cumalativesum[i] = cn[i] + cumalativesum[i];

		}

		int[] output = new int[arr.length];
		for (int i = 0; i < cumalativesum.length; i++) {

			int pos = arr[i];

			cn[pos] = cn[pos - 1];

			int idx = cn[pos];

			output[idx] = arr[i];

		}
		return output;
	}
}
