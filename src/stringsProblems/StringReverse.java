package stringsProblems;

public class StringReverse {
	
public static String usingforcharAt(String name)	{	
		String reversed="";
			for(int i=name.length()-1;i>=0;i--) {
				reversed+=name.charAt(i);
			}	
			return reversed;
}	
			
public static String usingStringBuilder(String name) {
			StringBuilder rev1 = new StringBuilder(name);
			String reve = rev1.reverse().toString();
			return reve;
}	
			
public static String usingArrays(String name) {
			char[] rever = name.toCharArray();
			int start = 0;
			int end = rever.length-1;
			
			while(start < end) {
				char temp = rever[start];
				rever[start] = rever[end];
				rever[end] = temp;
				
				start++;
				end--;
			}
			return new String(rever);				
		}

public static void main(String[] args) {

	String name = "gaurang";
		
	System.out.println(usingforcharAt(name));
	System.out.println(usingStringBuilder(name));
	System.out.println(usingArrays(name));	
	}
}
