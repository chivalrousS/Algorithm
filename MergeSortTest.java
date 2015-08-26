package sortAlgorithm;

public class MergeSortTest {
	public static void mergeSort(int[] array,int low,int high)
	{
		if(low < high)
		{
			int middle = (low + high)/2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low,middle, high);
		}
	}
	
	static void merge(int[] array,int low,int middle,int high)
	{
		int[] helper = new int[array.length];
		for(int i = low;i <= high;++i)
		{
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high)
		{
			if(helper[helperLeft] <= helper[helperRight])
			{
				array[current] = helper[helperLeft];
				++helperLeft;
			}
			else {
				array[current] = helper[helperRight];
				++helperRight;
			}
			++current;
		}
		
		int reminder = middle - helperLeft;
		for(int i = 0;i <= reminder;++i)
		{
			array[current+i] = helper[helperLeft+i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {9,3,6,4,10,0,2,8,7,5,1};
		mergeSort(test, 0, test.length-1);
		for(int i:test)
			System.out.print(i + " ");
	}

}
