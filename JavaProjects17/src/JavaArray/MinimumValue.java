package JavaArray;

public class MinimumValue {

	public static void main(String[] args) {
		
        int[] a={4,5,7,8,3};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min > a[i]);
			{
				min=a[i];
			}
		}
		
		System.out.println("minimum element is" +min);

	}

}
