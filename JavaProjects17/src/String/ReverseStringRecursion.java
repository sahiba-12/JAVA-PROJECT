package String;

public class ReverseStringRecursion {


			 
		     //Method which reverse a string
		     private static String reverse(String str) {
		 
		         //Terminating condition
		         if(str == null || str.length() <= 1) {
		            return str;
		          }
		 
		          //Recursive function call
		          return reverse(str.substring(1)) + str.charAt(0);
		      }
		 
		     public static void main(String[] args) {
		 
		         String str = "Object";
		         String revStr = reverse(str);
		 
		         System.out.println(revStr);
		 
		     }
		

	}


