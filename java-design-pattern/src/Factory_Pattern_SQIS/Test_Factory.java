package Factory_Pattern_SQIS;

import java.util.LinkedList;
import java.util.List;

public class Test_Factory {

	public static void main(String[] args) {
		try{
			List<Integer> li = new LinkedList<>();
			li.add(10);
			li.add(12);
			System.out.println(li.remove(0));
			System.out.println(li.remove(0));
		Isis_Document doc=  Isis_Document_Factory.getDocument("CA101010-00");
		
		
        System.out.println(doc.getId()+"  "+doc.getDisplay_Ident());
		}
		catch(NullPointerException e){
			System.out.println("DisplayIdent is InValid: "+e);
		}
	}

}
