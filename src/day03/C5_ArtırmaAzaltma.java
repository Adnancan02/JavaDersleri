package day03;

public class C5_Art�rmaAzaltma {

	public static void main(String[] args) {
		
		
		int num= 15;
	    int num2 = num + 2;

	    System.out.println("num2 = " +num2);
	    
	    System.out.println("num = "+num);
	    
	    num = num+5;
	    System.out.println("16. sat�rdan sonra num =" +num);
	    
	    System.out.println(num+12);
	    
	    //bir say� art�rmak (increment) istersek o say�ya istedi�imiz say�y� ekler ve sonucu 
	    //variable a atar�z.
	    // num i 8 art�r�n.
	    num = num+8;
        System.out.println("num =" +num);	 //num= 28   

        // num 5 art�r�n.
        //num= num+5;  yerine num +=5 -------- sonuc:33
        
        num += 5;
	    
        System.out.println("javan�n pratik art�r�m�ndan sonra num= "+num);
        num +=10;
        System.out.println("javanin pratik art�r�mdan sonra num =" +num);
        
        // sadece bir art�rmaya �zel olarak java pratik olarak method geli�tirmi�
        
        num++;
        System.out.println("num'in son hali : " +num);
        
	    
	}

}
