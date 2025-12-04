package lab5.problem10;

import java.io.*;

public class FileEncryptionFilter {
	public static void fileEncryptionFilter(String contents, String encrypted) throws IOException {
		boolean check = false;
		FileInputStream inStream = new FileInputStream(contents);
		DataInputStream inFile = new DataInputStream(inStream);

		FileOutputStream outStream = new FileOutputStream(encrypted);
		DataOutputStream outFile = new DataOutputStream(outStream);

		while (!check) {
			try {
				byte input = inFile.readByte();
				input += 10;
				outFile.writeByte(input);
			} catch (EOFException e) {
				check = true;
			}
		}
		outFile.close();
		inFile.close();
	}
}