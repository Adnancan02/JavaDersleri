package day14_methodCreation;

public class C2_MethodCreation3 {

	public static void main(String[] args) {
		// Verilen 3 double say�n� ortalamas�n� alan bir method yaz�n 
		// main method i�inden cag�rarak yaz�n
		
 
		ortalama(80,60); // method call 2. yi cal�st�r�
		ortalama(80,60,55); // 3. l� y� cal�st�r�r.
		
		
	} //main sonu
	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		
		System.out.println("girdiginiz �� sayinin ortalamasi : "+(sayi1+sayi2+sayi3)/3);
		
	}
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
	}
	

} // calss sonu
