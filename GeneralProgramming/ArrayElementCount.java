package GeneralProgramming;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayElementCount {

	public static void main(String[] args) {
		arrayElementCount(new int[] { 4, 5, 4, 5, 4, 6 });
		System.out.println("-------------------------");
		arrayElementCount(new int[] { 12, 9, 12, 9, 10, 9, 10, 11 });
		System.out.println("-------------------------");
		arrayElementCount(new int[] { 891, 187, 891, 187, 891, 476, 555, 741 });
	}

	static void arrayElementCount(int inputArray[]) {
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		for (int i : inputArray) {
			if (elementCountMap.containsKey(i)) {
				elementCountMap.put(i, elementCountMap.get(i) + 1);
			} else {
				elementCountMap.put(i, 1);
			}
		}
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		System.out.println("Element Count : " + elementCountMap);
	}
}
