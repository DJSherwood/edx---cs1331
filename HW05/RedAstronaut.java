//  RedAstronaut should have all the attributes of Player. 
// It should also implement the Impostor interface.
public class  RedAstronaut extends Player implements Impostor {
// RedAstronaut must have these varaiables:
// -- skill ( String that represents skill of the Red crewmate. 
//	-- A String value of either inexperienced, experienced, or expert.
	DEFAULT_SKILL = "experienced";
	DEFAULT_SUSLEVEL = 15;
// RedAstronaut must have constructors for:
// -- a constructor takes in name, susLevel, skill in specific order. 
// -- there is a specific keyword in l12 to access the superclass' constructor.
// -- default values: susLevel 15, skill experienced
	// so this is probably not correct, need to acces the superclass constructor
	public RedAstronaut( String name, int susLevel, String skill) {
		this.name = name; 
		this.susLeve = susLevel;
		this.skill = skill;
	}

// a constructor that takes in a name and assigns the following default values:
// -- susLevel: 15
// -- skill: experienced
	public RedAstronaut( String name ) {
		this( name, DEFAULT_SKILL,  DEFAULT_SUSLEVEL );
	}

// RedAstronaut must have these methods:
// emergencyMeeting()
// -- a frozen player cannot vall an emergency meeting
// -- if two players have the same suslevel, no player will be voted off
// -- make sure to change the frozen variable of the player to true when voting off players and DO NOT call the freeze method. 
//  at the end of the vote, check if the game is over using the method in Player.java
//  Does not return anything
//
// freeze(Player p)
// -- implements the method provided in the Impostor interface.
// -- does not work on other impostors
// -- a freeze is successful if the  RedAstronaut's susLevel is less than the Player's
// -- if freeze unsuccessful, RedAstronaut's susLevel is multiplied by 2
// -- remember to change the frozen boolean value for the Crewmat as needed
// -- after the freeze attempt, check if the game is over using the provided method in Player.java
// -- Does not return anything
// 
// sabotage( Player p )
// -- not possible to sabotage another Impostor, and an impostor that is frozen cannot sabotage
// -- also, sabotaging a frozen Player should do nothing
// -- if Impostor.susLevel is under 20, they can increase Crewmate's susLevel by 50%
// -- else, increase Crewmate's susLevel by 25%
// -- does not return anything
//
// equals( Object o )
// two Red are equal if they both have the same name, frozen, susLevel, and skill 
// returns a Boolean
//
// toString()
// returns "My name is [name], and I have a suslevel of [suslevel]. I am currently (frozen / not frozen ). I am a [skill] player!"
// if suslevel is greather than 15, return the String in all capital letters
// you must use the toString() method from the Player class to receive full credit.
//
//

} 
