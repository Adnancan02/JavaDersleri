package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		//bir array in tum elemanlar� for loop ile yazd�ral�m
		
		int arr []= {2,4,6,10,12};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		
		}

// for loop yazmam�z�n amac� array in tum elemanlar� uzerinde i�lem yapmak ise foreach loop kolay kod yazmam�z� saglar
	// each--> her bir demek.
		// for each loop istedi�im bir topluluktaki tum elemanlar� birer birer bana getirir.
		// for each loop da baslang�c degeri yoktur, bitis degeri YOKTUR, index YOKTUR.
		System.out.println();// gorevi cursor u alt satira gecirir.
		
		for (int w : arr) {
			System.out.print(w + " ");
		}
		
		
		
		
		
	}

}
