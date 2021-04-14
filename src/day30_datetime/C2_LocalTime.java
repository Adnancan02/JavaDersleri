package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da sadece tarih kullanmak istiyorsak
		// Localtime class indan obje kullanýrýz
		
		LocalTime saat= LocalTime.now();
		
	System.out.println(saat);
	
	for (int i = 0; i < 1000000; i++) {
		i+=1;
	
		
	}
		LocalTime saat2= LocalTime.now();
		System.out.println(saat2);//22:41:08.976344600
		
		System.out.println(saat.plusHours(15));//13:45:38.717168100
		System.out.println(saat.getSecond());//37
		
		System.out.println(saat.minusSeconds(1564548745));//18:04:03.305319300
		
	System.out.println(saat.now(ZoneId.of("Japan")));//05:00:32.786070900
	
	System.out.println(saat.now(ZoneId.of("America/Chicago")));//15:02:08.274240
		

	}

}
