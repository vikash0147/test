package Testcase;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.ui.Wait;

public class Test4 {
	

	void process(int val)  {
		   try {
		        if (val == 1)
		            //checked exception
		        	//System.out.println(val);
		            throw new FileNotFoundException();
		       
		        if (val == 2)
		            // runtime exception
		        	//System.out.println(val);
		            throw new NullPointerException();
		        
		        if (val == 3)
		            // error exception
		        	//System.out.println(val);
		            throw new StackOverflowError();
		            
		   } catch (RuntimeException re) {
			   re.printStackTrace();
		            // catches all unchecked  exceptions
		            
		   } catch (Exception e) {
		           e.printStackTrace(); // catches all checked exceptions
		            
		   } catch (Error err) {
		            // catches all errors
		   err.printStackTrace();
		   }
		   
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test4 t4 = new Test4();
		t4.process(2);
}
}
