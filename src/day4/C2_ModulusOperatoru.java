package day4;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
	
		
		//modules operatoru b�lme i�leminde kalan� verir.
		//15 tek mi �ift mi? 15/2= 1
		//25 3 e b�l�n�r m�?
		int kalan = 15%4;
		System.out.println(kalan);
		System.out.println(26%8);
		
		
		//856 sayisininbirler basam� kactir.
		int sayi= 856;
		
		int birlerbasamag�= 856%10;
		System.out.println("sayinin birler basamag�=" +birlerbasamag�);
		
		//856 sayisinin (10)onlar basma�� ka�t�r.
		//bunun i�in buldugun birler basamag�ndan kurtulman gerekiyor
		//birler basamg�ndan kurtulmak i�in sayiyi 10'a blunuyorum
		sayi/=10;
		System.out.println("on'a b�ldukten sonra sayinin degeri : " +sayi);
		
		int onlarBasamagi= sayi%10;
		System.out.println("Onlar basamgi: " +onlarBasamagi);
		
		//yuzler basamamag�n� bulmak i�in bir kere daha ayni i�lemi yap�yorum.
	    
		sayi/=10; // bu sat�rla onlar basamag�ndan da kurtulurum
		System.out.println("2.defa 10'a boldukten sonra "+sayi);
		
	}

}
