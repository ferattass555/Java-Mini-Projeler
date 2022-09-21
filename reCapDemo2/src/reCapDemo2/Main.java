package reCapDemo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//double[] myList = new double[4];
		// diğer yöntem aşağıda
		double[] myList = {1.2, 1.3, 5.2, 6.2};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
			System.out.println("En Büyük = " + max);
	}

}
