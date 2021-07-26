package JavaArray;

public class SearchMaximumvalue {

	public static void main(String[] args) {
		
		
		int[] a= {5,3,7,10,11};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max < a[i]);
			{
				max=a[i];
			}
		}
		
		System.out.println("maximum element is"+max);
	}

}
