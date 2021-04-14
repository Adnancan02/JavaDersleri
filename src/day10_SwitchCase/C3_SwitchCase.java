package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase {

	public static void main(String[] args) {
		// kullanýcýdan bir rakam isteyin
		// gýrýlen rakamý yazý ile yazdýrýn
		// negatif se reddeennve rakam degilse red edin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen býr tam sayý gýrýnýz");
		int rakam = scan.nextInt();
		
		
		
		
		
        if(rakam==0) {
        	System.out.println("sýfýr");
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

        // soruyu switch ile yapalým
        
        switch(rakam) {
        case 0 :
        	System.out.println("Sýfýr");
        	break;
        case 1 :
        	System.out.println("Bir");
        	break;
        case 2 :
        	System.out.println("Ýki");
        	break;
        	
        case 3 :
        	System.out.println("uç");
        	break;
        	
        case 4 :
        	System.out.println("dort");
        	break;
        case 5 :
        	System.out.println("Bes");
        	break;
        case 6 :
        	System.out.println("Altý");
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
