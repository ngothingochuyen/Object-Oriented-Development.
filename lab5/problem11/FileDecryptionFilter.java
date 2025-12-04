package lab5.problem11;

import java.io.*;

public class FileDecryptionFilter {
//	public static void fileEncryptionFilter(String contents, String encrypted) throws IOException {
//		boolean check = false;
//		FileInputStream inStream = new FileInputStream(contents);
//		DataInputStream inFile = new DataInputStream(inStream);
//
//		FileOutputStream outStream = new FileOutputStream(encrypted);
//		DataOutputStream outFile = new DataOutputStream(outStream);
//
//		while (!check) {
//			try {
//				byte input = inFile.readByte();
//				input += 10;
//				outFile.writeByte(input);
//			} catch (EOFException e) {
//				check = true;
//			}
//		}
//		outFile.close();
//		inFile.close();
//	}

	public static void fileDecryptionFilter(String contents, String decrypted) throws IOException {
		boolean check = false;
		FileInputStream inStream = new FileInputStream(contents);
		DataInputStream inFile = new DataInputStream(inStream);

		FileOutputStream outStream = new FileOutputStream(decrypted);
		DataOutputStream outFile = new DataOutputStream(outStream);

		while (!check) {
			try {
				byte input = inFile.readByte();
				input -= 10;
				outFile.writeByte(input);
			} catch (EOFException e) {
				check = true;
			}
		}
		outFile.close();
		inFile.close();
	}
}