package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// karısık sıralı verilen bir array i sıralı olarak yazdırın.
		
		
		int arr[]= {25,17,6,78,45,69,1};
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		// ayni array in buyukten kucuge dogru nasıl yazdırabılırız?
		
		for (int i = arr.length-1;i>=0 ;i--) {
		
			System.out.print(arr[i] +" ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		// Aynı array i buyukten kucuge dogrun nasıl sıralayabılırız?
		
		int arrTers[]= new int[arr.length];// ilk array in uzunluguna esıt yenı bır array olusturdum
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
