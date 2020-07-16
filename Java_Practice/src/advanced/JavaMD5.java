package advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/*
 * MD5 (Message-Digest algorithm 5) is a widely-used 
 * 	cryptographic hash function with a 128-bit hash value.
 * 		To store a one-way hash of a password
 * 		To provide some assurance that a transferred file has arrived intact
 * MD5 is one in a series of message digest algorithms 
 * 	designed by Professor Ronald Rivest of MIT (Rivest, 1994)
 * however, the security of MD5 has been severely compromised(타협하다),
 * 	most infamously by the Flame malware in 2012. 
 * The CMU Softwrae Engineering Institute essentially considers MD5
 * 	to be "cryptographically broken and unsuitable for further use."
 * Given an alphanumeric string s,
 * 	denoting a password, compute and print its MD5 encryption(암호화) value.	
 * 
 * 6 <= |s| <= 20
 * [a-zA-Z] and/or decimal digits(ex. 0 ~ 9) only
 */

public class JavaMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		// MD5 MessageDigest의 생성
		MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
		
		// 문자열 바이트로 변환
		mdMD5.update(s.getBytes());
		
		// 해시 계산 반환값은 바이트 배열
		byte[] md5Hash = mdMD5.digest();
//		System.out.println(md5Hash);
		
		// 바이트 배열을 16진수 문자열로 변환
		StringBuilder hexMD5hash = new StringBuilder();
		for (byte b : md5Hash) {
			String hexString = String.format("%02x", b);
			hexMD5hash.append(hexString);
		}
		
		System.out.println(hexMD5hash);
	}

}
