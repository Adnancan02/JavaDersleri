package day33_Encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		//Encapsulation02 class indaki class member a ulasmaya calýsalým.
		
		Encapsulation02 obj1= new Encapsulation02();
		Encapsulation02 obj2= new Encapsulation02();
		// Biz eriþim yetkisini  ikiye ayýrýyoruz.
		// 1- okuyabilme get() ( bu sadece okuma yapar)
		//2- degýstýrýp kullanabilme
		
		System.out.println(obj1.sayi);//100 public oldugundan  hem okudum h
		obj1.sayi=25;                  // 25 hemde deger atayabildim
		System.out.println(obj1.sayi);//
		
	
		System.out.println(	obj2.sayi);//100
		
		System.out.println(obj1.getOkulIsmi());// get method u oldugu için sadece bilgi verir.
		//obj1.getOkulIsmi()= "Mehmet Koleji"; // get method u sadece okur degiþtiremez
		
		obj1.setTcNo("326547895447");
	//	System.out.println(obj1.setTcNo("12345678912")); set() method u okumaya izin vermez.
		
		
	}

}
