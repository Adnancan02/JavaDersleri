package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// kar�s�k s�ral� verilen bir array i s�ral� olarak yazd�r�n.
		
		
		int arr[]= {25,17,6,78,45,69,1};
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		// ayni array in buyukten kucuge dogru nas�l yazd�rab�l�r�z?
		
		for (int i = arr.length-1;i>=0 ;i--) {
		
			System.out.print(arr[i] +" ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		// Ayn� array i buyukten kucuge dogrun nas�l s�ralayab�l�r�z?
		
		int arrTers[]= new int[arr.length];// ilk array in uzunluguna es�t yen� b�r array olusturdum
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
