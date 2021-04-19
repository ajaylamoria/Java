package String;

public class ConvertStringToInt {

	public static void main(String[] args) {
		String s ="123";
		int num = 0;
		
		char ar[] = s.toCharArray();
		for(char c:ar) {
			num = num*10 + c-'0';
		}
		System.out.println(num);
	}

}
