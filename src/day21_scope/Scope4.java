package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		int sayi=10;
		
		
       //1-bir method icinde variable, sadece o method icinden kullan�labilir
		//System.out.println(isim);
		int sayi2;//2-bir local variable deger atanmadan da olusturulabilir
		// 2-System.out.println(sayi2);// ancak ilk deger atamas� yap�lmayan variable lar kullan�lmaz
		//2-sayi2++; 2- ilk deger atanmad�g� icin art�rma yada azaltma da yapamay�z
		//2-Java deger atamas� olmadan local  variable olusturmas�na izin verir, ilerde deger atanacak diye bekler.
		sayi2= 15; // 2- olusturma ayri satirda (11.sat�r), deger atamas� ayri satirda (16 satir) yapilabilir.
		//3- birden fazla method 'un oldugu Class lar her method'da kullanmamiz gereken
		//3- ortak variable 'lar varsa Class level 'da variable olusturmal�y�m.
		//3- ortak variable Class'in yap�s�na bagl� olarak instance veya static olabilir
		
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
