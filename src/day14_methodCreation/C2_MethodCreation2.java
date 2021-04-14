package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
// Bir method u calýstýrmak için main method un içinden cagýrmammýz gerekir.
// Bir method u cagýrmak için ise method un adýný ve parametrelere uygun argument leri yazamlýyýz
		
		ortalama(85.2, 90.3); // method call


	}// main method  sonu

	//bir method olusturmak ýstedýgýmýzde Class in içinde ama main method un dýsýnda
		// bie alanda olusturmalýyýz. Genel kullaným method lar main method dan sonra olur.
		
		
		public static void ortalama(double sayi1, double sayi2) {
			
		System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
		// Bir methodu olusturmak o methodu calýstýrmak için yeterli degildir
		// olusturulan method main method içinden cagrýlýnca calsýr
		
		
		
		
		
		
		}
		
		
		
		
		
	
	
	
	

}// class sonu
