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
         // kullan�c� 10 harfli bir bir kelime girerse  abcd efghi
         // bana son harfi verecek kodu yaz�n�z
         // str.charAt(9)
       //----  System.out.println(str.charAt(14));// exception verir
         // eger index olarak String in uzunlugu veya daha buyuk say� g�r�l�rse
         
         
        // String str3 = 5; //  compile Time Error Cte
                      // derlme cal�smadan Java n�n fark�na var�p alt�n�  k�rm�z� c�zd�g� hatalard�r
                     //derleme zaman hatas�
                     // bu tur hatalar  duzelt�lmeden Java kodu cals�t�rmaz
         
         //System.out.println(str.charAt(14)); // baz� hatalar syntax dan anlas�lmaz,
         // ancak kod cal�st�r�ld�ktan sonra Java i�lemi yaparken anlas�l�r
         //Kod Run edildi�inde ortaya c�kt�g� i�in bu tur hatalara
         // Run Time ERror denir RTE
         
	}

}
