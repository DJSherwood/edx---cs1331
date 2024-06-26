// Create a Fly class
public class Fly {
	private double m;
	private double s;

	private static final int DEFAULT_M = 5;
	private static final int DEFAULT_S = 10;

	// Constructor with no parameters
	public Fly() {
		this(DEFAULT_M);
	}

	// Constructor for only mass 
	public Fly( double m ) {
		this( m, DEFAULT_S );
	}

	// Constructor for both mass, speed 
	public Fly( double m, double s) {
		this.m = m;	
		this.s = s;
	}
 	
	// speed settor method
	public void setSpeed( double newSpeed ) {
		this.s = newSpeed;
	}

	// speed gettor method
	public double getSpeed() {
		return s; 
	}

	// mass settor method
	public void setMass( double newMass ) {
		this.m = newMass;	
	}

	// mass gettor method
	public double getMass() {
		return m; 
	}

	// toString
	public String toString() {
		if ( m == 0 ) {
			//System.out.println("I'm dead, but I used to be a fly with a speed of " + s);
			return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", s);
		} else {
			//System.out.println("I'm a speedy fly with " + s + " and " + m + " mass");
			return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", s, m);
		}
	}

	// grow
	public void grow( int addMass ) {
		m = m + addMass;
		
		if ( m < 20 ) {
			s = s + 1 * addMass;
		} else if ( m >= 20 ) {
			s = s - 0.5 * addMass; 
		}
	}

	// isDead
	public boolean isDead() {
		if ( m == 0 ) {
			return true;
		} else { 
			return false; 
		}
	}

}
