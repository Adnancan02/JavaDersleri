package day44_iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);//[A, B, C, D]
		// her elemana B harfini ekleyelim.
		
		for (String each : list) {
			each+="B";
			System.out.print(each+ " ");
		}

		System.out.println(" ");
		System.out.println(list);
		
		// Collections da her yapi index i desteklemez. ornegin Set de index olmaz.
		//Index olmayýnca mecburen tum elemanlara ulasmak için For-each loop kullanýlýr.
		//For-each loop ile de uptadte veya delete yapmalýyýz.
		//Bunun için Java Iterator interface ini olusturmustur.
		
		Iterator it1= list.iterator();
		
		//next(), hasNext() , remove() mrthod larýna sahiptirler.
		//listedeki tum elemanlarý iterator kullanarak silelim.
		
		while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		System.out.println(list);
		System.out.println(list.size());
	}

}
