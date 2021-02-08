package Factory_Pattern;

public class Server implements Computer {

	@Override
	public String getHDD() {
		
		return "Server HDD";
	}

	@Override
	public String getRAM() {
		
		return "Sever RAM";
	}
	
	

}
