package demension3;
import java.util.Scanner;
public class Flaechen extends Vektoren{
	
	Koordinaten[] punkte = new Koordinaten[3];
	Koordinaten vektorAB, vektorBC;
	
	public Flaechen() {
		
		Scanner scanner = new Scanner(System.in);
		
		punkte[0] = new Koordinaten(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		punkte[1] = new Koordinaten(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		punkte[2] = new Koordinaten(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		
		vektorAB = vektorAB(punkte[0], punkte[1]);
		vektorBC = vektorAB(punkte[1], punkte[2]);
		
		
	}
	
	public double flaecheninhalt() {
		
		double flaecheninhalt = vektorlength(vektorAB) * vektorlength(vektorAB);
		
		return flaecheninhalt;
		
	}
	
	
	
}
