package bitManipulation;
/*
 * 题目描述

请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）
给定一个int x，请返回交换后的数int。
测试样例：
10
返回：5
 */
/*
 * 解题思路：
 * 直接交换奇偶位较为麻烦，可直接获得所有的奇数位，进行右移操作。
 * 再获得所有的偶数位，进行左移操作。
 * 将上述得到的两个结果进行结合即可。
 */
public class Exchange {
	public static int exchangeOddEven(int x) {
        // write code here
		return ((x & 0xaaaaaaaa)>>1) | ((x&0x55555555)<<1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 10;
		System.out.println(exchangeOddEven(test));
	}

}
