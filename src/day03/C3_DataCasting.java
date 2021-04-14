package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
	 
		// byte veri turunde bir deðiþken olusturup deger atayýn
		// olusturulan variable i adim adim AUTOWIDENING ile geniþletip yazdýrin.
		
		byte numByte= 34;
		System.out.println("byte deðiþken deðeri : " + numByte);
		
		// short yapalým
		
		short numShort =numByte; // short byte den buyuk oldugu için java sikayet etmedi
		
		System.out.println("short deðiþken deðeri =" + numShort);
		
		int numInt = numShort;
		
		System.out.println("Integer deðiþken deðeri =" +numShort);
		
		float numFloat= numInt;
		System.out.println("Float deðiþkenin deðeri =" +numFloat);
		
		double numDouble =numFloat;
		System.out.println("Double degiþken deðeri =" + numDouble);
		
		
	}

}
