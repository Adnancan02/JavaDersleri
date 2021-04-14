package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		// Verilen bir Array i liste ye nas�l cevirebiliriz.
		
		String arr[]= {"Ali","Veli"};
		
		List<String> listArr= Arrays.asList(arr);
		
		System.out.println(listArr);
		
		Integer arr1[]= {1,2,3};
		List<Integer> list2 =Arrays.asList(arr1);
		
		System.out.println(list2);//[1, 2, 3]
		
		// Bazen cok fazla eleman� olan bir liste olusturmmam�z gerekir
		// Bu durumda listenelemanlar�n� tek tek eklemek yerine 
		// elemanlar� bir Array e ekler,  sonra da array i list e cevirebiliriz.
		// ornek bir web sitesinde tum urunleri bir listeye eklemek istedi�imizde
		// ornek bir web sitesinde tum urunleri bir listese eklemek istedi�imizde
		//Ancak bu  method la array den cevirdi�imiz list esnek olmaz
		// array in ozlliklerini tasir) add(), remove (), clear() gibi uzunlugu etkileyen methodlar kullan�l�r
		
		// Java bu deg�s�mdeki Array ve List i senkronize eder, birinde yapt�g�m�z degisiklik otomatik olarak di�erini de Update eder
		// arr1 array ve list2 listesi senkron cal�s�r, birinde yapt�g�m�z degisiklik di�erine de i�lenir.
		
		arr1[1]=5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2 :" + list2);
		
		list2.set(2, 13);
		System.out.println("list2 :" + list2);
		System.out.println("array: " + Arrays.toString(arr1));
		
		
		
		
		

	}

}
