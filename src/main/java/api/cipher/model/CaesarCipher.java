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
}
