package mta.edu.vn;

public class SocketAdatpterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return super.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = new Volt(12);
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = new Volt(3);
		return convertVolt(v, 400);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
