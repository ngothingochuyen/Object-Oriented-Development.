package lab5.problem10;

import java.io.*;

public class Application {
	public static void main(String[] args) {
		try {
			FileEncryptionFilter.fileEncryptionFilter("ContentProblem10.txt", "EncryptedProblem10.txt");
			System.out.println("Encrypted successfully");
		} catch (IOException e) {
			System.out.println("Error - " + e.getMessage());
		}
	}
}
