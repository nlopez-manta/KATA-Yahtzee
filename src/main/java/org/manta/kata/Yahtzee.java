package org.manta.kata;

import java.util.Random;

/**
 * 
 * @author nlopez
 * 
 */
public class Yahtzee {

	int[] dices;

	public Yahtzee() {
		dices = new int[5];

		for (int i = 0; i < 5; i++) {
			dices[i] = 0;
		}
	}

	private int showRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		// get the range, casting to long to avoid overflow problems
		long range = (long) aEnd - (long) aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long) (range * aRandom.nextDouble());
		int randomNumber = (int) (fraction + aStart);
		return randomNumber;
	}

	public int[] getDices() {
		return dices;
	}

	public int[] roll() {
		int START = 1;
		int END = 6;
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			dices[i] = showRandomInteger(START, END, random);
		}

		return dices;
	}
/*
	public int getNumberOfSameD()
	{
		int answer = 0;
		
		for ( int i = 0 ; i < 5)
		
		int 
	}*/

	public int[] bubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) // change to > for ascending sort
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		
		return num;
	}
}
