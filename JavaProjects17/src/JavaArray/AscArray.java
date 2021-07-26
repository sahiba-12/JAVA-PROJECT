package JavaArray;

public class AscArray {

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
		System.out.println(a[a.length-2]);
		
	}

}
