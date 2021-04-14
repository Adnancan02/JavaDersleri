package day11;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index)
		// scan.next().charAt(0) 0. indexdeki karakteri veriri
		// index 0 dan baslar
		String str = "Java cok guzel";
		
		System.out.println(str.charAt(0));// J
		System.out.println(str.charAt(5)); // c
		
         System.out.println(str.charAt(13));// l
         
         // kelimenin uzunlugu son index +1 dir.
         // son index kelimenin uzunlugun(length) -1
         
      //   System.out.println(str.charAt(15)); // exception verir
         // kullanýcý 10 harfli bir bir kelime girerse  abcd efghi
         // bana son harfi verecek kodu yazýnýz
         // str.charAt(9)
       //----  System.out.println(str.charAt(14));// exception verir
         // eger index olarak String in uzunlugu veya daha buyuk sayý gýrýlýrse
         
         
        // String str3 = 5; //  compile Time Error Cte
                      // derlme calýsmadan Java nýn farkýna varýp altýný  kýrmýzý cýzdýgý hatalardýr
                     //derleme zaman hatasý
                     // bu tur hatalar  duzeltýlmeden Java kodu calsýtýrmaz
         
         //System.out.println(str.charAt(14)); // bazý hatalar syntax dan anlasýlmaz,
         // ancak kod calýstýrýldýktan sonra Java iþlemi yaparken anlasýlýr
         //Kod Run edildiðinde ortaya cýktýgý için bu tur hatalara
         // Run Time ERror denir RTE
         
	}

}
