package lab5.problem5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        WordFrequencyCount word = new WordFrequencyCount();
        word.readFile(fileName);
        word.output();
    }
}
