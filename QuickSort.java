package sortAlgorithm;

public class QuickSort {
	public static void quickSort(int[] arr,int left,int right)
	{
		int index = partition(arr,left,right);
		if(left < index - 1)
			quickSort(arr, left, index - 1);
		if(index < right)
			quickSort(arr, index, right);
	}
	
	static int partition(int[] arr,int left,int right)
	{
		int pivot = arr[(left + right)/2];
		while(left <= right)
		{
			while(arr[left] < pivot)
				++left;
			while(arr[right] > pivot)
				--right;
			if(left <= right)
			{
				swap(arr,left,right);
				++left;
				--right;
			}
		}
		return left;
	}
	
	public static void swap(int[] arr,int left,int right)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {9,7,5,3,1,10,8,6,4,2};
		int len = test.length;
		quickSort(test, 0, len-1);
		for(int i :test)
			System.out.print(i + " ");
	}

}
