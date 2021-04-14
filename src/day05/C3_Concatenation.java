package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		//Concatenation : (Birleþtirme): Java da birden fazlaString i toplama iþareti ile toplarsanýz.
		// Java bu Stringleri yanyana yazar.
		
		
		String str1= "Java";
		String str2="Guzeldir";
		System.out.println(str1+str2);
		//eger arada bosluk birakmak isterseniz // String bosluk =" " buda olur
		
		System.out.println(str1 + " " + str2);
		System.out.println(str1+' '+str2); //char olarkta olur ama tehlikesi var.
		
		System.out.println(str2 +str1); //GuzeldirJava  tersten yazar yerlerini degistirmek gerekir.
		System.out.println(str2+" "+str1);
		
		int sayi1=5;
		int sayi2=4;
		
		System.out.println(sayi1+sayi2);
		
		String sayi="5";
		String ikinci="4";
		System.out.println(sayi+ikinci);
		
		System.out.println(sayi1+sayi2+str1+str2);
		
		System.out.println(str1+str2+sayi1+sayi2);
		System.out.println(str1+str2+ (sayi1-sayi2));
		
		System.out.println(sayi1+sayi2+' '+str1+str2);
		
		System.out.println(sayi1+sayi2+str1+' '+str2);
		
	System.out.println(str1+str2+sayi1*sayi2);
	
	System.out.println(str1+ str2+sayi1*sayi2);
	
	
		// kural 1 eger toplana degerlerden bir tanesi bile String ise Java toplama degil Concatenation 
	// eger toplana degerlerin ikisi de matematiksel iþlemse Java toplar.
	// Eger sayi ve String degiskenleri birlikte kullanýlacaksa öncelikler belirlenip o iþlemler için parantez kullanýlabilir
	// matematiksel bir iþlemde char degisken kullanýlýrsa Java Char in ASCII degerini iþleme alýr.
	//char bir degiþken ile String bir degiþken toplanýrsa Concation olur.
	

		
		
		
		
		
		

	}

}
