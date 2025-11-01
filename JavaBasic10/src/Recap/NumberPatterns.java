package Recap;

public class NumberPatterns {
	// 1111
	// 2222
	// 3333
	// 4444

	public static void main(String[] args) {

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}

			System.out.println();
		}

		System.out.println("----------------");
		// 1234
		// 1234
		// 1234
		// 1234

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(col);
			}

			System.out.println();
		}

	}

}
