package day10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		// kullan�c�dan kac�nc� ayda oldugunu nal�n ve ay ismini yazd�r�n

		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen kac�nc� ayda oldugunuzu g�r�n�z");
		int rakam = scan.nextInt();
		
	 switch(rakam){
		 
     case 1 :
     	System.out.println("Ocak");
     	break;
     case 2 :
     	System.out.println("Subart");
     	break;
     	
     case 3 :
     	System.out.println("mart");
     	break;
     	
     case 4 :
     	System.out.println("nisan");
     	break;
     case 5 :
     	System.out.println("may�z");
     	break;
     case 6 :
     	System.out.println("haz�ran");
     	break;
     	
     case 7 :
     	System.out.println("temmuz");
     	break;
     	
     case 8 :
     	System.out.println("agustos");
     	break;
     	
     case 9 :
     	System.out.println("eylul");
     	break;
     case 10 :
      	System.out.println("ekim");
      	break;
      	
      case 11 :
      	System.out.println("kas�m");
      	break;
      	
      case 12 :
      	System.out.println("aral�k");
      	break;
     	
   default :
 	  System.out.println("Lutfen gecerli rakam giriniz");
 	  
     }
		
		
	 System.out.println();
		
	}

}
