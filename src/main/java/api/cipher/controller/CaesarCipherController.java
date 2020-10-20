package api.cipher.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.cipher.model.CaesarCipher;

@RestController
public class CaesarCipherController {

	@GetMapping("/encrypt")
	public String encryptText(@RequestParam(value="text", required=true) String text) {
		CaesarCipher caesarCipher = new CaesarCipher(4);
		String encryptedText = caesarCipher.encryptText(text);
		return encryptedText;
	}
}
