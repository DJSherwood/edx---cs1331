public class Frog {
	// variables
	private String name;
	private int age;
	private double tongueSpeed;
	private boolean isFroglet;
	
	// the solution shows this as the "class variable"
	// and it differs by being static
	private static String species = "Rare Pepe";

	// and then the solution shows these as the default values
	private static final int DEFAULT_A = 5;
	private static final int DEFAULT_T = 5;

	// constructor with just name
	public Frog(String name) {
		this(name, DEFAULT_A,  DEFAULT_T);
	}

	// constructor with name, ageInYears, tongueSpeed
	public Frog(String name, double ageInYears) {
		this(name, (int) (12 * ageInYears), DEFAULT_T);
	}

	// constructor 
	public Frog( String name, int age, double tongueSpeed ) {
		this.name = name;
		this.age = age;
		this.tongueSpeed = tongueSpeed;
		this.isFroglet = (age > 1) && (age < 7);
	}

	// grow 
	public void grow( int addMonths ) {
		// I guess this loop makes sense
		for ( int i = 1; i <= addMonths; i++) {
			age += 1;
			if (age <= 12) {
				tongueSpeed += 1;
			} else if (age <= 30) {
				// do nothing
			} else {
				tongueSpeed -=1;
			}
		}
		// so the tonguespeed is not supposed to decrease below 5?
		// hmm
		tongueSpeed = (tongueSpeed < 5) ? 5 : tongueSpeed;

		// and then the solution list updating froglet
		isFroglet = (age > 1) && (age < 7 );
	}
	
	// overloaded grow
	public void grow() {
		grow(1);
	}

	// eat
	// this is interesting, the 'prey' is a parameter
	// that is somehow connected to the Fly class?
	public void eat( Fly prey ) {
		if ( !prey.isDead() ) {
			if ( tongueSpeed > prey.getSpeed() ) {
				if ( prey.getMass() >= ( age * 0.5 ) ) {
					grow();
				}
				prey.setMass(0);
			} else {
				prey.grow(1);
			}
		}
	}

		
	// toString
	public String toString() {
		if ( isFroglet ) {
			return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);
		} else {
			return String.format("My name is %s and I'm a rare frog! I'm %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);
		}
	}

	public static String getSpecies() {
		return species;
	}

	public static void setSpecies( String newSpecies ) {
		species = newSpecies;
	}
}
