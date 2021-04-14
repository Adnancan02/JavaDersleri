package day20_scope;

public class scope2 {

	public static void main(String[] args) {
		// ben farklý farklý class lardan da Scope1 ina object olusturarak ulasabilirim.
		
		Scope1 obj4 = new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		obj4.soyisim="Can";
		obj4.isim="Ahmet";
		System.out.println(obj4.isim+ " "+ obj4.soyisim);
		
	}

}
