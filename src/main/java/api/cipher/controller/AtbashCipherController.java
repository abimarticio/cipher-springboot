package api.cipher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.cipher.model.AtbashCipher;

@RestController
public class AtbashCipherController {
	
	@GetMapping("/atbash/encrypt")
	public String encryptText(@RequestParam(value="text", required=true) String text) {
		AtbashCipher atbashCipher = new AtbashCipher();
		String encryptedText = atbashCipher.encryptDecryptText(text);
		return encryptedText;
	}
	
	@GetMapping("/atbash/decrypt")
	public String decryptText(@RequestParam(value="text", required=true) String text) {
		AtbashCipher atbashCipher = new AtbashCipher();
		String decryptedText = atbashCipher.encryptDecryptText(text);
		return decryptedText;
	}
}
