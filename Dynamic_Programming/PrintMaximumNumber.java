package Dynamic_Programming;

/*How to print maximum number of A�s using given four keys.Imagine you have a special keyboard with the following keys: 
Key 1:  Prints 'A' on screen
Key 2: (Ctrl-A): Select screen
Key 3: (Ctrl-C): Copy selection to buffer
Key 4: (Ctrl-V): Print buffer on screen appending it after what has already been printed. 

If you can only press the keyboard for N times (with the above four keys), write a program to produce maximum numbers of A's. That is to
say, the input parameter is N (No. of keys that you can press), the output is M (No. of As that you can produce).

Input:  N = 3
Output: 3
We can at most get 3 A's on screen by pressing 
following key sequence.
A, A, A

Input:  N = 7
Output: 9
We can at most get 9 A's on screen by pressing 
following key sequence.
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V*/
public class PrintMaximumNumber {

	public static void main(String[] args) {
		int N;
		for (N = 1; N <= 20; N++)
			System.out.println("Maximum Number of A's with keystrokes is " + N + findoptimal(N));
	}

	static int findoptimal(int N) {
		if (N <= 6)
			return N;
		int max = 0;
		int b;
		for (b = N - 3; b >= 1; b--) {
			int curr = (N - b - 1) * findoptimal(b);
			if (curr > max)
				max = curr;
		}
		return max;
	}
}
