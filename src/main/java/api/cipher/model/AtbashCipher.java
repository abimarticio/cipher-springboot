package api.cipher.model;

public class AtbashCipher {
	
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String encryptDecryptText(String text) {
		char[] encryptedDecryptedText = text.toUpperCase().toCharArray();
		for(int index = 0; index < encryptedDecryptedText.length; index++) {
			int letterIndex  = ALPHABET.indexOf(encryptedDecryptedText[index]);
			int cipherIndex = ((ALPHABET.length() - 1) * letterIndex + (ALPHABET.length() - 1)) % ALPHABET.length();
			encryptedDecryptedText[index] = ALPHABET.charAt(cipherIndex);
		}
		return String.valueOf(encryptedDecryptedText);
	}
}
