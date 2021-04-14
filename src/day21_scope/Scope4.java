package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		int sayi=10;
		
		
       //1-bir method icinde variable, sadece o method icinden kullanýlabilir
		//System.out.println(isim);
		int sayi2;//2-bir local variable deger atanmadan da olusturulabilir
		// 2-System.out.println(sayi2);// ancak ilk deger atamasý yapýlmayan variable lar kullanýlmaz
		//2-sayi2++; 2- ilk deger atanmadýgý icin artýrma yada azaltma da yapamayýz
		//2-Java deger atamasý olmadan local  variable olusturmasýna izin verir, ilerde deger atanacak diye bekler.
		sayi2= 15; // 2- olusturma ayri satirda (11.satýr), deger atamasý ayri satirda (16 satir) yapilabilir.
		//3- birden fazla method 'un oldugu Class lar her method'da kullanmamiz gereken
		//3- ortak variable 'lar varsa Class level 'da variable olusturmalýyým.
		//3- ortak variable Class'in yapýsýna baglý olarak instance veya static olabilir
		
	}

	
	public static void staticMethod() {
		String isim= "Hasan";
		// 1-System.out.println(sayi); bu kurala main method icerisinde olusturulan variab'lar da dahildir.
	}
	
	public void method() {
		
		boolean isTrue=true;
		//System.out.println(sayi); bu kural static olan veya olmayan methodlar icin gcerlidir.
	}
}
