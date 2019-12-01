package cs146F19.Swanson.project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MaxSubarrayAlgorithms {


	//converting the txt file into array
	public int [] txtToArray(Scanner scan) throws FileNotFoundException {	
		//using scanner to store the integers into arraylist
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			list.add(scan.nextInt());
		}
		//copying the contents of list into the array
		int [] a = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			a[i] = list.get(i);
		}
		return a;
	}




	//method that considers all possibilities
	public static MaxSubarray bruteForceAlg(int [] array) {
		//initializing variables
		int bestArrive = -1;
		int bestDepart = -1;
		int maxProfit = 0;

		//trying out every possible combinations
		for(int arrive = 0; arrive < array.length; arrive++) {

			for(int depart = arrive; depart < array.length; depart++) {
				//reset profit val for each combination of arrive/depart
				int profit = 0;
				int day = arrive;

				while(day <= depart) {
					//storing all possible profits for different combination of arrive/depart pairs
					profit += array[day];
					day++;
				}

				if(maxProfit < profit) {
					//updating if condition is the current profit is greater than the max
					maxProfit = profit;
					bestArrive = arrive;
					bestDepart = depart;
				}
			}
		}
		return new MaxSubarray(maxProfit, bestArrive, bestDepart);	
	}




	//finding the sum that includes the middle point
	public static MaxSubarray findCrossSum(int [] array, int left, int mid, int right) {
		int arrive = -1;
		int depart = -1;
		//start from finding the max sum from left of mid
		int sum = 0;
		int leftSum = Integer.MIN_VALUE;
		for(int i = mid; i >= 0; i--) {
			sum += array[i];
			if(sum > leftSum) {
				leftSum = sum;
				arrive = i;
			}
		}
		//now to the right of mid
		sum = 0;
		int rightSum = Integer.MIN_VALUE;
		for(int i = mid+1; i <= right; i++) {
			sum += array[i];
			if(sum > rightSum) {
				rightSum = sum;
				depart = i;
			}
		}
		//combine and return
		return new MaxSubarray(leftSum + rightSum, arrive, depart);
	}


	//method for comparing the three subarrays by their max sum
	private static MaxSubarray max(MaxSubarray sub1, MaxSubarray sub2, MaxSubarray sub3) {
		MaxSubarray biggest;
		if(sub1.getProfit() > sub2.getProfit())
			biggest = sub1;
		else
			biggest = sub2;
		if(biggest.getProfit() > sub3.getProfit())
			return biggest;
		return sub3;
	}

	private static MaxSubarray max(MaxSubarray sub1, MaxSubarray sub2) {
		MaxSubarray biggest;
		if(sub1.getProfit() > sub2.getProfit())
			return sub1;
		return sub2;
	}


	//method for divide and conquer
	public static MaxSubarray divideConquerAlg(int [] array, int left, int right) {

		//base case
		int maxProfit = 0;
		if (left == right) {
			maxProfit = array[left];
			return new MaxSubarray(maxProfit, left, right);
		}

		//the mid point
		int mid = (left+right)/2;

		//recursion 
		MaxSubarray biggestSub =   max(max(divideConquerAlg(array, left, mid),
				divideConquerAlg(array, mid+1, right)),
				findCrossSum(array, left, mid, right));

		return new MaxSubarray((int)(Math.floor(biggestSub.getProfit())), 
				(int)(Math.floor(biggestSub.getArrive())), 
				(int)(Math.floor(biggestSub.getDepart())));
	}




	//dynamic algorithm
	public static MaxSubarray kadanesAlg(int [] array) {
		int maxProfit = 0;
		int maxTemp = 0;
		int arrive = -1;
		int depart = -1;
		int tempArrive = 0;

		for (int i = 0; i < array.length; i++) {
			maxTemp = maxTemp + array[i];
			if(maxTemp < 0) {
				maxTemp = 0;
				arrive = i+1;
			}
			if(maxProfit < maxTemp) {
				maxProfit = maxTemp;
				depart = i;
				tempArrive = arrive;
			}
		}
		arrive = tempArrive;
		//returns depart = -1 if sum is < 0
		return new MaxSubarray(maxProfit, arrive, depart);
	}


	//method for figuring out execution time for each algorithm
	public static long testRuns(int n) {
		int time = 0;
		for(int i = 0; i < 10; i++) {
			int [] arr = new int [n];
			for(int k = 0; k < n; k++) {
				arr[k] = ThreadLocalRandom.current().nextInt(-100, 101);
			}
			long startTime = System.nanoTime();
			kadanesAlg(arr);
			long endTime   = System.nanoTime();
			time += endTime - startTime;
		}
		return time/10;
	}
}
