package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{

	public String bolum= "takimhane";
	public int sorOldIscisay=20;
	
	
	public static void main(String[] args) {
		
		UstaBasi ub1= new UstaBasi();
		// Objeyi torun class �nda olusturulunca 3 class a da ulasabiliriz.
		
		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisay);//20
		System.out.println(ub1.saatUcreti); //10
		System.out.println(ub1.isim); // Mehmet
		
		
		
		//List<String> list = new ArrayList<>();
		
		//Object str= new String("Hasan");
		
		
		Isci ub2= new UstaBasi();
		// Extends ile bir birine bagl� olan class lardan IS-A relation olan 
		//Data turleri  �stege bagl� olarak kullan�labilir.
		// Daha genis Data turu Yazman�n avantaj�: Kapsam� daha gen�s olmas�
		// Daha genis Data turu yazman�n dezanvantaji 
		// Data turu olarak sect�g�m�z class ve parent (lar�na) ait datalara ulasabiliriz.
		
		
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id);//Personel
	}

}
