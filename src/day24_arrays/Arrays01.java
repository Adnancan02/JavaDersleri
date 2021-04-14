package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30; 
		String isim= "Ali";
		// Java da birden fazla elemani koyabilecegimiz (store) object ler vardýr.
		
		int arr [] = {10,20,30}; // int [] arr seklinde kullanilabilir.
		// bu ornekte Arrat in  elemanlarýni dýrek yazdýgýmýz için
		// uzunluk belitmeye ýhtýyac kalamdý
		// bu kullanýmda max eleman sayýsý (length) yazdýgýmýz eleman sayýsýdýr
		System.out.println(arr);// Array bir object dir. eger direk olarak Arry yazdýrmak isterseniz, java referansý yazdýrýr.
		
		System.out.println(Arrays.toString(arr)); //[10, 20, 30]
		
		String takim[]= new String[7];// Java bir Arrays olusturdu. [null, null, null]
		
		System.out.println(Arrays.toString(takim));
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));//[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));
		//takim[3]="Mehmet";// Java Run Time Programdýr, dolayýsýyla array programý calsýtýrýlýnca olusturur.
		// 32. satýrda syntax olarak hata olmadýgýndan CTE olmaz.
		// program calýstýgýmdan 3.index olmadýgý için RTE verir
		//Array deki bit elemaný Update etme.
		// Veli nin yerine Kemal gelsin.
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim)); //[Ali, Kemal, Hasan]
		
		// Bir Array in uzunlugu nasil bulabiliriz.
		System.out.println(takim.length);//3
		                                 // String deki lengt() böyle idi Array'de length 
		
		//Array deki son elemani mehmet yapýnç
		
		takim[takim.length-1]= "Mehmet";
		
		
		System.out.println(Arrays.toString(takim));
		
		//  eger array in eleman sayýsý tek ise ortadaki elemani can yapalým
		if(takim.length%2==1) {
			int ortaIndex= (takim.length-1)/2;
			takim[ortaIndex]="Can";		}
		
		System.out.println(Arrays.toString(takim));
		
		
		
		
		
		
	}

}
