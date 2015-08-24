package chapter9;
import java.util.*;

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
