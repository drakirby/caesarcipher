package caesarcipher;
import java.util.*;

public class CaesarCipher{
	public char[] cipher(){
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter word or phrase:");
		String word = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter offset:");
		int offset = scan2.nextInt();
		
		char[] encryptedword = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			char tempchar = word.charAt(i);
			for (int x = 0; x < alphabet.length; x++) {
				if ((tempchar + offset) <= alphabet[25]){
					if (tempchar == alphabet[x]){
						encryptedword[i] = (alphabet[x + offset]);
					}
				}
				else {
					if (tempchar == alphabet[x]){
						encryptedword[i] = alphabet[(x + offset) % 26];
					}
				}
			}
		}
		return(encryptedword);
	}
}

class main{
	public static void main (String [] args) {
		CaesarCipher c = new CaesarCipher();
		System.out.println(c.cipher());
	}
}
