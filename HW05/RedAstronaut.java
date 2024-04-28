//  RedAstronaut should have all the attributes of Player. 
// It should also implement the Impostor interface.

// RedAstronaut must have these varaiables:
// -- skill ( String that represents skill of the Red crewmate. A String value of either inexperienced, experienced, or expert.
// RedAstronaut must have constructors for:
// -- a constructor takes in name, susLevel, skill in specific order. 
// -- there is a specific keyword in l12 to access the superclass' constructor.

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
// -- 
