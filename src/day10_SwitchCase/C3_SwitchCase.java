package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase {

	public static void main(String[] args) {
		// kullan�c�dan bir rakam isteyin
		// g�r�len rakam� yaz� ile yazd�r�n
		// negatif se reddeennve rakam degilse red edin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen b�r tam say� g�r�n�z");
		int rakam = scan.nextInt();
		
		
		
		
		
        if(rakam==0) {
        	System.out.println("s�f�r");
        }
	  
		else if (rakam==1) {System.out.println("BIR");
	    
	    
	    } else if (rakam==2) {System.out.println("IKI");
	    
	    } else if (rakam==3) {System.out.println("UC");
	    
	    
	    } else if (rakam==4) {System.out.println("DORT");
	        
	    } else if (rakam==5) {System.out.println("BES");
	    
	    } else if (rakam==6) {System.out.println("ALTI");
	    
	    } else if (rakam==7) {System.out.println("YEDI");
	    
	    } else if (rakam==8) {System.out.println("SEKIZ");
	    
	    } else if (rakam==9) {System.out.println("DOKUZ");
	    
	    
	    } else {System.out.println("Lutfen Gecerli Bir Rakam Giriniz");
	    
	    }

        // soruyu switch ile yapal�m
        
        switch(rakam) {
        case 0 :
        	System.out.println("S�f�r");
        	break;
        case 1 :
        	System.out.println("Bir");
        	break;
        case 2 :
        	System.out.println("�ki");
        	break;
        	
        case 3 :
        	System.out.println("u�");
        	break;
        	
        case 4 :
        	System.out.println("dort");
        	break;
        case 5 :
        	System.out.println("Bes");
        	break;
        case 6 :
        	System.out.println("Alt�");
        	break;
        	
        case 7 :
        	System.out.println("Yedi");
        	break;
        	
        case 8 :
        	System.out.println("Sekiz");
        	break;
        	
        case 9 :
        	System.out.println("Dokuz");
        	break;
        	
      default :
    	  System.out.println("Lutfen gecerli rakam giriniz");
    	  
        }
        
        
        
        
        
        
        
        
        
        
	}

}
