package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		//bIndexOf() methodu bize istedi�imiz karakter (lerin) indexini d�nd�r�r.
		
		String str = "Java ogren, is sahibi ol";
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama: " +str.indexOf('g')); // 6
		System.out.println(" String arama: " +str.indexOf("g")); // 6
		System.out.println("String kelime arama : "+ str.indexOf("is"));//i -- 12 s---13// 12

       System.out.println("birden fazla varsa :" + str.indexOf('i')); // ilk buldugunun index ini 12
	
	
	
	System.out.println("baslang�c index ile " +str.indexOf('a', 4) ); // bas. index i inclusive
	
	System.out.println("olmayan harf: " + str.indexOf("dert"));
	// kullan�c�dan bir cumle isteyin
	// case sensitive olmadan Java kelimesin i�erip icermedi�ini yad�r�n
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir cumle giriniz");
	String cumle = scan.next().toLowerCase();
	int sonuc = cumle.indexOf("java");
	// java varsa, ilk java kelimesinin index ini d�nd�r�r. java yoksa -1 dir
	System.out.println(sonuc==-1?"Java i�ermiyor":"java i�eriyor");
	
	
	if (cumle.indexOf("java")>=0) {// java kelimesinin index sin s�f�r veya daha buyuk old kontrol ediyor
		System.out.println("Cumle java i�eriyor");
		
		
	} else {

		System.out.println("Cumle java i�eriyor");
	}
	
	
	
	
	}

}
