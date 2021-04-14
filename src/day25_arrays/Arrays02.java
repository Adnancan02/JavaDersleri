package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Verilen bir Array de bir eleman�n olup olmad�g�n� nas�l kontrol eder�z?

		int arr[] = { 10, 25, 3, 16, 75 };
		int sayi = 25;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("array sorulan elemani iceriyor");

		} else {
			System.out.println("array sorulan eleman� icermiyor");
		}

		// Arrays class indan method kullanarak yapal�m
		// ilk once s�ralama yapmal�y�z.

		Arrays.sort(arr);// ilk once s�ralama yapmal�y�z.[3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, 25));// sonuc olarak aranan say�n�n index ini doner.
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 28));
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 100));
		// binary searc sonuc olarak arad�g�m�z eleman varsa indexini verir.
		// arad�g�m�z eleman yoksa isareti ile olsayd� kac�nc� eleman olacag�n�
		// d�ndurur.
		int arr2[] = { 12, 15, 25, 14, 3, 12, 65 };
		Arrays.sort(arr2);// [3,12,12,14,15,25,65]
		System.out.println(Arrays.binarySearch(arr2, 14));// 3
		System.out.println(Arrays.binarySearch(arr2, 20));// -6
		System.out.println(Arrays.binarySearch(arr2, 12));// 1
		System.out.println(Arrays.binarySearch(arr2, 2));// -1

		// Array nasil String e cevirilir.
		String arrayString = Arrays.toString(arr2);
		System.out.println(arrayString);

		System.out.println(arrayString.substring(5));// bastaki [ dahil tum array i String e cevirir. 5. index ten
										// sonras�n� yazd�rir.[= 0, 3=1, ,=2, bosluk=3, 1=4. 2 den sonras�n� yazd�r�r

	}

}
