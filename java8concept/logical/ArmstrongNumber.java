package com.test.java8concept.logical;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int originalNum, digit, cubeSum = 0, num;
		num = 407;
		originalNum = num;
		while (num != 0) {
			digit = num % 10;
			cubeSum += Math.pow(digit, 3);
			num /= 10;
		}
		if (cubeSum == originalNum) {
			System.out.println(originalNum + " is an Armstrong number");
		} else {
			System.out.println(originalNum + " is not an Armstrong number");
		}
	}
}
