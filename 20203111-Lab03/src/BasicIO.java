import java.util.*;

public class BasicIO {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your years: ");
		int years = stdin.nextInt();
		
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		System.out.printf("2020�� 9�� 27�� ���� %s(%d)�� Ű�� %d cm �Դϴ�.\n", name, years, height);
	}
}
