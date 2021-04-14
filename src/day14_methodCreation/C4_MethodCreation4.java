package day14_methodCreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		
		
		toplama("Ali", "Veli");

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : "+ (sayi1 + sayi2));
		
	}
	public static void toplama(double sayi1, double sayi2) {
		System.out.println("Double method sonucu : "+ (sayi1 + sayi2));
	}
	
	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer / double method sonucu : "+ (sayi1 + sayi2));
	}
	public static void toplama(char sayi1, char sayi2) {
		System.out.println("char method sonucu : "+ (sayi1 + sayi2));
	}
	public static void toplama(String sayi1, String sayi2) {
		System.out.println("String method sonucu : "+ (sayi1 + sayi2));
	}
}
