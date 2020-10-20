package api.cipher.model;

public class CaesarCipher {

	private int key;
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * Constructs a Caesar cipher object.
	 * @param key The key to use for encryption or decryption.
	 */
	public CaesarCipher(int key) {
		this.key = key;
	}
	
	/**
	 * Returns an encrypted text using Caesar cipher.
	 * @param text The input text to encrypt.
	 * @return The encrypted text.
	 */
	public String encryptText(String text) {
		char[] encryptedText = text.toUpperCase().toCharArray();
		for(int index = 0; index < encryptedText.length; index++) {
			int letterIndex  = ALPHABET.indexOf(encryptedText[index]);
			int cipherIndex = (letterIndex + this.key) % ALPHABET.length();
			encryptedText[index] = ALPHABET.charAt(cipherIndex);
		}
		return String.valueOf(encryptedText);
	}
	
	public String decryptText(String text) {
		char [] decryptedText = text.toUpperCase().toCharArray();
		for (int index = 0; index < decryptedText.length; index ++) {
			int letterIndex = ALPHABET.indexOf(decryptedText[index]);
			int cipherIndex = (letterIndex - this.key) % ALPHABET.length();
			decryptedText[index] = ALPHABET.charAt(cipherIndex);
		}
		return String.valueOf(decryptedText);
	}
}
