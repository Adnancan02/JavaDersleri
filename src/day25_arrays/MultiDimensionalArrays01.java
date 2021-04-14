package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/* I� i�e array olusturdugumuzda d�sardaki array e outer array
		  icerdeki kucuk array lere ise inner array denir.
        2- Eger icerdeki array lerin boyutlar� birbirinden farkl� ise 
        Array i ancak tum elemanlari yazarsak declare edebiliriz.
        3- Multi dimensional array de bir elemanin indexi i�in en d�sdaki array haric, elemana kadar i� i�e olan 
        tum arraylarin indexlerini yazmak gerekir

    */
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}};// iki katli bir array dir.
		// 11 i index ile ifade etmek istersek arr[2][2]
		
		// eger Array i uzunluklari declare etmek istersek inner arary uzunluklar� esit olmali.
		
		int arr2[][]= new int [3][2];
		// [3] ilk yaz�lan sayi outer array in i�inde kactane inner array oldugunu belirtir.
		//[2] her bir  inner array in uzunlugu
		System.out.println(Arrays.toString(arr2));
		
		// Multidimensional array leri yazd�rmak i�in toString method u kullan�lamaz .
		//C�nk� toString methodu outer array i String e cevirir.
		// outer array in i�inde inner rray ler oldugundan toString method unda inner array lerin referans degerleri yazd�r�l�r
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
