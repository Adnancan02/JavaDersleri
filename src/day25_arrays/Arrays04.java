package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// iki array in esit oldugunu kontrol etme.
		
		int arr1[] = {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		// �ki array in birbirine esit olmas� i�in hem uzunluklar�, icindek� tum elemanlar , 
		// ve esit elemanlar�n index leri esit olmal�d�r.
		
		

	}

}
