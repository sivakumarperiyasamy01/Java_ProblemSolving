package com.practice;

public class JavaDemo1 {

	public static void main(String[] args) {

		JavaDemo1 d1 = new JavaDemo1();

		// d1.searchingArray();
		// d1.findduplicates();
		// d1.findmax();
		// d1.findminimum();
		// d1.finduniqueElements();
		// d1.swap();
		// d1.leftShifting();
		// d1.rightShifting();
		d1.primenumber();

		// System.out.println(Integer.MAX_VALUE);
	}

//   prime number find
	private void primenumber() {

		// prime numbers mean it divides by 1 and and own (ex 5 divides only by 1 and 5
		// it is prime number)

		// int number = 7; // zero should come for 1 and own number when we divide,
		// except it should not be
		// zero

		boolean istrue = true;

//		for (int i = 2; i < number; i++) {
//
//			if (number % i == 0) {
//
//				System.out.println(number + " is not a prime number");
//				istrue = false;
//				break;
//			}
//
//		}

//		if (istrue) {
//			System.out.println(number + " is prime number");
//		}

	}

	// 1. Linear Search array- find out the target item

	private void searchingArray() {

		String[] products = { "shoe", "sandles", "phone", "watch" };

		String key = "shirt";

		boolean present = false; // to handle the edge case

		for (int i = 0; i < products.length; i++) {

			if (products[i].equals(key)) {

				System.out.println("the key product " + products[i] + " is present");
				present = true;
				break; // once target found we have to break the loop to avoid unnecessary check;
			}

		}

		// if target key not present in this array we have to handle that edge case also

		if (present == false) {
			System.out.println("the key products not present in the array");
		}

	}

	// 2. find duplicates in array

	private void findduplicates() {

		// to find duplicate take one num and compare it with next all numbers

		int[] num = { 10, 20, 50, 60, 50, 80, 10 };

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {
					System.out.print(num[i] + " ");
				}

			}
		}

		System.out.println();
	}

	// 3. find Maximum and second maximum num;

	private void findmax() {

		int[] num = { 70, 80, 90, 60, 20, 50, 5, 60, 60 };

		int fmax = 0;
		int secondmax = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > fmax) {
				fmax = num[i];
			}

		}

		for (int i = 0; i < num.length; i++) {

			if (num[i] > secondmax && num[i] != fmax) {
				secondmax = num[i];
			}
		}

		System.out.println(fmax);
		System.out.println(secondmax);

	}

	// find minimum number and second minimum

	private void findminimum() {

		int[] num = { 80, 90, 50, 60, 40, 10, 20 };

		int mini = 2147483647;
		int secondmini = 2147483647;

		for (int i = 0; i < num.length; i++) {

			if (num[i] < mini) {
				mini = num[i];
			}

		}

		for (int i = 0; i < num.length; i++) {

			if (num[i] < secondmini && num[i] != mini) {

				secondmini = num[i];
			}

		}

		System.out.println(mini);
		System.out.println(secondmini);
	}

	// 5. find unique elements

	private void finduniqueElements() {

		int[] num = { 10, 20, 10, 30, 50, 60, 70 };

		boolean istrue = true;

		for (int i = 0; i < num.length; i++) {
			istrue = true;

			for (int j = 0; j < num.length; j++) {

				if (num[i] == num[j] && i != j) {
					istrue = false;
					break;

				}

			}

			if (istrue) {
				System.out.print(num[i] + " ");
			}

		}

	}

	// 6. swap
	private void swap() {

		int a = 10;
		int b = 20;

		int c;

		c = a;
		a = b; // 20
		b = c; // 10

		a = a + b;
		b = a - b; // 30-20; =10
		a = a - b;// 30-10=20

		System.out.println(a);
		System.out.println(b);

	}

	// leftShifting
	private void leftShifting() {

		String[] superHero = { "odin", "thor", "loki", "hulk", "ironman" };

		// left-shifting-output thor, loki, hulk, ironman odin //

		for (int i = 0; i < superHero.length - 1; i++) {
			String temp = superHero[i];
			superHero[i] = superHero[i + 1];
			superHero[i + 1] = temp;
		}

		for (int i = 0; i < superHero.length; i++) {
			System.out.print(superHero[i] + " ");
		}
		System.out.println();
	}

	// right shifting

	private void rightShifting() {
		String[] superHero = { "odin", "thor", "loki", "hulk", "ironman" };

		// Right shifting ironman odin thor loki hulk

		// 4
		for (int i = superHero.length - 1; i > 0; i--) {
			String temp = superHero[i]; // ironman // store current value
			superHero[i] = superHero[i - 1]; // 4 index= assign 3rd index value
			superHero[i - 1] = temp;
		}

		// Print the array
		for (int i = 0; i < superHero.length; i++) {
			System.out.print(superHero[i] + " ");
		}

	}

}
