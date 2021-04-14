package day22_constructor;

public class Car {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	//static int aracId=1201; bunu sildik
	
	
	public static void main(String[] args) {
		Car car1= new Car();
		// bir object olusturuldugunda esitli�in sag�nda mutlaka Constructor kullan�l�r.
		// Constructorismi Class ismi ile ayn� olmal�d�r.
		// Constructor' da mutlaka parantez olmal�d�r
		// Constructor da parametre olmas� istege bagl�d�r.
		
		System.out.println(car1.marka+ " "+ car1.model+ " " + car1.yil+ " " + car1.kazasiVarMi);// null null 0 false
		
		car1.marka="Toyota";
		car1.model= "Corolla";
		car1.yil= 2010;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka+ " "+ car1.model+ " " + car1.yil+ " " + car1.kazasiVarMi);//Toyota Corolla 2010 false
		
		Car car2= new Car();
		car2.marka="Opel";
		car2.model= "Astra";
		car2.yil= 2015;
		car2.kazasiVarMi=true;
		System.out.println(car2.marka+ " "+ car2.model+ " " + car2.yil+ " " + car2.kazasiVarMi);//Opel Astra 2015 true

		System.out.println(car1.marka+ " "+ car1.model+ " " + car1.yil+ " " + car1.kazasiVarMi);
		car1.kazasiVarMi=true;// car1'e ait her hangi bir ozelli�i degi�tirebiliriz.
		System.out.println(car1.marka+ " "+ car1.model+ " " + car1.yil+ " " + car1.kazasiVarMi);
		
	}

}
