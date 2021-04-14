package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin gorevi
		
		int sayi1= 10;
		int sayi2=0;
		
		Exceptions01 exp = new Exceptions01();
		// esitliðin solundaki Exceptions01 hem class adi hemde exp objesi için data turu
		
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
			// ArithmeticException java da bir class ve objesi için data turu
			// e ise ArithmeticException class indan olusturdugumuz objenin adi 
			// o zaman ismi e olmak zorunda degiliz ama genelde e kullanýlýr.
			System.out.println("Sayiyi sýfýra bolemezsýnýz");
			System.out.println(e);
			// bu durumda hem java ya sorunu yazmasý için fýrsat vermis hem de aplication i bloke etmemiþ oluruz
			System.out.println(e.getMessage());// by zero
			
			e.printStackTrace();
			/*java.lang.ArithmeticException: / by zero
	at day38_exceptions.Exceptions03.main(Exceptions03.java:15)
			 * 
			 */
		}

		System.out.println("Kod bloke olmamissss");
	}

}
