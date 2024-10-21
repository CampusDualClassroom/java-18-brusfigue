package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static int[] createAndInitializeArray(int num) {
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i + 1;
		}
			return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.println(" ");
			}
		}
		System.out.println();
	}



	public static void main(String[] args) {
		int num = Utils.integer("Introduce un número para crear un array de los primeros números naturales: ");
		int[] intArray = createAndInitializeArray(num);
		showInlineArray(intArray);
		}
	}