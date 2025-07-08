package com.practice;

public class JavaDemo {

	public static void main(String[] args) {
		JavaDemo d1 = new JavaDemo();

		int[] num = { 50, 80, 90, 30, 70 };

		d1.findSum(num);
		d1.findSum2(num); // using forEach method
		d1.findOddNumber(); // from 1 to50 limit range
		d1.findEvenNumber();// from 1 to50 limit range
		d1.reverseArray(num);
		d1.findIndexPostionOfElement();
		d1.findCommonElement(); // using nested loop

	}
	

	// 1. find total sum using for loop
	private void findSum(int[] num) {

		int total = 0;

		for (int i = 0; i < num.length; i++) {

			total += num[i];

		}

		System.out.println(total);
	}

	// 1. find total sum using forEach method

	private void findSum2(int[] num) {

		int totalSum = 0;

		for (int n1 : num) {
			totalSum += n1;
		}

		System.out.println(totalSum);

	}

	// 2. find odd number
	private void findOddNumber() {

		int Limit = 50;

		for (int i = 1; i <= Limit; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

		}

		System.out.println();
	}

	// 3. find Even number
	private void findEvenNumber() {

		int limit = 50;

		for (int i = 1; i <= limit; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}

	// 4.reverseArray()

	private void reverseArray(int[] num) {
		// { 50, 80, 90, 30, 70 };
		// 0 1 2 3 4 -index (length=5; to find lastIndex= totalLength-1;)

		for (int i = num.length - 1; i >= 0; i--) {

			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

	// 5. Find IndexPostionOfElement

	private void findIndexPostionOfElement() {

		String[] Animals = { "lion", "tiger", "cat", "monkey", "elephant" };

		String target = "monkey";
		int index = -1; // if target not present in the array it will return -1;

		for (int i = 0; i < Animals.length; i++) {

			if (Animals[i].equals(target)) { // equal method compares String object values

				index = i;
				break; // once target found then assign the target index and break the loop
			}
		}

		System.out.print("the " + target + " animal was found at the index no" + " " + index);
		System.out.println();
	}

	// 6. findCommonElement

	private void findCommonElement() {

		int[] num1 = { 50, 20, 30, 80, 90 };
		int[] num2 = { 85, 60, 20, 90 };

		for (int i = 0; i < num1.length; i++) {

			for (int j = 0; j < num2.length; j++) {

				if (num1[i] == num2[j]) {
					System.out.print(num1[i] + " ");
				}
			}

		}

	}

}
