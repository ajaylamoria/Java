package Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class ValidParan {

	public static boolean isValid(String s) {
	       boolean result =false;
	        Stack open = new Stack();
	        Stack square = new Stack();
	        Stack paran = new Stack();
	        
	        char ar[] = s.toCharArray();
	        
	        for(char c:ar){
	            if(c=='(' || c==')'){
	                if(c=='('){
	                    open.push(c);
	                }else if(!open.isEmpty()){
	                    open.pop();
	                }
	           }
	             if(c=='[' || c==']'){
	                if(c=='['){
	                    square.push(c);
	                }else if(!square.isEmpty()){
	                    square.pop();
	                }
	           }
	             if(c=='{' || c=='}'){
	                if(c=='{'){
	                    paran.push(c);
	                }else if(!paran.isEmpty()){
	                    paran.pop();
	                }
	           }
	            
	        }
	        
	        if(open.isEmpty() && square.isEmpty() &&paran.isEmpty()){
	            result = true;
	        }
	        
	        return result;
	    }
	
	 public static boolean isValid2(String s) {
	        boolean flag= false;
	        Map<Character,Character> map = new HashMap();
	        Stack stack = new Stack();
	        map.put(')','(');
	        map.put(']','[');
	        map.put('}','{');
	        
	        char ar[] = s.toCharArray();
	        
	        for(char c:ar){
	            
	            if(map.containsKey(c)){
	                
	            	Character topElement = (Character) (stack.empty() ? '#' : stack.pop());
                     if (topElement != map.get(c)) {
                     return false;
                      }
	        }else{
                stack.push(c);
            }
	        }
	        if(stack.isEmpty()){
	            flag=true; 
	        }
	        
	        return flag;
	    }
	        
	public static void main(String[] args) {
		String s ="([)]";
		System.out.println(isValid2(s));

	}

}
