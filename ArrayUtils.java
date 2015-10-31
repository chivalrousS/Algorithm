package sortAlgorithm;

public class ArrayUtils {
	public static void exchange(int[] arr,int index1,int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void printArray(int[] arr)
	{
		int len = arr.length;
		for(int i = 0;i <= len-1;++i)
		{
			System.out.print(arr[i]);
			if(i < len-1)
				System.out.print(",");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1,3,5,7,2,4,6,8};
		printArray(arr1);
	}
}
