package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C2_Set01 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");// [A, B, F, Y]
		set1.add("D"); // [A, B, C, D, F, Y]

		System.out.println(set1);// [A, B, C, F]
		System.out.println(set1.hashCode());
		//Set de onemli olan ozellik No duplication ve elemanýn kumede var olup olmamasýdýr.
		//Sýralama Set için onemli degildir.
		// Set icin elemanlarý girdiðimiz sirada verir veya elemanlarýn natural sýralama ile verir.
		// gibi eleman eklersek
		set1.add("M");
		set1.add("E");
		System.out.println(set1.hashCode());
		
		// Collections da hashCode() method u o collection icindeki tum elemanlarýn hash code larýnýn toplamýný verir.
		// yeni eleman eklersek dogal olarak hash code da degisir.
		
	}
	

}
