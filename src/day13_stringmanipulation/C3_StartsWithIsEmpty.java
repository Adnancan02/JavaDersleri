package day13_stringmanipulation;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Her gun Java olsa";
		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("Her"));
		System.out.println(str.startsWith("g",4));
		System.out.println(str.startsWith("Java",7));
		
		System.out.println(str.isEmpty() ); // false
		String str2="";
		System.out.println(str.isBlank());
		System.out.println(str2.isEmpty()); // true
		String str3= null; // bir deger degildir sadece hic birseye iþaret eder.
		// sadece str3 in hic bir seye asýt olmadgýný gosteren POINTER dir
		System.out.println(str3.isEmpty()); // RTE eror verir. // empty bos demek
	

	}

}
