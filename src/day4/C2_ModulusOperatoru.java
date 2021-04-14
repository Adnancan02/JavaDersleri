package day4;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
	
		
		//modules operatoru bölme iþleminde kalaný verir.
		//15 tek mi çift mi? 15/2= 1
		//25 3 e bölünür mü?
		int kalan = 15%4;
		System.out.println(kalan);
		System.out.println(26%8);
		
		
		//856 sayisininbirler basamý kactir.
		int sayi= 856;
		
		int birlerbasamagý= 856%10;
		System.out.println("sayinin birler basamagý=" +birlerbasamagý);
		
		//856 sayisinin (10)onlar basmaðý kaçtýr.
		//bunun için buldugun birler basamagýndan kurtulman gerekiyor
		//birler basamgýndan kurtulmak için sayiyi 10'a blunuyorum
		sayi/=10;
		System.out.println("on'a böldukten sonra sayinin degeri : " +sayi);
		
		int onlarBasamagi= sayi%10;
		System.out.println("Onlar basamgi: " +onlarBasamagi);
		
		//yuzler basamamagýný bulmak için bir kere daha ayni iþlemi yapýyorum.
	    
		sayi/=10; // bu satýrla onlar basamagýndan da kurtulurum
		System.out.println("2.defa 10'a boldukten sonra "+sayi);
		
	}

}
