package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		//toplama(list) : varargs esnek oldugu için list e benzese de list degildir.
		
		int arr[]= {15,20,25};
		toplama(arr);// varargs array olarak calýsýr ve argument olarak array yollanabilir.
		
		//kullanýcýdan deger alarak varargs calýstýrmak istiyorsak
		// girilen degerleri bir array e kaydetmeliyýz.
		// bununiçin kullanýcýdan aldýgýmýz degerleri esnek oldugu icin bir list e koyariz.
		// sonra list i array e ceviririz.
	
	}
		

		public static void toplama(int... var) {

			
			int toplam = 0;
			for (int each : var) {
				toplam+=each;
				
				
			}
			System.out.println(toplam);

	}

}
