package com.Array;

import java.util.Scanner;

public class ArrayStudy {

	Scanner sc = new Scanner(System.in);
	int[] arr;
	int count;

	public ArrayStudy() {

		arr = new int[10];
		count = 0;

	}

	// Adding the element

	public boolean Addinlast(int x) {

		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		} else {
			return false;
		}
	}
// display array
	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
		
	}
	// searching the elemnet
	public int Searchbyvalue(int n) {
		for (int j = 0; j < count; j++) {
			if (n == arr[j]) {
				return j;
			}
		}
		return -1;
	}

	public boolean deletebyposition(int pos) {

		if (pos < count) {
			for (int i = pos + 1; i < count; i++) {
				arr[i - 1] = arr[i];
			}
				count--;
				return true;
			}
		

		return false;
	}

	public int deletebyvalue(int value) {

		int pos = Searchbyvalue(value);

		if (pos != -1) {

			boolean flag = deletebyposition(pos);
			return pos;

		}
		return -1;
	}

	public int findsum() {

		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum = sum + arr[i];

		}
		return sum;

	}

	public int findmax() {
		int max = arr[0];
		for (int i = 1; i < count; i++) {
			if (arr[i] > max) {
				max = arr[0];
			}
		}
		return max;

	}

	public int[] exchangeindexvalue() {
		int max = findmax();
		int arr1[] = new int[max + 1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=-1;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			int b=arr[i];
			arr1[b]=i;
		}
		return arr1;

	}

}
