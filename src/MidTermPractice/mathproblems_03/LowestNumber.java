package MidTermPractice.mathproblems_03;

import databases.ConnectDatabase;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	/*
	 * Write java solution to find the lowest number from this array.
	 * Use one of the databases from mysql or mongodb to store and to retrieve.
	 */
	//int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
	//find lowest number from the array

	public static int getLowest(int[] array, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
	}

	public static void main(String[] args) {

		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
		System.out.println(" The Lowest Number : " + getLowest(array, 26));

		System.out.println(" ***************************************************************************** ");


		ConnectDatabase connectDatabase = new ConnectDatabase();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDatabase.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDatabase.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}

}
