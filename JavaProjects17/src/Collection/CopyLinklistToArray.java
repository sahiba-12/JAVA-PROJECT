package Collection;

import java.util.ArrayList;
import java.util.List;

public class CopyLinklistToArray {

	public static void main(String[] args) {
		
	
			List<String> name=new ArrayList<String>();
			name.add("sahiba");
			name.add("pratiksha");
			name.add("niharika");
			name.add("neha");
			
			System.out.println("LinkedList: "+name);
			String[] stringvalues=new String[name.size()];
			
			//linked list element copy to array
			
			name.toArray(stringvalues);
			
			//get value from stringvalues 
			
			System.out.println("Arraylist elements are-----");
			for(String value:stringvalues) {
				System.out.println(value);
			}

	}

}
