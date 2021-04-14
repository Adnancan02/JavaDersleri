package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int arr[]= {10,23,54};//length=3
		String isimler[]= new String[4];// length =4 olan bos bir array olusturur.
		// Array de primitive datalar veya non-primitive datalar�n referanslar� store edilebilir.
		// Mesele isimler array inin i�inde isim degerleri degil, isimlerin referanslar� olur.
		
		// array in elemanlar�na ulasma ve update etme
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		//Array in tum elemanlar�n� yazd�rma.
		System.out.println(isimler);// referans� yazd�r�r.
		System.out.println(Arrays.toString(isimler));//[Elveda, null, Boss, null]

		
		//method kullanmadan tum elemanlari yazd�ral�m
		// loop kullan�lmas� laz�m
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+ " ");
			
		}
		System.out.println();
		System.out.println(arr);// arr bir object non-primitive dolay�s�yla referans� yazd�r�r. [I@4d591d15
		
		System.out.println(Arrays.toString(arr));
		
		// Arrays in elemanlar�ni nas�l s�ralayabiliriz
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		Arrays.sort(isimler);
	
		System.out.println(Arrays.toString(isimler));
	

		
	}

}
