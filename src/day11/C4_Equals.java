package day11;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karsýlastýrýr ve strýng olarak esit olup olmadýklarýna bakar
		// sonuc olarak treu veya false döndurur (sonuc)
		
		// bazý methodlarýn yaptýklarý iþlem ile dondurdukleri sonuc farklý olabilir
		//bir methoda gýt ali ismindeki elementi sil deriz
		// o da gidip ali yi bulur ve siler
		
		String str = "Ali can";
		String str2 = "Ali Can";
		// str ile str2 nin esit olup olmadýgýný yazdýrýn
		// esit veya esit degil yazdýrýn
		System.out.println(str.equals(str2));
		
		System.out.println(str.equals(str2) ? "Esit" :"Esit degil");
		// Java da String ler Case sensitivi dir .(buyuk kucuk harf duyarlýdýr)
		// bir harf bile farkli olsa Stringler esit olmaz


	}

}
