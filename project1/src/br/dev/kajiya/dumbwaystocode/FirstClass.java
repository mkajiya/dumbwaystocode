package br.dev.kajiya.dumbwaystocode;

import java.util.StringTokenizer;

public class FirstClass {
	
	public static void main(String[] args) {
		String textBlock = """
				Well, looks like I can use textblocks in Java.
				That's interesting.				
				""";
		
		System.out.println(textBlock);
		
		int result = 10;
		System.out.println(result + '=' + " is the result");//this is scary
		
		String temp = "abcde";
		System.out.println(setCharAt(temp, 'a', 2));
		
		substringDemo();
		tokenizerDemo();
	}
	
	private static String setCharAt(String value, char ch, int pos) {
		StringBuilder builder = new StringBuilder(value);
		builder.setCharAt(pos, ch);
		return builder.toString();
	}
	
	private static void substringDemo() {
		String temp = "0123456789";
		
		System.out.println(temp.substring(3));
		System.out.println(temp.substring(3, 6));
		
		CharSequence cs = temp.subSequence(3, 6);//wtf is a charsequence?
		System.out.println("cs " + cs);
		
		CharSequence cs2 = (CharSequence)temp;//Ok, I can cast from string		
		
		//Ah, CharSequence is an interface that both String and StringBuilder implements, that's interesting
		System.out.println("casted charseq: " + cs2);		
	}
	
	private static void tokenizerDemo() {
		String a = "this is a example of tokens";
		
		int index = 0;
		StringTokenizer st = new StringTokenizer(a);
		while (st.hasMoreTokens())
			System.out.println(index++ + " " + st.nextToken());		
	}
}
