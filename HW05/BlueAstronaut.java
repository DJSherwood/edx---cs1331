// BlueAstronaut implements the Crewmate interface
//
// variables
// -- numTasks: integer ( number of tasks to complete )
// -- taskSpeed: positive integer ( not zero, speed at which the astronaut completes each task)
// 
// constructors
// first constructor takes in name, susLevel, numTasks, and taskSpeed 
// second constructor just takes in a name and assigns the following default values:
// -- susLevel: 15
// -- numTasks: 6
// -- taskSpeed: 10
//
// methods
// BlueAstronaut must have these methods:
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
