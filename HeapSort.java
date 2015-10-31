package sortAlgorithm;

public class HeapSort {
	public static void main(String[] args)
	{
		int[] arr = {1,3,5,7,8,6,4,2};
		ArrayUtils.printArray(arr);
		System.out.println();
		
		heapSort(arr);
		
		ArrayUtils.printArray(arr);
	}
	
	public static void heapSort(int[] arr)
	{
		int len = arr.length;
		if(arr == null || len <= 1)
			return;
		
		buildMaxHeap(arr);//构建最大堆
		
		for(int i = len-1;i >= 1;--i)
		{
			ArrayUtils.exchange(arr, 0, i); //
			maxHeap(arr,i,0);
		}
	}
	public static void buildMaxHeap(int[] arr)
	{
		if(arr == null || arr.length <= 1)
			return;
		
		int half = arr.length / 2;
		for(int i = half;i >= 0;--i)
		{
			maxHeap(arr,arr.length,i);
		}
	}
	
	public static void maxHeap(int[] arr,int heapSize,int index)
	{
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
		int largest = index;
		if(left < heapSize && arr[left] > arr[largest])
			largest = left;
		if(right < heapSize && arr[right] > arr[largest])
			largest = right;
		
		if(largest != index)
		{
			ArrayUtils.exchange(arr, index, largest);
			maxHeap(arr, heapSize, largest);
		}
	}

}
