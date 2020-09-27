
public class LowerCaseTester {
	public static void main(String[] args) {
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
		
		System.out.println(smallTestString);
	}
}

/*
 * 원래 문자열과 같은 문자열을 얻을 수 없으며,
 * 문자열에 있는 문자를 모두 대문자로 변환된 문자열을 출력한다.
 * 
 * 
 * 
 */