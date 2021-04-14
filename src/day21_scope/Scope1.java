package day21_scope;

public class Scope1 {
	
	static int okulId= 1201;
	static String okulAdi= "Yýldiz Koleji";
	static boolean acikMi;

	public static void main(String[] args) {
		
		System.out.println(okulId + " " +okulAdi+ " "+ acikMi);//1201 Yýldiz Koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod();

		System.out.println(okulId + " " +okulAdi+ " "+ acikMi);//1203 Yýldiz Koleji true
	}
	
	
	public static void staticMethod() {
		System.out.println(okulId + " " +okulAdi+ " "+ acikMi); //1202 Yýldiz Koleji true
		okulId=1203;
		
	}

	public void method() {
		okulId=1205;
	
	}
}
