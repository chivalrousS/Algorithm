package nowcoder;
/*
 * 题目描述

有一个介于0和1之间的实数，类型为double，返回它的二进制表示。
如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
测试样例：
0.625
返回：0.101
 */
public class BinDecimal {
	public static String printBin(double num) {
        // write code here
		if(num >= 1 || num <= 0)
			return "Error";
		StringBuilder result = new StringBuilder();
		result.append("0.");
		while(num > 0)
		{
			if(result.length() > 32)
				return "Error";
			double tmp = num*2;
			if(tmp >= 1)
			{
				result.append(1);
				num = tmp - 1;
			}
			else {
				result.append(0);
				num = tmp;
			}
		}
		return result.toString();
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = 0.625;
		System.out.println(printBin(test));
	}

}
