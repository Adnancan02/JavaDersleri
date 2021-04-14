package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListe02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");
        System.out.println(list);// [Ali, Can, Ayse, Fatma]
        // istenen indexdeki elemaný kaldýrýp yerine bizim istediðimiz elemaný koyar.(relace)
        list.set(2, "Kemal");
        System.out.println(list);
		
		list.set(0,"Semih");
		System.out.println(list);
		
		//list.set(4, "Mustafa"); olmayan bir index kullanýlýrsa RTE verir
		//System.out.println(list);
		
		list.add(2, "Yasin");
		System.out.println(list); //[Semih, Can, Yasin, Kemal, Fatma]
		
		list.add(5, "Hurriyet"); //[Semih, Can, Yasin, Kemal, Fatma, Hurriyet]
		System.out.println(list);
		
		//list.set(10, "Sefer"); size dan  buyuk index kabul etmez.
		
		
		System.out.println(list.contains("Hurriyet"));//true
		System.out.println(list.contains("Mehmet")); // false
		
		list.contains("Cemal");// bize boolean bir sonuc verir, liste degismez
		// List in elemanlarýný sýralayýnýz.
		
		Collections.sort(list);
		
		System.out.println(list); //[Can, Fatma, Hurriyet, Kemal, Semih, Yasin]
	}

}
