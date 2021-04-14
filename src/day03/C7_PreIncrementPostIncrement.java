package day03;

public class C7_PreIncrementPostIncrement {

	public static void main(String[] args) {


		int num=20;
		
		num++;
		System.out.println(num); //21
		
		System.out.println(num++); //21 önce yazdýrýyor sonra artýrýyor
		
		
		System.out.println(num);// 22 bundan sonra num artýk 22 olur.
		
		System.out.println(++num); //23
		System.out.println(num);  //23

	}

}
