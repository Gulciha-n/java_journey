package arrays;

public class Multi_Dimensional_Arrays {

	public static void main(String[] args) {
		String[][] cities = new String[2][2];
		cities[0][0] = "Istanbul";
		cities[0][1] = "Ankara";
		cities[1][0] = "Gaziantep";
		cities[1][1] = "Bursa";

		for (int row = 0; row < 2; row++) {
			System.out.println("------------------");
			for (int column = 0; column < 2; column++) {
				System.out.println(cities[row][column]);
			}
		}

		int[][] numbers = { { 1, 2, 5, 7 }, { 8, 2, 5, 6 } };
		for (int[] nums : numbers) {
			System.out.println("-------------------");
			for (int num : nums) {
				System.out.println(num);
			}
		}

		System.out.println("----------------");

		char[][] letters = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				System.out.println(letters[i][j]);
			}
		}
	}
}
