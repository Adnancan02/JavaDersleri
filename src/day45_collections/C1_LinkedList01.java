package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demektir.
		//linked list'te tum elemanlar tren gibi bir birine baglidir.
		
		//Collections'da obje olustururken
		//olusturmak istediðimiz collection 'in class mi yoksa interface mi oldugununa bakmalýyýz
		// Eger olusturmak istediðimiz collection interface ise
		//data turu olarak o interface 'i , constructor olarak ise uygun bir class secmeliyiz
		//simdiye kadar List(interface) olusturulurken constructor olarak ArrayList() seciyorduk.
		
		List<String> liste= new ArrayList<>();
		
		liste.add("X");
		liste.add("Y");//[X, Y]
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		

		System.out.println(ll1);//[A, B]
		ll1.add(1, "C");
		System.out.println(ll1);//[A, C, B]
		
		ll1.addAll(liste);
		System.out.println(ll1);
		
		ll1.addAll(2, liste);//[A, C, B, X, Y]
		System.out.println(ll1);//[A, C, X, Y, B, X, Y]
		ll1.addLast("K");
		System.out.println(ll1);//[A, C, X, Y, B, X, Y, K]
		
		//LinkedList ve Queue interface lerine implemnt ile child oldugundan 
		// her iki interface deki tum method larý override etmek zorundadýr.
		//Islev olarak ayný iþi yapan addlast() queu dan ve add() ise List den inherit adlmiþtir.
		
		//Ben bir linkedList olusturmak istýyorum ama sadece List ozelliklerini tasýsýn
		
		List<String> listList = new LinkedList<>();
		listList.add("Sadece Listen gelen ozellikler var");
		
		//Ben bir linkedList olusturmak istýyorum ama sadece Queue ozelliklerini tasýsýn.
		Queue<String> queueList= new LinkedList<>();
		queueList.add("Sadece queue'ten gelen ozellikler var");
	}

}
