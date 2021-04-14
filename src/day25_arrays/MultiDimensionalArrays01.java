package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/* Iç içe array olusturdugumuzda dısardaki array e outer array
		  icerdeki kucuk array lere ise inner array denir.
        2- Eger icerdeki array lerin boyutları birbirinden farklı ise 
        Array i ancak tum elemanlari yazarsak declare edebiliriz.
        3- Multi dimensional array de bir elemanin indexi için en dısdaki array haric, elemana kadar iç içe olan 
        tum arraylarin indexlerini yazmak gerekir

    */
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}};// iki katli bir array dir.
		// 11 i index ile ifade etmek istersek arr[2][2]
		
		// eger Array i uzunluklari declare etmek istersek inner arary uzunlukları esit olmali.
		
		int arr2[][]= new int [3][2];
		// [3] ilk yazılan sayi outer array in içinde kactane inner array oldugunu belirtir.
		//[2] her bir  inner array in uzunlugu
		System.out.println(Arrays.toString(arr2));
		
		// Multidimensional array leri yazdırmak için toString method u kullanılamaz .
		//Cünkü toString methodu outer array i String e cevirir.
		// outer array in içinde inner rray ler oldugundan toString method unda inner array lerin referans degerleri yazdırılır
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
