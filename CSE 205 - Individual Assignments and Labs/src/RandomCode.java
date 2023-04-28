import java.util.Stack;

public class RandomCode {
	public static void main(String[] args) {
		System.out.println(bar("hello"));
		System.out.println(bar1("hello"));
		System.out.println(bar2("hello"));
		System.out.println(bar3("hello"));
	}
	
	static String bar(String s) {
	    String ret = "";

	    for(int i = 0; i < s.length(); i++)
	        ret = s.charAt(i) + ret;

	    return ret;
	}
	
	static String bar1(String s) {
	    if (s.length() < 0)
	        return s;
	    
	    return bar(s.substring(1)) + s.charAt(0);
	}
	
	static String bar2(String s) {
	    if (s.length() < 1)
	        return s;
	    
	    return bar(s.substring(1)) + s.charAt(0);
	}
	
	static String bar3(String s) {
	    if (s.length() == 0)
	        return s;
	    
	    return bar(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
	}
}
