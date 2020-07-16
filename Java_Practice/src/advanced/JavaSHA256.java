package advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/*
 * Cryptographic hash functions are mathematical operations run on digital data
 * 	by comparing the computed hash (the output produced by executing a hashing algorithm)
 *  to a known and expected hash value, 
 *  a person can determine the data's integrity(무결성).
 * For example, computing the hash of a downloaded file
 * 	and comparing the result to a previously published hash result 
 * 	can show whether the download has been modified or tampered with.
 * In addition, cryptographic hash functions are extremely collision-resistant;
 * 	in other words, it should be extremely difficult 
 * 		to produce the same hash output from two different input values
 * 		using a crytographic hash function
 * 
 * Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions
 * 	designed by the National Security Agency (NSA).
 * It consists of six identical hashing algorithms
 * 	(SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256)
 * 		with a variable digest size.
 * SHA-256 is a 256-bit(32 byte) hashing algorithm 
 * 	which can calculate a hash code for an input of up to 264-1 bits
 * It undergoes(받다) 64 rounds of hashing and calculates a hash code 
 * 	that is a 64-digit hexadecimal number
 * 
 * Given a string, s, print its SHA-256 hash value.
 * 
 * 6 <= |s| <= 20
 * [a-zA-Z] and/or decimal digits (0 ~ 9) only
 */

public class JavaSHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		// SHA-256 MessageDigest의 생성
		MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");

		// 메시지 다이제스트 갱신
		mdSHA256.update(s.getBytes());

		// 해시 계산 반환값은 바이트 배열
		byte[] sha256Hash = mdSHA256.digest();

		// 바이트배열을 16진수 문자열로 변환하여 표시
		StringBuilder hexSHA256hash = new StringBuilder();
		for (byte b : sha256Hash) {
			String hexString = String.format("%02x", b);
			hexSHA256hash.append(hexString);
		}

		System.out.println(hexSHA256hash);

	}

}
