package day09;

public class C1_Ternary1 {

	public static void main(String[] args) {
		// 

		
		
		int sayi= 101;
		// ternary i�lemi bir sonuc dondurdugundan b�r variable olusturup ona assign etmeliyiz.
		String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		// ben variable a assign etmek istemezsem 
		// syson i�ine yazabilirim.
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		// bas�na ac�klama yazmak �stersem
		System.out.println("i�leme sonucu : "+(sayi%2==0 ? "cift sayi" : "tek sayi"));
		
		
		
	} 

}
