package Factory_Pattern_SQIS;

public class Isis_Document_Factory {

	
	public static Isis_Document getDocument(String displayIdent){
		
		if(displayIdent.startsWith("SA")){
			return new SA_Document();
		}
		else if(displayIdent.startsWith("CA")){
			return new CA_Document();
		}
		return null;
	}
}
