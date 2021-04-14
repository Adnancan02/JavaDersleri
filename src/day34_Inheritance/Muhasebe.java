package day34_Inheritance;

public class Muhasebe  extends Personel{
	//Muhasebe class inin personel class inin child class i oldugunu declare etmek için 
	//class ismine  exdents keyword ile  
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	
	public int maasHesaola() {
		maas=30*8*saatUcreti;
		
		return maas;
	}
	
	
	
	
	
	
}
