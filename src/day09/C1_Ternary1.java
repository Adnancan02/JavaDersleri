package day09;

public class C1_Ternary1 {

	public static void main(String[] args) {
		// 

		
		
		int sayi= 101;
		// ternary iþlemi bir sonuc dondurdugundan býr variable olusturup ona assign etmeliyiz.
		String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		// ben variable a assign etmek istemezsem 
		// syson içine yazabilirim.
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		// basýna acýklama yazmak ýstersem
		System.out.println("iþleme sonucu : "+(sayi%2==0 ? "cift sayi" : "tek sayi"));
		
		
		
	} 

}
