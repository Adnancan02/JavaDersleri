package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullan�c�dan VIP k�saltmas�nda hangi harfin anlam�n� isted�g�n� soral�m 
		// g�r�len harf�n ac�klamas�n� yazd�ral�m
		// Very Important Person
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Anlam�n� isted�g�n�z harf� g�r�n�z");
        char harf=scan.next().charAt(0);
         switch (harf) {
         case 'V':
         case 'v':
        	 System.out.println("Very");
		    break;
         case 'I':
         case '�':
        	 System.out.println("Important");
		    break;
         case 'P':
         case 'p':
        	 System.out.println("Person");
		    break;
         default:
        	 System.out.println("gecers�z harf g�rd�n�z");
         }  
         // kullan�c�n�nn fazla harf girmesini sorun olarak kabul ed�yorsan�z
         // ve bunu hata olarak kullan�c�ya b�ld�rmek �st�yorsan�z 
         
        
         System.out.println("Anlam�n� isted�g�n�z harf� g�r�n�z");
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
