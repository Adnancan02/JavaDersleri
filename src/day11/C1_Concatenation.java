
package day11;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Concatenation: Java da + iþlemi yapýlýrken eger toplanan ifadelerden biri veya
		// her ikisi String ise java toplama degil birlestirme yapar
		
		System.out.println(15+20+ "Merhaba"); // 35Merhaba
      System.out.println("Merhaba" +15 +20); // Merhaba1520
      System.out.println("Merhaba" +(15 +20)); //Merhaba35
      System.out.println("Merhaba" + 15*20); //Merhaba300
      // str1.concat(str2) methodu str1 in sonuna str2 y ekler.
      String str1 = "Hello";
      String str2 = "World"; // Hello World yazdýrmak istersek.
      System.out.println(str1+" "+str2);
      System.out.println(str1.concat(str2)); //HelloWorld
	 System.out.println(str1.concat(" ").concat(str2)); // Hello World
	 System.out.println(str1.concat(" " +str2)); // Hello World
      
	}

}
