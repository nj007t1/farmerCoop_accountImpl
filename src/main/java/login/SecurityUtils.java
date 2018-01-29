package login;


import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;


public class SecurityUtils {
	// 本方法可對加密之字串(Ciphertext)解密，key為當初加密時的金鑰，傳回值為解密後的字串(Plaintext)
	// 無IV版本
	public static String encryptString(String key, String message) {
		
		String encryptedString = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			encryptedString = DatatypeConverter.printBase64Binary(cipher.doFinal(message.getBytes()));
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return encryptedString;
	}

	/**
	 * 本方法可對加密之字串(Ciphertext)解密，key為當初加密時的金鑰 傳回值為解密後的字串(Plaintext) 無IV版本
	 */
	public static String decryptString(String key, String stringToDecrypt) {
		String decryptedString = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] b = DatatypeConverter.parseBase64Binary(stringToDecrypt);
			decryptedString = new String(cipher.doFinal(b));
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return decryptedString;
	}
//public static void main(String[] args) {
//	UserDAO user = new UserDAO();
//	UserBean userBean = new UserBean(email, password, againpassword);
//}	

}
