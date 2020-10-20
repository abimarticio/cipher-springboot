package api.cipher.model;

public class CaesarCipher {

	private int key;
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public CaesarCipher(int key) {
		this.key = key;
	}
}
