package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_HashSet02 {

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

		set1.clear();
		System.out.println(set1);

		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1);

		Set<String> set2 = new HashSet<>();

		set2.add("B");
		set2.add("F");
		set2.add("A");// önce C koyarsak dag degısık sonuc verir.
		System.out.println(set2);

		System.out.println(set1.containsAll(set2));// true

	

		set1.removeAll(set2);
		System.out.println(set1);//[]
		System.out.println(set2);//[A, B, F]


		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("D");
	
		
		System.out.println(set1);

		
		set1.retainAll(set2);// set1 de calısır, set2 de olan elemanlari tutar ve set2 de olmayanlari siler.
		System.out.println(set1.equals(set2));
		
		
		System.out.println(set1);
		System.out.println(set2);
		
	}

}
