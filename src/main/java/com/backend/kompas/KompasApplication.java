package com.backend.kompas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class KompasApplication {
	public static void main(String[] args) {
		/**
		 * Level 1
		 */

		/**
		 * Level 2
		 *
		 * untuk soal level 2 terkait query untuk melihat gaji terbesar dapat menggunakan query berikut
		 *
		 * select t.*, p.gaji, (t.tunjangan + p.gaji) as total_gaji
		 * from tunjangan t
		 * inner join pekerjaan p on p.id = t.pekerjaan
		 * order by total_gaji desc;
		 *
		 * total gaji terbesar : Rey dgn pekerjaan akuntansi
		 */


		/**
		 * Level 3
		 */
		String inputBrackets = "[]{}()";	// change input value here for brackets
		boolean result = BalanceBracket.areBracketsBalanced(inputBrackets);
		System.out.println("=level 3=");
		System.out.println("input brackets: " + inputBrackets + " | " + "output: " + result);

		/**
		 * Level 4
		 */

		/**
		 * Level 5
		 */
		String romanValue = "IX";	// change roman input value here
		int intValue = RomanToNumber.romanToDecimal(romanValue);
		System.out.println("=level 5=");
		System.out.println("roman value: " + romanValue + " | " + "int value: " + intValue);

		/**
		 * Level 6
		 */
		int[] initArray = new int[] { 5, 3, 2, 8, 1, 4};
		int[] sortedArray = SortArray.sortArray(initArray);
		System.out.println("=level 6=");
		System.out.println("init array: " + Arrays.toString(initArray) + " | " + "sorted array: " + Arrays.toString(sortedArray));

		SpringApplication.run(KompasApplication.class, args);
	}

}
