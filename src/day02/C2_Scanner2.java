package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	// kullan�c�danyar� capa iste alan� yaz�n.
	
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	System.out.println("alanini hesaplamak i�in dairenin yaricapini giriniz");
	double yaricap= scan.nextDouble();
	
	System.out.println("dairenin alani="+3.14*yaricap*yaricap);
	
	scan.close();
	}

}
