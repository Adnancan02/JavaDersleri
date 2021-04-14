package day10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		// kullanýcýdan kacýncý ayda oldugunu nalýn ve ay ismini yazdýrýn

		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen kacýncý ayda oldugunuzu gýrýnýz");
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
     	System.out.println("mayýz");
     	break;
     case 6 :
     	System.out.println("hazýran");
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
      	System.out.println("kasým");
      	break;
      	
      case 12 :
      	System.out.println("aralýk");
      	break;
     	
   default :
 	  System.out.println("Lutfen gecerli rakam giriniz");
 	  
     }
		
		
	 System.out.println();
		
	}

}
