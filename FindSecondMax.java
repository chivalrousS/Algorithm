
public class FindSecondMax {
	public static int find_sec(int[] data)
	{
		int len = data.length;
		int MIN = -32767;
		int sec_max = MIN;
		int max = data[0];
		for(int i = 1;i < len;++i)
		{
			if(data[i] > max)
			{
				sec_max = max;
				max = data[i];
			}
			else {//data[i] < max
				if(data[i] > sec_max)
					sec_max = data[i];
			}
		}
		return sec_max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		int sec_max = find_sec(data);
		System.out.println(sec_max);
	}

}
