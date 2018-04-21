package GeneralProgramming;
import java.util.Arrays;

public class PairsOfElementsInArrayUsingAlternative {

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);
		findThePairs(new int[] { 12, 13, 10, 15, 8, 40, -15 }, 25);
		findThePairs(new int[] { 12, 23, 10, 41, 15, 38, 27 }, 50);

	}

	static void findThePairs(int inputArray[], int inputNumber) {
		Arrays.sort(inputArray);
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		int i = 0;
		int j = inputArray.length - 1;
		while (i < j) {
			if (inputArray[i] + inputArray[j] == inputNumber) {
				System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				i++;
				j--;
			}
			else if (inputArray[i] + inputArray[j] < inputNumber) {
				i++;
			}
			else if (inputArray[i] + inputArray[j] > inputNumber) {
				j--;
			}
		}
	}
}
