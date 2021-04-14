package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int arr[]= {10,23,54};//length=3
		String isimler[]= new String[4];// length =4 olan bos bir array olusturur.
		// Array de primitive datalar veya non-primitive dataların referansları store edilebilir.
		// Mesele isimler array inin içinde isim degerleri degil, isimlerin referansları olur.
		
		// array in elemanlarına ulasma ve update etme
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		//Array in tum elemanlarını yazdırma.
		System.out.println(isimler);// referansı yazdırır.
		System.out.println(Arrays.toString(isimler));//[Elveda, null, Boss, null]

		
		//method kullanmadan tum elemanlari yazdıralım
		// loop kullanılması lazım
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+ " ");
			
		}
		System.out.println();
		System.out.println(arr);// arr bir object non-primitive dolayısıyla referansı yazdırır. [I@4d591d15
		
		System.out.println(Arrays.toString(arr));
		
		// Arrays in elemanlarıni nasıl sıralayabiliriz
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		Arrays.sort(isimler);
	
		System.out.println(Arrays.toString(isimler));
	

		
	}

}
