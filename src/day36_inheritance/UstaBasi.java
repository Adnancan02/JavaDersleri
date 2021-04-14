package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{

	public String bolum= "takimhane";
	public int sorOldIscisay=20;
	
	
	public static void main(String[] args) {
		
		UstaBasi ub1= new UstaBasi();
		// Objeyi torun class ýnda olusturulunca 3 class a da ulasabiliriz.
		
		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisay);//20
		System.out.println(ub1.saatUcreti); //10
		System.out.println(ub1.isim); // Mehmet
		
		
		
		//List<String> list = new ArrayList<>();
		
		//Object str= new String("Hasan");
		
		
		Isci ub2= new UstaBasi();
		// Extends ile bir birine baglý olan class lardan IS-A relation olan 
		//Data turleri  ýstege baglý olarak kullanýlabilir.
		// Daha genis Data turu Yazmanýn avantajý: Kapsamý daha genýs olmasý
		// Daha genis Data turu yazmanýn dezanvantaji 
		// Data turu olarak sectýgýmýz class ve parent (larýna) ait datalara ulasabiliriz.
		
		
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id);//Personel
	}

}
