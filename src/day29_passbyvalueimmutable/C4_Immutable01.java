package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim = "Ali";
		isim.concat("Can"); // String method eklesekte sonuc yine ali olur, degismez
		System.out.println(isim); //Ali
		System.out.println(isim.concat("Can"));//AliCan
		
		System.out.println(isim);// Ali
		//String'lerde method ile yapt�g�m�z degisiklikler kal�c� olmaz.
		//Cunku Java String Class 'ini immutable yapm�st�r.
		
		
		List<String>  isimList = new ArrayList<>();
		
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);//[Ali, Can]
		isimList.remove(1);
		System.out.println(isimList);//[Ali]
	// list 'lerde method 'la yapt�g�m�z deg�s�kl�kler kal�c� olarak list'e i�lenir.
	//Cunku lidt mutable dir.
		
		
	}

}
