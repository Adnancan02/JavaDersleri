package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Verilen bir String Array e nas�l ceviririz?
		// verilen bir cumlede hkac kelime oldugunu bulunuz.
		// Verilen cumlede her kelimenin ilk harfini buyuk yap�n�z
		
		String str="Herkes Javay� tanisa severdi";
		// Bu String kel�melere ay�ral�m.
		// Split methodu
		
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		String arr2[]=str.split("Java");
		
		System.out.println(Arrays.toString(arr2));//
		
		String arr3[]= str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]= str.split("");
		System.out.println(Arrays.toString(arr4));
		

	}

}
