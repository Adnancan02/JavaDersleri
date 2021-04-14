package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1= "Ali Can";
		String str2 = str1 + ""; // Ali Can
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		// equals () methodu sadecee String lerin degerlerini karsýlastýrýr
		// bu ornekte str1 ile str2 nin degerleri AYNI oldugu için true döndürür
		String str3 = "Ali Can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

}
