package day15_methodcreation;

public class C5_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazd�ral�m
	/*	 System.out.println("Hello World");//1
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");//
		 // bunun yerine loop kullan�yoruz
		 // ne yapacag�m�z� java ya soyluyoruz , kac kere yapmas� gerektigini de soyluyoruz
		*/ 
		 // Tum loop larda 3 seyi yazmak zorunday�z
		 // 1. baslang�c degeri
		 //2. biti� degeri
		 // 3. art�s degeri
		 
		 for(int i=100 ; i>300; i-=5) {
			 System.out.println(i+ "Hello World");
			 
			// Not : Eger sart kismi bizim artisimiza g�re hep treu verirse loop sonsuz donguye girer 
			 // Not: loop ta art�s degeri pozitif oldugu gibi negatif de olabilir i--
			 // Not: art�s degeri 1 olmak zorunda degil farkl� da olabilir. i-= 5 5 er 5 duser.
			 // Not: Eger Loop un sarti hi� true olmazsa loop body hi� devreye girmez
			 // i�lem tekrar etmez  bir kere false buldugu i�in atlay�p body ya gelir.
			 
			 
		 }
		 
	}

}
