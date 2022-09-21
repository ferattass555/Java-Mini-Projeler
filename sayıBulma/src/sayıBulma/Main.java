package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int searching =3;
		boolean varMi=false;
		
		for (int number : numbers) {
			if(number==searching) {
				varMi = true;
				break;
			}
			
		}
		if(varMi) {
			System.out.println("Number is available");
		}else{
			System.out.println("Number not available");
		}
	}

}
