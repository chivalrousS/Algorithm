package nowcoder;

/*
 * 题目描述

有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，计算小孩有多少种上楼的方式。
为了防止溢出，请将结果Mod 1000000007
给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
测试样例：
1
返回：1
 */
public class GoUpstairs {
	static long[] tmp = new long[100000];
	public static int countWays(int n) {
        // write code here
		tmp[0] = 0;
		tmp[1] = 1;
		tmp[2] = 2;
		tmp[3] = 4;
		if(n>=0 && n<=3)
			return (int) tmp[n];
		for(int i = 4;i <= n;++i)
		{
			tmp[i] = tmp[i-1] + tmp[i-2] +tmp[i-3];
			tmp[i] = (int)(tmp[i] % 1000000007 );
		}
		return (int)(tmp[n] % 1000000007);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWays(36196));

	}

}
