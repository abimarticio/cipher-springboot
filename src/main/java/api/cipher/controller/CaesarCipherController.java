package api.cipher.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.cipher.model.CaesarCipher;

import java.util.Map;

@RestController
public class CaesarCipherController {

	@GetMapping("/encrypt")
	public String encryptText(@RequestParam Map <String, String> requestParameters) {
		int key = Integer.valueOf(requestParameters.get("key"));
		String text = requestParameters.get("text");
		CaesarCipher caesarCipher = new CaesarCipher(key);
		String encryptedText = caesarCipher.encryptText(text);
		return encryptedText;
	}
	
	@GetMapping("/decrypt")
	public String decryptText(@RequestParam Map <String, String> requestParameters) {
		int key = Integer.valueOf(requestParameters.get("key"));
		String text = requestParameters.get("text");
		CaesarCipher caesarCipher = new CaesarCipher(key);
		String decryptedText = caesarCipher.decryptText(text);
		return decryptedText;
	}
}
