
public class Data {
	public static void main(String[] args) {
		int num1 = 40, num2 = 65, x = 99;
		float num3 = 18.53f;
		char letter = 'x';
		num1 = 777;
		
		double num4 = num1;
		boolean flag = false;
		final int FIXED = 2020;
		//FIXED = 3030;
		//num1 = flag;
		
		System.out.println("The value of num1: " + num1);
		System.out.println("The value of num4: " + num4);
		System.out.println("The value of num3: " + num3);
		System.out.println("The value of x: " + x);
		System.out.println("The letter x: " + letter);
		System.out.println("The value of flag: " + flag);
		System.out.println("The value of FIXED: " + FIXED);
	}
}


/*
 * The value of num3: 18.53
 * 
 * ���� ��� �ִ� ���� 40�� �������, 777�� �ٲ����.
 * 
 * The value of num4: 777.0
 * 
 * java.lang.Error: Unresolved compilation problem: 
	The final local variable FIXED cannot be assigned. It must be blank and not using a compound assignment

��������� ����� �������� ���� ���� �Ҵ��� �� ���� �����̴�.
 * 
 * java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from boolean to int

boolean �� ������ int �� ������ �ڵ� �� ��ȯ �� �� ���� �����̴�.
 */