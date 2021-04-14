package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayListe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list); //[10, 15, 8, 12, 20]
		System.out.println(list.size()); // 5
		
		
		list.remove(1); //[10, 8, 12, 20]
		System.out.println(list);
		
		System.out.println(list.remove(2)); // git 12 yi kald�r dedik bize 12'yi d�nd�r�r.
		// remove (index)  kullan�ld�g�m�zda o �ndexdeki eleman� remove eder
		//ve bunun delili olarak bize o eleman� getirir.
		// eger olmayan bir index girersek Rte verir.
		
		System.out.println(list);  //[10, 8, 20]
		
		List<String> list2= new ArrayList<>();
		list2.add("Ali");
		System.out.println(list2.remove("Hasan"));// git hasan i kald�r dedik bu�amad�g� icin false d�nd�r�r
		
		System.out.println(list2);
		
		//remove(object) method u kullan�ld�g�nda  eger Java istenen eleman� bulup remove ederse 
		// bize remove edilen eleman� dondurur, liste de bulamazsa istedi�in yerine 
		// getirilmedi�ini anlamam�z i�in false donur
		
		
		
		
		
	}
}
