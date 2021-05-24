package java_part1;

public class ChildAircraft_AbstracClass extends ParentAircraft_AbstracClass {

	public static void main(String[] args) {

		ChildAircraft_AbstracClass c = new ChildAircraft_AbstracClass();
		c.engine();
		c.safetyGuideLines();
		c.bodyColour();

	}

	@Override
	public void bodyColour() {
		System.out.println("Red colour on the body");

	}

}
