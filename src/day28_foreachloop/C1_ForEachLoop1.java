package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		//bir array in tum elemanlarý for loop ile yazdýralým
		
		int arr []= {2,4,6,10,12};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		
		}

// for loop yazmamýzýn amacý array in tum elemanlarý uzerinde iþlem yapmak ise foreach loop kolay kod yazmamýzý saglar
	// each--> her bir demek.
		// for each loop istediðim bir topluluktaki tum elemanlarý birer birer bana getirir.
		// for each loop da baslangýc degeri yoktur, bitis degeri YOKTUR, index YOKTUR.
		System.out.println();// gorevi cursor u alt satira gecirir.
		
		for (int w : arr) {
			System.out.print(w + " ");
		}
		
		
		
		
		
	}

}
