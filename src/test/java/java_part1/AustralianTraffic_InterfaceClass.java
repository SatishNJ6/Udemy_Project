package java_part1;

public class AustralianTraffic_InterfaceClass implements CentralTraffic_Interface, ContinentalTraffic_Interface {

	public static void main(String[] args) {

		CentralTraffic_Interface c = new AustralianTraffic_InterfaceClass();
		c.goGreen();
		c.stopRed();
		c.flashYellow();

		AustralianTraffic_InterfaceClass a = new AustralianTraffic_InterfaceClass();
		a.walkonsymbol();

		ContinentalTraffic_Interface ct = new AustralianTraffic_InterfaceClass();
		ct.trainSymbol();
	}

	public void goGreen() {

		System.out.println("Green go implemenatation");

	}

	public void stopRed() {
		System.out.println("Red stop implemenatation");

	}

	public void flashYellow() {
		System.out.println("Flash yellow implemenatation");

	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	public void trainSymbol() {
		System.out.println("Train symbol implemenatation");

	}

}
