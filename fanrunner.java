// Fan Program
class Fan {
	private String make;
	private double radius;
	private String colour;
	private boolean isOn;
	private byte Speed; // Level from 0 to 5

	public Fan(String make, double radius, String colour) { 
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}

	public void Switchon() {
		this.isOn = true;
		setspeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setspeed((byte) 0);
	}

	void setspeed(byte Speed) {
		this.Speed = Speed;

	}

	public String toString() {
		return String.format("Manufacture: %s, Radius: %2fm, Colour: %s, Speed_of_Fan: %d, Status: %b", make, radius,
				colour, Speed, isOn);
	}
}

public class Fanrunner {
	public static void main(String args[]) {
		Fan fan = new Fan("Orient", 1.5, "Red");
		fan.Switchon();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}
}
