package day34_Inheritance;

public class Isci extends Muhasebe  {

	
	
	public static void main(String[] args) {
		
		Isci isci1= new Isci();
		isci1.isim= "Omer";
		isci1.soyisim="Aydýn";
		isci1.id= 1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu= "Isci";
		isci1.maas=isci1.maasHesaola();
		
		System.out.println(isci1.id+" "+isci1.isim+ " "+isci1.soyisim+" "+isci1.statu+ " "+ isci1.maas + " tl");
		
		
	// Bu derse kadar hangi class da bilgi elde etmek istiyorsak o class tan obje olustururuz
		// INheritance ile bu mecburiyet ortadan kalktý.
		// Child class da olusturdugum obje ile tum parent class larda 
		// bulunan variable ve method larý inherit edebilirim.
		

		Isci isci2= new Isci();
		isci2.isim= "Esad";
		isci2.soyisim="Okumus";
		isci2.id= 1002;
		isci2.izindeMi=false;
		isci2.saatUcreti=15;
		isci2.statu= "Isci";
		isci2.maas=isci2.maasHesaola();
		
		System.out.println(isci2.id+" "+isci2.isim+ " "+isci2.soyisim+" "+isci2.statu+ " "+ isci2.maas + " tl");
		
		
		
	}
	
	
}

