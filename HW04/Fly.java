// Create a Fly class
public class Fly {
	double m;
	double s;

	// Constructor with no parameters
	Fly() {
		this(5, 10);
	}

	// Constructor for only mass 
	Fly( double mass ) {
		this(5);
		double speed = 10;
	}

	// Constructor for both mass, speed 
	Fly( double mass, double speed) {
		private double mass;	
		private double speed;
	}
 	
	// speed settor method
	private void setSpeed( double newSpeed ) {
		this.speed = newSpeed;
	}

	// speed gettor method
	private double getSpeed() {
		return speed; 
	}

	// mass settor method
	private void setMass( double newMass ) {
		this.mass = newMass;	
	}

	// mass gettor method
	private double getMass() {
		return mass; 
	}

	// toString
	private string toString() {
		if ( mass = 0 ) {
			System.out.println("I'm dead, but I used to be a fly with a speed of " + speed);
		} else {
			System.out.println("I'm a speedy fly with " + speed + " and " + mass + " mass");
		}
	}

	// grow
	private void grow( int addMass ) {
		mass = mass + addMass;
		
		if ( mass < 20 ) {
			speed = speed + 1
	}

	// isDead
	private void isDead() {
	}

	public static void main( String args[] ) {
		// unsure what need sto be in main		
	}
