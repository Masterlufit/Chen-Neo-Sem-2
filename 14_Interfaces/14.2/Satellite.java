import java.util.*;

public class Satellite {
	public static void main(String[] args) {
		ArrayList<Location> locate = new ArrayList<>();
		Random r = new Random();
		int x = r.nextInt(100);
		int y=r.nextInt(100);
		double[] honLoc = { 5, 6 };
		locate.add(new Honda(honLoc));
		locate.add(new Toyota("8, 9"));
		locate.add(new GMC(3, 8));

		double[] home = { 0, 0 };

		String printout = "\n\n" + "==========================" + "\nStarting locations...";

		for (Location l : locate) {
			printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
		}
		
		printout += "\n\n" + "==========================" + "\nMoved locations...";

		for (Location l : locate) {
			printout += "\nAfter " + l.getID() + " moved from: (" + getLocation(l.getLoc()) + ")";
			l.move(x,y);
			printout += "\nNew Location for " + l.getID() + " is: (" + getLocation(l.getLoc()) + ")";
		}

		printout += "\n\n" + "==========================" + "\nDistance from home...";

		for (Location l : locate) {
			printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home) + ")";
		}

		System.out.println(printout);
	}

	public static double getDistance(double[] car, double[] home) {
		return Math.sqrt((Math.pow(car[0] - home[0], 2) + Math.pow(car[1] - home[1], 2)));
	}

	public static String getLocation(double[] loc) {
		return loc[0] + ", " + loc[1];
	}
	
	
	public static void p(String msg){System.out.println(msg);}
}