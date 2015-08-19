import java.util.*;

public class Zipper {
	public static String zipString(String iniString)
	{
		if (iniString == null)
			return null;
		int oldlen = iniString.length();
		String result = "";
		char value = iniString.charAt(0);
		int num = 1;
		
		for(int i = 1; i < oldlen; ++i)
		{
			//当前字符和前一位相同
			if(iniString.charAt(i) == value)
				num += 1;
			//当前字符和前一位不同
			else {
			result += value + String.valueOf(num) ;
			value = iniString.charAt(i);
			num = 1;
			}
		}
		result += value + String.valueOf(num) ;
		
		int newLen = result.length();
		if(newLen < oldlen)
			return result;
		else 
			return iniString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "aabcccccaaa";
		String test2 = "welcometonowcoderrrrr";
		System.out.println(zipString(test1));
		System.out.println(zipString(test2));

	}

}
