package day21_scope;

public class Scope1 {
	
	static int okulId= 1201;
	static String okulAdi= "Y�ldiz Koleji";
	static boolean acikMi;

	public static void main(String[] args) {
		
		System.out.println(okulId + " " +okulAdi+ " "+ acikMi);//1201 Y�ldiz Koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod();

		System.out.println(okulId + " " +okulAdi+ " "+ acikMi);//1203 Y�ldiz Koleji true
	}
	
	
	public static void staticMethod() {
		System.out.println(okulId + " " +okulAdi+ " "+ acikMi); //1202 Y�ldiz Koleji true
		okulId=1203;
		
	}

	public void method() {
		okulId=1205;
	
	}
}
