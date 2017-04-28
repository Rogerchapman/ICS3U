/**
 * 
 */
package chapman;

import java.util.Scanner;

/**
 * @author 324660414
 *
 */
public class Life {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of living cells you want to enter the coordinates of");
		int[][] lifeWorld = new int[20][20];
		int cellsLiving = sc.nextInt();
		while (cellsLiving > 400) {
			System.out.println("Please enter a number of living cells that is less than or equal to 400.");
			cellsLiving = sc.nextInt();
		}
		for (int i = 0; i < cellsLiving; i++) {
			System.out.println("Please enter the coordinates of the cell (X Y)");
			int rowOfCell = sc.nextInt();
			int columnOfCell = sc.nextInt();
			while (rowOfCell >= 20 || columnOfCell >= 20) {
				System.out.println("Life World is only a 20 by 20 grid. Please enter coordinates from 0-19 for x and y (X Y)");
				rowOfCell = sc.nextInt();
				columnOfCell = sc.nextInt();
			}
			lifeWorld[rowOfCell][columnOfCell] = 1;

		}
		for (int i = 0; i < lifeWorld.length; i++) {
			for (int j = 0; j < lifeWorld[i].length; j++) {
				System.out.print(lifeWorld[i][j]);
			}
			System.out.println();
		}
		int counter = 0;
		boolean nextDay = true;
		int totalAlive = cellsLiving;
		for (int day = 1; nextDay == true&&totalAlive !=0; day++) {
			int[][] secretWorld = new int [20][20];
			for(int i = 0; i < 20; i ++){
				for(int k = 0; k < 20; k ++){
					secretWorld[i][k] = 0;
				}
			}
			System.out.println("Would you like to go to the next day in Life World? (true/ false)");
			nextDay = sc.nextBoolean();
			counter=0;
			for (int i = 0; i < lifeWorld.length; i++) {
				counter=0;
				for (int j = 0; j < lifeWorld[i].length; j++) {


					if (lifeWorld[i][j] == 1) {
						if (lifeWorld[i].length > j + 1) {
							if (lifeWorld[i][j + 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld[i].length > j - 1 && j - 1 >= 0) {
							if (lifeWorld[i][j - 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && i - 1 >= 0) {
							if (lifeWorld[i - 1][j] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i + 1) {
							if (lifeWorld[i + 1][j] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && lifeWorld[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
							if (lifeWorld[i - 1][j - 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && lifeWorld[i].length > j + 1 && i - 1 >= 0) {
							if (lifeWorld[i - 1][j + 1] == 1) {
								counter++;
							}
						}

						if (lifeWorld.length > i + 1 && lifeWorld[i].length > j - 1 && j - 1 >= 0) {
							if (lifeWorld[i + 1][j - 1] == 1) {
								counter++;
							}
						}

						if (lifeWorld.length > i + 1 && lifeWorld[i].length > j + 1) {
							if (lifeWorld[i + 1][j + 1] == 1) {
								counter++;
							}
						}
						if (counter == 2 || counter == 3) {
							secretWorld[i][j] = 1;
							totalAlive++;
						} else if (counter == 1 || counter == 4 || counter == 5 || counter == 6 || counter == 7|| counter == 8) {
							secretWorld[i][j] = 0;
							totalAlive--;
						}

						counter=0;

					} else if (lifeWorld[i][j] == 0) {

						counter=0;
						if (lifeWorld[i].length > j + 1) {
							if (lifeWorld[i][j + 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld[i].length > j - 1 && j - 1 >= 0) {
							if (lifeWorld[i][j - 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && i - 1 >= 0) {
							if (lifeWorld[i - 1][j] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i + 1) {
							if (lifeWorld[i + 1][j] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && lifeWorld[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
							if (lifeWorld[i - 1][j - 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i - 1 && lifeWorld[i].length > j + 1 && i - 1 >= 0) {
							if (lifeWorld[i - 1][j + 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i + 1 && lifeWorld[i].length > j - 1 && j - 1 >= 0) {
							if (lifeWorld[i + 1][j - 1] == 1) {
								counter++;
							}
						}
						if (lifeWorld.length > i + 1 && lifeWorld[i].length > j + 1) {
							if (lifeWorld[i + 1][j + 1] == 1) {
								counter++;
							}
						}
						if (counter == 3) {
							secretWorld[i][j] = 1;
							totalAlive++;
						}
						else if (counter == 1 || counter == 2 || counter == 4 || counter == 5 || counter == 6|| counter == 7 || counter == 8) {
							secretWorld[i][j] = 0;
						}

						counter=0;
					}
				}
			}
			lifeWorld = secretWorld;
			for(int i = 0; i < 20; i++){
				for (int j = 0; j < 20; j++){
					System.out.print(secretWorld[i][j]);
				}
				System.out.println();
			}
		}
	}
}
