package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		/*Mükemmel sayı, sayılar teorisinde, 
		kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı. 
		Diğer bir ifadeyle, bir mükemmel sayı, 
		bütün pozitif tam bölenlerinin toplamının yarısına eşittir. */
		
		int number = 6;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total = total +i;
				
			}
		}
		if(total == number) {
			System.out.println("Mükemmel Sayıdır");
		}else {
			System.out.println("Mükemmel Sayı Değildir");
		}
	}

}
