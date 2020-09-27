
public class ConcatTester {
	public static void main(String[] args) {
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		String message = "";
		message = message.concat(article).concat(" ").concat(animal1).concat(" ");
		message = message.concat(action).concat(" ");
		message = message.concat(article).concat(" ").concat(animal2);
		System.out.print(message);
	}
}
