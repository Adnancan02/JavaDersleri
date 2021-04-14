package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	// kullanýcýdanyarý capa iste alaný yazýn.
	
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	System.out.println("alanini hesaplamak için dairenin yaricapini giriniz");
	double yaricap= scan.nextDouble();
	
	System.out.println("dairenin alani="+3.14*yaricap*yaricap);
	
	scan.close();
	}

}
