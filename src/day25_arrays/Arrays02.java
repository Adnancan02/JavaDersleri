package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Verilen bir Array de bir elemanýn olup olmadýgýný nasýl kontrol ederýz?

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
			System.out.println("array sorulan elemaný icermiyor");
		}

		// Arrays class indan method kullanarak yapalým
		// ilk once sýralama yapmalýyýz.

		Arrays.sort(arr);// ilk once sýralama yapmalýyýz.[3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, 25));// sonuc olarak aranan sayýnýn index ini doner.
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 28));
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 100));
		// binary searc sonuc olarak aradýgýmýz eleman varsa indexini verir.
		// aradýgýmýz eleman yoksa isareti ile olsaydý kacýncý eleman olacagýný
		// döndurur.
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
										// sonrasýný yazdýrir.[= 0, 3=1, ,=2, bosluk=3, 1=4. 2 den sonrasýný yazdýrýr

	}

}
