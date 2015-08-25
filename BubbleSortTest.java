package sortAlgorithm;

public class BubbleSortTest {
      public static void bubbleSort(int[] nums)
      {
    	  int len = nums.length;
    	  for(int i = 0;i <= len-2;++i)
    	  {
    	        boolean flag = false;
    		  for(int j = len-1;j>i;--j)
    		  {
    			  if(nums[j-1] > nums[j])
    			  {
    				  swap(nums, j-1, j);
    				  flag = true;
    			  }
    		  }
    		  if(flag == false)
    			  return;
    	  }
      }
      public static void swap(int[] nums,int i,int j)
      {
    	  int temp = nums[i];
    	  nums[i] = nums[j];
    	  nums[j] = temp;
      }
      
      public static void main(String[] args)
      {
    	  int[] test = {10,9,7,6,5,4,3,2,1,0};
    	  bubbleSort(test);
    	  for(int i:test)
    	  {
    		  System.out.print(i + " ");
    	  }
    	  
      }
}
