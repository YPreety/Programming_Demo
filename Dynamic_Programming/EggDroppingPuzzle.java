package Dynamic_Programming;

//involving n=2 eggs and a building with k=36 floors.
/*Suppose that we wish to know which stories in a 36-story building are safe to drop eggs from, and which will cause the eggs to 
break on landing. We make a few assumptions:

An egg that survives a fall can be used again.
A broken egg must be discarded.
The effect of a fall is the same for all eggs.
If an egg breaks when dropped, then it would break if dropped from a higher floor.
If an egg survives a fall then it would survive a shorter fall.
It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor do not cause an egg to break.*/

/*Time Complexity: O(nk^2)
Auxiliary Space: O(nk)*/

public class EggDroppingPuzzle {

	public static void main(String[] args) {
		int n = 2, k = 36;
		System.out.println(
				"Minimum number of trials in worst case with " + n + "  eggs and " + k + " floors is " + eggDrop(n, k));
	}

	static int eggDrop(int n, int k) {
		/* trials needed for i eggs and j floors. */
		int eggFloor[][] = new int[n + 1][k + 1];
		int res;
		int i, j, x;

		// We need one trial for one floor and0 trials for 0 floors
		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}

		// We always need j trials for one egg and j floors.
		for (j = 1; j <= k; j++)
			eggFloor[1][j] = j;

		// Fill rest of the entries in table using optimal substructure property
		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for (x = 1; x <= j; x++) {
					res = 1 + max(eggFloor[i - 1][x - 1], eggFloor[i][j - x]);
					if (res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}

		// eggFloor[n][k] holds the result
		return eggFloor[n][k];
	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
