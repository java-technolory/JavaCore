package mta.edu.vn;

public class Computer {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return this.HDD;
	}

	public String getRAM() {
		return this.RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return this.isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String toString() {
		return this.HDD + ":" + this.RAM + ":" + this.isBluetoothEnabled + ":" + this.isGraphicsCardEnabled;
	}

	// Builder Class
	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
			System.out.println("HDD-RAM ...");
		}

		public ComputerBuilder() {

		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsCardEnabled = isGraphicsEnabled;
			System.out.println("setGraphicsCardEnabled ...");
			return this; // "this" <=> ComputerBuilder
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
//			ComputerBuilder cb = new ComputerBuilder();
//			cb.isBluetoothEnabled = isBluetoothEnabled;
//			return cb;
			this.isBluetoothEnabled = isBluetoothEnabled;
			System.out.println("setGraphicsCardEnabled ...");
			return this;
		}

		public Computer build() {
//			return new Computer(ComputerBuilder.this);
			return new Computer(this);
		}

	}
}
