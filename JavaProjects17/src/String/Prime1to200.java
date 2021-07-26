package String;

public class Prime1to200 {

	public static void main(String[] args) {
		
		for(int n=1;n<=200;n++) {
			boolean prime=true;
			if(n>1) {
				for(int i=2; i<n/2; i++) {
					if(n%i==0) {
						prime=false;
						break;
					}
				}
				if(prime) {
					System.out.print(n+ " ");
				}
			}
		}

	}

}
