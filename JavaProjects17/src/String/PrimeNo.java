package String;

public class PrimeNo {

	public static void main(String[] args) {
		
		int n=20;
		boolean p=true;
		for(int i=2; i<n/2; i++) {
			if(n%i==0) {
				p=false;
				break;
			}
		}
		if(p) {
			System.out.println("no is prime");
		}else {
			System.out.println("no is not prime");
		}
	}

}
