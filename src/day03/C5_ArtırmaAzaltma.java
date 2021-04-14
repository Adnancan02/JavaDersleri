package day03;

public class C5_ArtırmaAzaltma {

	public static void main(String[] args) {
		
		
		int num= 15;
	    int num2 = num + 2;

	    System.out.println("num2 = " +num2);
	    
	    System.out.println("num = "+num);
	    
	    num = num+5;
	    System.out.println("16. satırdan sonra num =" +num);
	    
	    System.out.println(num+12);
	    
	    //bir sayı artırmak (increment) istersek o sayıya istediğimiz sayıyı ekler ve sonucu 
	    //variable a atarız.
	    // num i 8 artırın.
	    num = num+8;
        System.out.println("num =" +num);	 //num= 28   

        // num 5 artırın.
        //num= num+5;  yerine num +=5 -------- sonuc:33
        
        num += 5;
	    
        System.out.println("javanın pratik artırımından sonra num= "+num);
        num +=10;
        System.out.println("javanin pratik artırımdan sonra num =" +num);
        
        // sadece bir artırmaya özel olarak java pratik olarak method geliştirmiş
        
        num++;
        System.out.println("num'in son hali : " +num);
        
	    
	}

}
