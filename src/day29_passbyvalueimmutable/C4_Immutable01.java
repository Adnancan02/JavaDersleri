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
		//String'lerde method ile yaptýgýmýz degisiklikler kalýcý olmaz.
		//Cunku Java String Class 'ini immutable yapmýstýr.
		
		
		List<String>  isimList = new ArrayList<>();
		
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);//[Ali, Can]
		isimList.remove(1);
		System.out.println(isimList);//[Ali]
	// list 'lerde method 'la yaptýgýmýz degýsýklýkler kalýcý olarak list'e iþlenir.
	//Cunku lidt mutable dir.
		
		
	}

}
