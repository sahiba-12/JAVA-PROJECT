package JavaArray;

public class FirstThreeMin {

	public static void main(String[] args) {
		
		int[] a= {15,5,8,3,25,19,75,94};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
				
		}
		int sum=0;
		for(int i=0; i<3; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}

	


