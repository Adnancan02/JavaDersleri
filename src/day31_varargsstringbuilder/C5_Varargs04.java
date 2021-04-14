package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		//toplama(list) : varargs esnek oldugu i�in list e benzese de list degildir.
		
		int arr[]= {15,20,25};
		toplama(arr);// varargs array olarak cal�s�r ve argument olarak array yollanabilir.
		
		//kullan�c�dan deger alarak varargs cal�st�rmak istiyorsak
		// girilen degerleri bir array e kaydetmeliy�z.
		// bununi�in kullan�c�dan ald�g�m�z degerleri esnek oldugu icin bir list e koyariz.
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
