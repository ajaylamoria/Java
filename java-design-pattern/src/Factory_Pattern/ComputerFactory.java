package Factory_Pattern;

public class ComputerFactory {

	
	private ComputerFactory(){}
	
	public static Computer getComputer(String input){
		Computer comp  = null;
		if(input.equals("PC")){
			comp = new PC();
		}
		if(input.equals("SERVER")){
			comp = new Server();
		}
		
		return comp;
	}
}
