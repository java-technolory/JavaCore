package mta.edu.vn;

public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true).build();

		System.out.println(computer.getHDD() + ":" + computer.getRAM() + ":" + computer.isBluetoothEnabled() + ":"
				+ computer.isGraphicsCardEnabled());
		System.out.println("Hello");
	}

}
