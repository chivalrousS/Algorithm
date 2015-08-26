package searchAlgorithm;

public class BinarySearch {
	public static int binarySearch(int[] arr,int target,int left,int right)
	{
		if((arr == null)||(left>right))
			return -1;
		
		int mid = 0;
		while(left <= right)
		{
			mid = (left + right)/2;
			if(target == arr[mid])
				return mid;
			else if(target < arr[mid])
				right = mid - 1;
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,1,2,3,4,5,6,7,8,9,10};
		int len = test.length;
		int index = binarySearch(test,3,0,len-1);
		System.out.println(index);
	}

}
