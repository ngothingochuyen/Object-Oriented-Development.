package lab7.singletonPattern;

public class Application {
	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		log1.log("hehehehe");
		log2.log("huhuhuhu");
		System.out.println("Are these in one instance "+(log1==log2));

	}
}
