package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		
		// = atama yada assignment iþareti
		int sayi1=5;
		int sayi2=4;   //>
	   boolean isGreat= sayi1>sayi2;// treu/false
	   
        System.out.println(isGreat);// treu
        boolean isSmall =sayi1<=sayi2; // false
   
        System.out.println(isSmall); //false
        boolean isEqual=sayi1==sayi2; //== esit mi anlamina gelir ve Comparison operator
        System.out.println(isEqual); //false
        System.out.println(sayi1==5); //treu
        System.out.println(sayi1*sayi2==20);//treu
        System.out.println(sayi1+sayi2 !=9); //ayilarin toplami 9 degil. false
        
        System.out.println(sayi1-sayi2 !=0); // (5-4) sifira esit degildir  true
        
        // tum mantiksal ifadelerde ! kullanildiginda olumsuzluk anlami katar
        
        System.out.println(sayi1+sayi2!=9);// false
        System.out.println(sayi1-sayi2!=0); // treu

	}

}
