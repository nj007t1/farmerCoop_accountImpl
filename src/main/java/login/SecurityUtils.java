package login;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import org.omg.CORBA.Request;

public class SecurityUtils {

	/**
	 * 依SHA-1演算法將參數字串message轉換為160位元(20個位元組)的資料。
	 * 
	 * @param message : 要加密的字串
	 * @return : 160位元資料的20進位表示法所構成的字串
	 */
	public static String getSHA1Endocing(String message) {
		final StringBuffer buffer = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(message.getBytes("UTF-8"));
			byte[] digest = md.digest();

			for (int i = 0; i < digest.length; ++i) {
				final byte b = digest[i];
				final int value = (b & 0x7F) + (b < 0 ? 128 : 0);
				buffer.append(value < 16 ? "0" : "");
				buffer.append(Integer.toHexString(value));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}

	// 本方法可(Ciphertext)加密
	// 無IV版本
	public static String encryptString(String key, String message) {

		String encryptedString = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
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
		} catch (UnsupportedEncodingException e) {
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
			SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
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
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return decryptedString;
	}

	
	/**
	 * 取得加密後的密碼
	 * @param userPassword 密碼
	 * @param userApplyDate 帳號申請時間
	 * @return 加密後的字串
	 */
	    //
	public static String getEncryptPassword(String userPassword, java.sql.Timestamp userApplyDate) {
		//16字元的格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
		//把16字元轉成字串
		String key = sdf.format(userApplyDate);
		//先加密再轉成MD5(讓加密後的長度都一樣)
		String encrypt = getSHA1Endocing(encryptString(key, userPassword));
		return encrypt;
	}
	
}
