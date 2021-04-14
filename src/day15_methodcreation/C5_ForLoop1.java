package day15_methodcreation;

public class C5_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdýralým
	/*	 System.out.println("Hello World");//1
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");//
		 // bunun yerine loop kullanýyoruz
		 // ne yapacagýmýzý java ya soyluyoruz , kac kere yapmasý gerektigini de soyluyoruz
		*/ 
		 // Tum loop larda 3 seyi yazmak zorundayýz
		 // 1. baslangýc degeri
		 //2. bitiþ degeri
		 // 3. artýs degeri
		 
		 for(int i=100 ; i>300; i-=5) {
			 System.out.println(i+ "Hello World");
			 
			// Not : Eger sart kismi bizim artisimiza göre hep treu verirse loop sonsuz donguye girer 
			 // Not: loop ta artýs degeri pozitif oldugu gibi negatif de olabilir i--
			 // Not: artýs degeri 1 olmak zorunda degil farklý da olabilir. i-= 5 5 er 5 duser.
			 // Not: Eger Loop un sarti hiç true olmazsa loop body hiç devreye girmez
			 // iþlem tekrar etmez  bir kere false buldugu için atlayýp body ya gelir.
			 
			 
		 }
		 
	}

}
