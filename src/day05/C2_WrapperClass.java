package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		// 
		
		
		
		
		
		
		
		
		
		String isim="mehemet";
		System.out.println(isim.toUpperCase());
		
		//Wrapper class : Java n�n primitive data turleri ile baz� methodlar� kullanabilmemiz 
		//i�in olusturdugumuz Class lard�r.
		// boolean,char,byte,short,int,long,float,double
		byte sayi=10; // sar� olursa kullanmad�g�n� uyar�yor.
		
		Byte sayi2=11; //Wrapperclass denir.
		
		System.out.println(sayi2);
		
		Byte byteMinsayi = Byte.MIN_VALUE;
		System.out.println(byteMinsayi);
		
		Byte byteMaxsayi= Byte.MAX_VALUE;
		System.out.println(byteMaxsayi);
		
		Double doubleMin= Double.MIN_VALUE;
		System.out.println(doubleMin);
		Double doubleMax = Double.MAX_VALUE;
		System.out.println(doubleMax);
		Short shortMin= Short.MAX_VALUE;
		System.out.println(shortMin);
		
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		
		
	
		
	}
	
	


}