package day11;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi kars�last�r�r ve str�ng olarak esit olup olmad�klar�na bakar
		// sonuc olarak treu veya false d�ndurur (sonuc)
		
		// baz� methodlar�n yapt�klar� i�lem ile dondurdukleri sonuc farkl� olabilir
		//bir methoda g�t ali ismindeki elementi sil deriz
		// o da gidip ali yi bulur ve siler
		
		String str = "Ali can";
		String str2 = "Ali Can";
		// str ile str2 nin esit olup olmad�g�n� yazd�r�n
		// esit veya esit degil yazd�r�n
		System.out.println(str.equals(str2));
		
		System.out.println(str.equals(str2) ? "Esit" :"Esit degil");
		// Java da String ler Case sensitivi dir .(buyuk kucuk harf duyarl�d�r)
		// bir harf bile farkli olsa Stringler esit olmaz


	}

}
