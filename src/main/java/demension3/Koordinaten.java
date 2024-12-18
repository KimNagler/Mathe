package demension3;

public class Koordinaten {
	private double x;
	private double y;
	private double z;
	
	public Koordinaten(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return z;
	}
	
	public double getZ() {
		return z;
	}
	
	public String toString() {
		return "x = " + x + " y = " + y + " z = " + z;
	}
	
}
