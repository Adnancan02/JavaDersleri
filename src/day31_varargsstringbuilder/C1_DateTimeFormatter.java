package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMM/dd hh:mm");
		
		System.out.println(dtf.format(ldt));
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		
		/* yy: yilin son iki rakamýný verir.
		 * yyyy: yilin tamamini verir.
		 * M:ay sirasini verir mart için: 3
		 * MM: ay sirasini verir mart için :03
		 * MMM: Ay isminin ilk uc harfini verir.
		 * MMMM: Ay isminin tamamini verir.
		 * 
		 */
		System.out.println(dtf2.format(ldt));//21/Mar/20
		
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
		
		System.out.println(dtf3.format(ldt));//17:22 24 saat lik sisteme gore
		System.out.println(dtf4.format(ldt));// 05:22 pm/ am sistemine gore
		
		
		LocalDate dogumTarihi = LocalDate.of(1995, 1, 12);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim = Period.between(bugun, dogumTarihi);
		System.out.println(benimYasim);
		
		int yas = Period.between(dogumTarihi, bugun).getYears();
		System.out.println(yas);
		
				
	}
	

}
