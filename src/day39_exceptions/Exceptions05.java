package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
	
		//null olarak tanýmlanmýs bir obje ýle uygun olmayan bir ýslem yapmaa calýstýgýmýzda java NullPointerException verir.
		//Unchecked exception dir.
		
		
		String str1 = " ";
		String str2= "";
		String str3= null;// null bir deger degildir sadece str3 un hiçbirseye esit olmadýgýný soyleyen bir ýsaretcidir.(pointer)
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		//System.out.println(str3.length());//NullPointerException
		
		System.out.println(str3+ "bos"); //nullbos
		System.out.println(str3.concat("bos")); //NullPointerException
	}

}
