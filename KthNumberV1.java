package nowcoder;
/*
 * 题目描述

有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
给定一个数int k，请返回第k个数。保证k小于等于100。
测试样例：
3
返回：7
 */
/*
 * 解题思路：
 * 也是剑指offer的题，即求第N个丑数，先用暴力法解决。
 */
public class KthNumberV1 {
	public static boolean isUgly(int num)
	{
		if(num <= 0)
			return false;
		while(num % 3 == 0)
			num = num / 3;
		while(num % 5 == 0)
			num = num / 5;
		while(num % 7 == 0)
			num = num / 7;
		return (num == 1)?true:false;
	}
	public static int findKth(int k) {
        // write code here
		if(k <= 0)
			return 0;
		int found = 0;
		int number = 2;
		while(found < k)
		{
			++number;
			if(isUgly(number))
			{
				++found;
			}
		}
		return number;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKth(3));
	}

}
