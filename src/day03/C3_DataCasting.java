package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
	 
		// byte veri turunde bir de�i�ken olusturup deger atay�n
		// olusturulan variable i adim adim AUTOWIDENING ile geni�letip yazd�rin.
		
		byte numByte= 34;
		System.out.println("byte de�i�ken de�eri : " + numByte);
		
		// short yapal�m
		
		short numShort =numByte; // short byte den buyuk oldugu i�in java sikayet etmedi
		
		System.out.println("short de�i�ken de�eri =" + numShort);
		
		int numInt = numShort;
		
		System.out.println("Integer de�i�ken de�eri =" +numShort);
		
		float numFloat= numInt;
		System.out.println("Float de�i�kenin de�eri =" +numFloat);
		
		double numDouble =numFloat;
		System.out.println("Double degi�ken de�eri =" + numDouble);
		
		
	}

}
