package GeneralProgramming;
import java.util.Arrays;
import java.util.HashSet;

//Second Method : Using retainAll() Method

public class IntersectionOfMultipleArrays {

	public static void main(String[] args) {
		Integer[] inputArray1 = { 2, 3, 4, 7, 1 };
		Integer[] inputArray2 = { 4, 1, 3, 5 };
		Integer[] inputArray3 = { 8, 4, 6, 2, 1 };
		Integer[] inputArray4 = { 7, 9, 4, 1 };
		intersection(inputArray1, inputArray2, inputArray3, inputArray4);
	}

	static void intersection(Integer[]... inputArrays) {
		System.out.println("Input Arrays :");
		System.out.println("======================");
		for (Integer[] inputArray : inputArrays) {
			System.out.println(Arrays.toString(inputArray));
		}
		HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));
		for (int i = 1; i < inputArrays.length; i++) {
			HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));

			intersectionSet.retainAll(set);
		}
		System.out.println("===========================");
		System.out.println("Intersection Of All Input Arrays :");
		System.out.println("===========================");
		System.out.println(intersectionSet);
	}
}
