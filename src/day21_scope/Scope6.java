package day21_scope;

public class Scope6 {

	
		public int num1;// access modifier public yap�l�nca heryerden ulas�lab�lir
		String name = "Ali";// access modifier yaz�lmad�g� �c�n default access modifier gecerlidir.
		// sadece paket i�inde kullan�labilir
		public static void main(String args){ 
		  add();
		//product (5); static olmayan bir method static olan main method icerisincen cagr�lamaz
		}
		public static void add(){
		//num1 ++; static olmayan (instance) num1, static method icinden kullan�lamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
		}
		public void product(int num3){
		name = "Veli";
		//num2++; num2 ustteki method olusturulmus Local bir variable dir.
		System.out.println(num3 * num3);
		
		

	}

}
