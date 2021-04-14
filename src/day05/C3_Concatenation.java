package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		//Concatenation : (Birle�tirme): Java da birden fazlaString i toplama i�areti ile toplarsan�z.
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
	// eger toplana degerlerin ikisi de matematiksel i�lemse Java toplar.
	// Eger sayi ve String degiskenleri birlikte kullan�lacaksa �ncelikler belirlenip o i�lemler i�in parantez kullan�labilir
	// matematiksel bir i�lemde char degisken kullan�l�rsa Java Char in ASCII degerini i�leme al�r.
	//char bir degi�ken ile String bir degi�ken toplan�rsa Concation olur.
	

		
		
		
		
		
		

	}

}
