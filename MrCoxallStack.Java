/******************************************************************************
 * 
 * Made by Michael Weedmark
 * Made on 2016-09-30
 * This is the stack the stub program uses
 * 
******************************************************************************/

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MrCoxallStack <item> {
    	
    private List _anArray = new ArrayList();
        
    public void push(item PutOn) {
        	
      _anArray.add((item)PutOn);
      System.out.println(_anArray);
        	
    }
    	
    public void pop(item TakeOff) {
    	
    	if(_anArray.isEmpty()){
    		throw new EmptyStackException();
    	}
    	
        _anArray.remove((item)TakeOff);
        System.out.println(_anArray);
        	
    }

	
}
