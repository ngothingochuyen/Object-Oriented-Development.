package lab5.problem11;

import java.io.*;

public class Application {
	public static void main(String[] args) {
		try {
			FileDecryptionFilter.fileDecryptionFilter("EncryptedProblem11.txt", "ContentProblem11.txt");
			System.out.println("Encrypted successfully");
		} catch (IOException e) {
			System.out.println("Error - " + e.getMessage());
		}
	}
}
