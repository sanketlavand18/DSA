package Com.Model;

import java.util.Scanner;

public class A_2D_Array {
	private int[][] arr;

	public A_2D_Array() {
		arr = new int[3][3];
	}

	public A_2D_Array(int row, int col) {
		arr = new int[row][col];
	}

	public A_2D_Array(int[][] arr) {
		this.arr = arr;
	}

	Scanner sc = new Scanner(System.in);

	public void acceptData() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("enter the values at " + i + j + "position");
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	// find sum row wise
	public int[] rowWiseSum() {
		int[] sum = new int[(arr.length)];
		for (int i = 0; i < arr.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] = +arr[i][j];
			}
		}
		return sum;
	}

	// find sum column wise
	public int[] columnWiseSum() {
		int[] sum = new int[(arr.length)];
		for (int i = 0; i < arr[i].length; i++) {
			sum[i] = 0;
			for (int j = 0; j < arr.length; j++) {
				sum[i] = +arr[i][j];
			}
		}
		return sum;
	}

	// add 2D Array
	public int[][] add2DArray(A_2D_Array obj) {
		int[][] add = new int[arr.length][arr[0].length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add.length; j++) {
				add[i][j] = this.arr[i][j] + obj.arr[i][j];
			}
		}
		return add;
	}

	// subtract 2D Array
	public int[][] sub2DArray(A_2D_Array obj) {

		int[][] sub = new int[arr.length][arr[0].length];
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {

				sub[i][j] = this.arr[i][j] - obj.arr[i][j];

			}
		}
		return sub;

	}

}
