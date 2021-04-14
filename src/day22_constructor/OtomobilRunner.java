package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		
		
		Otomobil oto1 = new Otomobil(); // Default constructor kullandýk
		oto1.vites("otomatik");
		
		Otomobil oto2  = new Otomobil("Kirmizi");
	}

}
