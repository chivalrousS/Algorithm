package chapter9;
import java.util.*;
/*
 * 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
给定两个整数int A，int B。请返回需要改变的数位个数。
测试样例：
10,5
返回：4
 */

public class Transform {
	public static int calcCost(int A, int B) {
        // write code here
        int count = 0;
        for(int temp = A^B;temp != 0; temp = temp & (temp -1))
            ++count;
        return count; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10,n=5;
		System.out.println(calcCost(m,n));
	}
}
