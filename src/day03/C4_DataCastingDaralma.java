package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		//double bir deðiþken olusturalým ve bunu integer cevirelim ve sonrada byte  ceviriniz.
		
		
		double numDouble= 280.56;
		int numInt= (int)numDouble;
		System.out.println("integer deðiþken deðer : " +numInt);
		
		byte numByte= (byte) numInt;
		
		
		System.out.println("byte deðiþken deðeri :" + numByte);
		
		
		
	}

}
