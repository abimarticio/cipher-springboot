package api.cipher.model;

public class AtbashCipher {
	
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * Returns an encrypted or decrypted text using Atbash cipher.
	 * @param text The input text to encrypt or decrypt.
	 * @return The encrypted text or decrypted text.
	 */
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
