package demension3;

public class Vektoren {

	
	public Koordinaten vektorAB(Koordinaten vektor1, Koordinaten vektor2) {
		
		double x = vektor1.getX() - vektor2.getX();
		double y = vektor1.getY() - vektor2.getY();
		double z = vektor1.getZ() - vektor2.getZ();
		
		Koordinaten vektorAB = new Koordinaten(x, y, z);
		 
		return vektorAB;
	}
	
	public double vektorlength(Koordinaten vektor) {
		double length = Math.sqrt(Math.pow(vektor.getX(), 2) + Math.pow(vektor.getY(), 2) + Math.pow(vektor.getZ(), 2));
		return length;
	}
}
