
public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ferat";
		String ogrenci2 = "Engin";
		String ogrenci3 = "Nesli";
		String ogrenci4 = "Aysu";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ferat";
		ogrenciler[1] = "Engin";
		ogrenciler[2] = "Nesli";
		//ogrenciler[3] = "Aysu";
		
		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");

		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	} 

}
