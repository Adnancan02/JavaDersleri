package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		//double bir de�i�ken olustural�m ve bunu integer cevirelim ve sonrada byte  ceviriniz.
		
		
		double numDouble= 280.56;
		int numInt= (int)numDouble;
		System.out.println("integer de�i�ken de�er : " +numInt);
		
		byte numByte= (byte) numInt;
		
		
		System.out.println("byte de�i�ken de�eri :" + numByte);
		
		
		
	}

}
