package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
// Bir method u cal�st�rmak i�in main method un i�inden cag�rmamm�z gerekir.
// Bir method u cag�rmak i�in ise method un ad�n� ve parametrelere uygun argument leri yazaml�y�z
		
		ortalama(85.2, 90.3); // method call


	}// main method  sonu

	//bir method olusturmak �sted�g�m�zde Class in i�inde ama main method un d�s�nda
		// bie alanda olusturmal�y�z. Genel kullan�m method lar main method dan sonra olur.
		
		
		public static void ortalama(double sayi1, double sayi2) {
			
		System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
		// Bir methodu olusturmak o methodu cal�st�rmak i�in yeterli degildir
		// olusturulan method main method i�inden cagr�l�nca cals�r
		
		
		
		
		
		
		}
		
		
		
		
		
	
	
	
	

}// class sonu
