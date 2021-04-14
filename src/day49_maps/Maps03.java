package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {
		Map<Integer, String> map1= new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
		System.out.println(map1.get(101));//Ali, Can, Java
		System.out.println(map1.get(105));//null

		System.out.println(map1.getOrDefault(105, "Aradýgýnýz key map de yok"));
		
		System.out.println(map1.keySet());//[101, 102, 103]
		
		map1.replace(103, "Mesut, Aksu, Java");// put ile de bu iþlemi yapabiliriz.
		System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, java, 103=Mesut, Aksu, Java}
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("H", 1);
		map2.put("E", 1);
		map2.put("L", 2);
		map2.put("O", 3);
		System.out.println(map2);//{E=1, H=1, L=2, O=3}
		
		map2.compute("H", (key,value)->10);
		System.out.println(map2);
		
		map2.computeIfAbsent("A", v-> 15);
		map2.computeIfAbsent("H", v-> 5);
		System.out.println(map2);
		
		
		
	}

}
