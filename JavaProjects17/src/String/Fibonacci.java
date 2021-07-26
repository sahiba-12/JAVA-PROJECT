package String;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=11;
		int f=2;
		int s=3;
		for(int i=0;i<=n;i++) {
			int t=f+s;
			System.out.print(f+ " ");
			f=s;
			s=t;
		}
	}

}
