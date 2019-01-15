package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		Random randy = new Random();
		
		//1. make an array of 5 Strings
		String[] five = new String[5];
		//2. print the third element in the array
		System.out.println(five[2]);
		//3. set the third element to a different value
		five[2] = "Meeoow";
		//4. print the third element again
		System.out.println(five[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<five.length;i++) {
		     System.out.println(five[i]);
		}
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<fifty.length;i++) {
		     fifty[i] = randy.nextInt(101);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int lowest = fifty[0];
		int highest = fifty[0];
		for (int i = 0; i<fifty.length;i++) 
		{
		if(fifty[i] < lowest)
		{
			lowest = fifty[i];
		}
		}
		System.out.println(lowest);
		//9 print the entire array to see if step 8 was correct
		System.out.println(fifty);
		//10. print the largest number in the array.
		for (int i = 0; i<fifty.length;i++) 
		{
		if(fifty[i] > highest)
		{
			highest = fifty[i];
		}
		}
		System.out.println(highest);
	}
}
