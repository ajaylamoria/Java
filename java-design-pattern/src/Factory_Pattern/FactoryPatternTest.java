package Factory_Pattern;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC");
		System.out.println(pc.getHDD()+" "+pc.getRAM());
		
		Computer server = ComputerFactory.getComputer("SERVER");
		System.out.println(server.getHDD()+" "+server.getRAM());

	}

}
