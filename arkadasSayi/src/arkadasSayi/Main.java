package arkadasSayi;

public class Main {

	public static void main(String[] args) {
		/*İki sayı birbirinin kendisi hariç bölenleri 
		 * toplamına eşitse bu sayılara arkadaş sayılar denir. 
		 * Örnek: 220 ve 284 
		 * 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 
		 * 284: 1 + 2 + 4 + 71 + 142 = 220*/
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for (int i=1;i<number1;i++){
			if(number1%i==0) {
				total1 = total1 +i;
			}
		}
		
		for (int i=1;i<number2;i++){
			if(number2%i==0) {
				total2 = total2 +i;
			}
		}
		if(number1==total2 && number2 ==total1) {
			// "&&" İki koşulda olmak zorunda demek
			// "||" Bir koşulun olması yeter demek
			System.out.println("Bu İki Sayı Arkadaştır");
		}else{
			System.out.println("Bu İki Sayı Arkadaş Değildir");
		}
	}

}
