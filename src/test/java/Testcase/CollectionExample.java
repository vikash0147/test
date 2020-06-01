package Testcase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
 
	    public static void main(String a[]){      
	        List<String> list = new ArrayList<String>();  
	        list.add("C");  
	        list.add("Core Java");  
	        list.add("Advance Java");  
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, "Servlet","JSP","123");  
	        System.out.println("After adding elements collection value:"+list);  
	        String[] strArr = {"C#", ".Net"};  
	        Collections.addAll(list, strArr);  
	        System.out.println("After adding array collection value:"+list); 
	        
	       
	        System.out.println( Collections.max(list)); 
	        
	        System.out.println(Collections.min(list)); 
	        Collections.sort(list);
	        System.out.println(list ); 
	        Collections.sort(list, Collections.reverseOrder());
	        System.out.println("After reverse collection value:"+list); 
	        
	       Collections.emptyList();
	        System.out.println("After reverse collection value:"+list); 
	        Collections.reverse(list);
	        System.out.println(list );
	        Collections.rotate(list, 6);
	        System.out.println(list );
	        
	        Collections.swap(list, 2, 4);
	        System.out.println(list );
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }  
	}  


