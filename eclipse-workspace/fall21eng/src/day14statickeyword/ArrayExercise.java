package day14statickeyword;

import java.util.Arrays;

public class ArrayExercise {
   /*Type a program like; given an array whose length is 3, return an array with the
	elements "rotated left"
	For example; if the array is [1, 2, 3] output will be [2, 3, 1].
	Exercise:
  
 */
	public static void main(String[] args) {
		int[ ] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++){
		System.out.print ( numbers[i] + " " );
		
	}

}}                   
