package day31_varargsstringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		//

		StringBuilder sb1 = new StringBuilder(); // Bos bir SB olusturur //"mehmet"; kabul etmez bunu

		System.out.println("sb1 : " + sb1);

		StringBuilder sb2 = new StringBuilder("Mehmet");// içinde Mehmet degeri olan bir SB uretir.

	
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10);// 10 karakter kapasitesi olan bir SB uretir

		System.out.println("sb3 : " + sb3);
		
		sb1.append(" Hoca");
		
		System.out.println("sb1 append : " + sb1);
		
		sb2.append(" Hoca");
		System.out.println("sb2 append : " + sb2);
		
		sb3.append(" Hoca");
		System.out.println("sb3 : " + sb3);

		System.out.println("sb1 uzunluk " +sb1.length());//
		System.out.println("sb1 uzunluk " +sb1.capacity());//
		
		System.out.println("sb2 uzunluk " +sb2.length());//
		System.out.println("sb2 uzunluk " +sb2.capacity());//
		
		System.out.println("sb3 uzunluk " +sb3.length());//
		System.out.println("sb3 uzunluk " +sb3.capacity());//
		
	}

}
