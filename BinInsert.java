package chapter9;
import java.util.*;
/*
 * 题目描述
有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,
其中二进制的位数从低位数到高位且以0开始。
给定两个数int n和int m，同时给定int j和int i，意义如题所述，请返回操作后的数，
且m的二进制位数小于等于i-j+1。
测试样例：
1024，19，2，6
返回：1100
 */
public class BinInsert {
	public static int binInsert(int n, int m, int j, int i) {
        //首先将n的j到i位清0，构造mask
		int ones = ~0;
		int left = ones << (i+1);
		int right = ((1<<j)-1);
		int mask = left | right;
		//将m的对应位左移j位
		int n_new = n & mask;
		int m_new = m<<j;
		int result = n_new|m_new;
		return result;
    }
	
	public static void main(String[] args)
	{
		System.out.println(binInsert(1024,19,2,6));
	}

}
