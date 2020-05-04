package aprilStrings;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		String num = "212121abcfdf212121";
		
		Pattern patt = Pattern.compile(".*\\D{6}.*");
		System.out.println(patt.matcher(num).matches());

	}

}
