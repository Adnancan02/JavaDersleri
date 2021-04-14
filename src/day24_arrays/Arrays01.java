package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30; 
		String isim= "Ali";
		// Java da birden fazla elemani koyabilecegimiz (store) object ler vard�r.
		
		int arr [] = {10,20,30}; // int [] arr seklinde kullanilabilir.
		// bu ornekte Arrat in  elemanlar�ni d�rek yazd�g�m�z i�in
		// uzunluk belitmeye �ht�yac kalamd�
		// bu kullan�mda max eleman say�s� (length) yazd�g�m�z eleman say�s�d�r
		System.out.println(arr);// Array bir object dir. eger direk olarak Arry yazd�rmak isterseniz, java referans� yazd�r�r.
		
		System.out.println(Arrays.toString(arr)); //[10, 20, 30]
		
		String takim[]= new String[7];// Java bir Arrays olusturdu. [null, null, null]
		
		System.out.println(Arrays.toString(takim));
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));//[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));
		//takim[3]="Mehmet";// Java Run Time Programd�r, dolay�s�yla array program� cals�t�r�l�nca olusturur.
		// 32. sat�rda syntax olarak hata olmad�g�ndan CTE olmaz.
		// program cal�st�g�mdan 3.index olmad�g� i�in RTE verir
		//Array deki bit eleman� Update etme.
		// Veli nin yerine Kemal gelsin.
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim)); //[Ali, Kemal, Hasan]
		
		// Bir Array in uzunlugu nasil bulabiliriz.
		System.out.println(takim.length);//3
		                                 // String deki lengt() b�yle idi Array'de length 
		
		//Array deki son elemani mehmet yap�n�
		
		takim[takim.length-1]= "Mehmet";
		
		
		System.out.println(Arrays.toString(takim));
		
		//  eger array in eleman say�s� tek ise ortadaki elemani can yapal�m
		if(takim.length%2==1) {
			int ortaIndex= (takim.length-1)/2;
			takim[ortaIndex]="Can";		}
		
		System.out.println(Arrays.toString(takim));
		
		
		
		
		
		
	}

}
