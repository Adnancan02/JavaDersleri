package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		// Verilen bir Array i liste ye nasýl cevirebiliriz.
		
		String arr[]= {"Ali","Veli"};
		
		List<String> listArr= Arrays.asList(arr);
		
		System.out.println(listArr);
		
		Integer arr1[]= {1,2,3};
		List<Integer> list2 =Arrays.asList(arr1);
		
		System.out.println(list2);//[1, 2, 3]
		
		// Bazen cok fazla elemaný olan bir liste olusturmmamýz gerekir
		// Bu durumda listenelemanlarýný tek tek eklemek yerine 
		// elemanlarý bir Array e ekler,  sonra da array i list e cevirebiliriz.
		// ornek bir web sitesinde tum urunleri bir listeye eklemek istediðimizde
		// ornek bir web sitesinde tum urunleri bir listese eklemek istediðimizde
		//Ancak bu  method la array den cevirdiðimiz list esnek olmaz
		// array in ozlliklerini tasir) add(), remove (), clear() gibi uzunlugu etkileyen methodlar kullanýlýr
		
		// Java bu degýsýmdeki Array ve List i senkronize eder, birinde yaptýgýmýz degisiklik otomatik olarak diðerini de Update eder
		// arr1 array ve list2 listesi senkron calýsýr, birinde yaptýgýmýz degisiklik diðerine de iþlenir.
		
		arr1[1]=5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2 :" + list2);
		
		list2.set(2, 13);
		System.out.println("list2 :" + list2);
		System.out.println("array: " + Arrays.toString(arr1));
		
		
		
		
		

	}

}
