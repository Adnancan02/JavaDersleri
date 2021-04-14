package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanýcýdan VIP kýsaltmasýnda hangi harfin anlamýný istedýgýný soralým 
		// gýrýlen harfýn acýklamasýný yazdýralým
		// Very Important Person
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Anlamýný istedýgýnýz harfý gýrýnýz");
        char harf=scan.next().charAt(0);
         switch (harf) {
         case 'V':
         case 'v':
        	 System.out.println("Very");
		    break;
         case 'I':
         case 'ý':
        	 System.out.println("Important");
		    break;
         case 'P':
         case 'p':
        	 System.out.println("Person");
		    break;
         default:
        	 System.out.println("gecersýz harf gýrdýnýz");
         }  
         // kullanýcýnýnn fazla harf girmesini sorun olarak kabul edýyorsanýz
         // ve bunu hata olarak kullanýcýya býldýrmek ýstýyorsanýz 
         
        
         System.out.println("Anlamýný istedýgýnýz harfý gýrýnýz");
         String str =scan.next();
         switch (str) {
         case "V":
         case "v":
        	 System.out.println("Very");
		    break;
         case "I":
         case "i":
        	 System.out.println("Important");
		    break;
         case "P":
         case "p":
        	 System.out.println("Person");
		    break;
         default:
        	 System.out.println("gecersiz harf");
         
         }
         
         
         
         scan.close();
         
         
         
	}

}
