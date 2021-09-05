package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = { "Hello", "Hi", "Hola", "Aloha" };
		// 2. print the third element in the array
		System.out.println(array[2]);
		// 3. set the third element to a different value
		array[2] = "Different";
		// 4. print the third element again
		System.out.println(array[2]);
		System.out.println("-------Separation--------");
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-------Separation--------");
		// 6. make an array of 50 integers
		Random ran = new Random();
		int[] array1 = new int[50];
		for (int i = 0; i < 50; i++) {
			int num = ran.nextInt(100);
			array1[i] = num;
			
		}
		int nu = array1[0];
		for (int i = 0; i < 50; i++) {
			if (array1[i] < nu) {
				nu = array1[i];
			}

		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("The smallest integer is " + nu);
		for (int i = 0; i < 50; i++) {
			if (array1[i] > nu) {
				nu = array1[i];
			}

		}
	
		System.out.println("The largest integer is " + nu);
		// 7. use a for loop to make every value of the integer array a random number

		// 8. without printing the entire array, print only the smallest number in the
		// array

		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
