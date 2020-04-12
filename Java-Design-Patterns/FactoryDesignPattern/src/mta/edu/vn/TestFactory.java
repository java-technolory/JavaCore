package mta.edu.vn;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "8 GB", "256 GB", "Core i7");
		Computer server = ComputerFactory.getComputer("Server", "500 GB", "100 TB", "Xeon 8040");

		System.out.println("Factory PC Config: " + pc);
		System.out.println("Factory Server Config: " + server);
	}

}
