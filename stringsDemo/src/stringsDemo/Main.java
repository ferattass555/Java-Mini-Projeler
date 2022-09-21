package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "           Bugün Hava Çok Güzel          ";
		System.out.println(mesaj);
		
		/*System.out.println("Elemen sayısı: "+mesaj.length());
			System.out.println("5. eleman: "+mesaj.charAt(4));
			System.out.println(mesaj.concat(" Yaşasın"));
			System.out.println(mesaj.startsWith("B")); //Bu satırda çıktının hangi harfle başladığını True ya da False ile belirtir.
			System.out.println(mesaj.endsWith("l")); //Bu satırda çıktının hangi harfle bittiğini True ya da False ile belirtir.
			char[] karakterler = new char[5];
			mesaj.getChars( 0, 5,karakterler, 0);
			System.out.println(karakterler);
			System.out.println(mesaj.indexOf("av")); //içindeki kelimenin veya harfin nereden olduğunu belirtir (soldan)
			System.out.println(mesaj.lastIndexOf("av")); //içindeki kelimenin veya harfin nereden olduğunu belirtir (sağdan)*/
			
			String yeniMesaj = mesaj.replace(' ', '-');
			System.out.println(mesaj.replace(' ' , '-'));
			System.out.println(mesaj.substring(2)); //2 den itibaren yazımı alır.
			System.out.println(mesaj.substring(2)); //2 den 5 e kadar olan yazımı alır.
	
			for (String kelime: mesaj.split(" ")) {
				System.out.println(kelime);
			}
	
			System.out.println(mesaj.toLowerCase()); //Tüm harfleri küçük yapar.
			System.out.println(mesaj.toUpperCase()); //Tüm harfleri büyük yapar.
			System.out.println(mesaj.trim()); //Başta ve sonda olan boşlukları siler.
	}
}
