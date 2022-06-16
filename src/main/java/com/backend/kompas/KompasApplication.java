package com.backend.kompas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class KompasApplication {
	public static void main(String[] args) {
		/**
		 * Level 1
		 */
		//	change string array value here
		String[] stringArray = new String[] {"budi", "bermain", "bola", "di", "halaman", "rumah"};
		List<String> newArray = NewStringArray.newStringArray(Arrays.asList(stringArray));
		System.out.println("=level 1=");
		System.out.println("init string array: " + Arrays.toString(stringArray) + " | " + "new array list: " + newArray.toString());

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
		System.out.println("=level 2=");
		System.out.println("Gaji tertinggi : Rey");

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
		HashMap<String, String[]> hashMap = new HashMap<>();
		hashMap.put("A1", new String[]{"Akuntansi", "Programming", "Information System", "Data Structure"});
		hashMap.put("A2", new String[]{"Akuntansi", "Programming", "Algorithm", "Algorithm II"});
		hashMap.put("A3", new String[]{"Algorithm II", "Algorithm", "Information System", "Data Structure"});
		var manipulated = HashMapManipulation.manipulate(hashMap);
		System.out.println("=level 4=");
		System.out.println(manipulated);

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
		int[] sortedArray = SortArray.sortArray(initArray.clone());
		System.out.println("=level 6=");
		System.out.println("init array: " + Arrays.toString(initArray) + " | " + "sorted array: " + Arrays.toString(sortedArray));

		SpringApplication.run(KompasApplication.class, args);
	}

}
