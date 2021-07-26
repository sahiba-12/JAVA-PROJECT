package String;

public class ReverseString1 {

	public static void main(String[] args) {
		
	 String s="Sahiba khan"; //nahk abihas
		String rev= "";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
	}

}
