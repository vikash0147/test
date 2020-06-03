package Testcase;

import java.util.*;



public class HashMAP1 {

	public static void main(String[] args) {
		
		String a = "Amit";
		String b = "Amita";
		// TODO Auto-generated method stub
		
		Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	        
	        if(a.equals(entry.getValue())) {
	        	
	        	System.out.println("value found");
	        	System.out.println("Key is " +entry.getKey());
	        	
	        	System.out.println("Key is vikash " +entry.getKey());
	        	
	        	
	        	
	        }
	        	
	        	
	    }  

	}

}
