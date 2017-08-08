package prob04;

public class StringUtil {
	//문자열을 결합하여 리턴하는 메소드
	public static String concatenate(String[] str) {
	String result = new String();
	
	for( int i=0; i<str.length; i++ ) {
		result += str[i];
		}
	return result;
	}
}
