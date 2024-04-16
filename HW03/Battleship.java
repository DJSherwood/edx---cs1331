import java.util.Scanner;

public class Battleship {

    // 1. print out the message Welcome to Battleship!
    // 2. prompt each user to enter coordinates for five ships of length one.
    // 3. create two 5x5 grids which will store player's ship locations
    // 4. create two 5x5 grids which will display the history of hits/misses
    // 5. Interact with user. Prompt user to target
    public static void main(String[] args) {

        char[][] p1LocGrid = new char[5][5];
        char[][] p2LocGrid = new char[5][5];
        char[][] p1HistGrid = new char[5][5];
        char[][] p2HistGrid = new char[5][5];
        char[][] p1FinalGrid = new char[5][5];
        char[][] p2FinalGrid = new char[5][5];
	int numP1Ships = 0;
	int numP2Ships = 0;
	boolean noWin = true;
	int p1row;
	int p2row;
	int p1col;
	int p2col;
	int r1;
	int r2; 
	int c1;
       	int c2;

	// initialize grids with dashes
	p1LocGrid = createPlayerGrid(p1LocGrid);
	p2LocGrid = createPlayerGrid(p2LocGrid);
	p1HistGrid = createPlayerGrid(p1HistGrid);
	p2HistGrid = createPlayerGrid(p2HistGrid);
	p1FinalGrid = createPlayerGrid(p1FinalGrid);
	p2FinalGrid = createPlayerGrid(p2FinalGrid);

        System.out.println("Welcome to Battleship!");
        System.out.println("");

	// can only have one scanner call
        Scanner playerInput = new Scanner(System.in);
	
	// record player 1's locations
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES."); 
        while ( numP1Ships < 5 ) {
            System.out.printf("Enter ship %d location:\n", (numP1Ships + 1) );
	    if ( playerInput.hasNextInt() ) {
		    p1row = playerInput.nextInt();

		    if ( playerInput.hasNextInt() ) {
			    p1col = playerInput.nextInt();

			    if ( (p1row > 4 || p1row < 0 ) || (p1col > 4 || p1col < 0 ) ) {
				    System.out.println("Invalid coordinates. Choose different coordinates.");
			    } else if ( p1LocGrid[p1row][p1col] == '@' ) {
				    System.out.println("You already have a ship there. Choose different coordinates.");
			    } else {
				    p1LocGrid[p1row][p1col] = '@';
				    numP1Ships += 1;
			    }
		    } else {
			    System.out.println("Invalid coordinates. Choose different coordinates.");
		    }
	    } else {
		    System.out.println("Invalid coordinates. Choose different coordinates.");
	    }
        }

	//System.out.println("");
        printBattleShip(p1LocGrid);

	// print 100 lines to separate the players boards
	for ( int i=0; i < 100; i++ ) {
		System.out.println(""); 
	}

        // record player 2's locations
        System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES."); 
        while ( numP2Ships < 5 ) {
            System.out.printf("Enter ship %d location:\n", (numP2Ships + 1) );
	    if ( playerInput.hasNextInt() ) {
		    p2row = playerInput.nextInt();

		    if ( playerInput.hasNextInt() ) {
			    p2col = playerInput.nextInt();

			    if ( (p2row > 4 || p2row < 0 ) || (p2col > 4 || p2col < 0 ) ) {
				    System.out.println("Invalid coordinates. Choose different coordinates.");
			    } else if ( p2LocGrid[p2row][p2col] == '@' ) {
				    System.out.println("You already have a ship there. Choose different coordinates.");
			    } else {
				    p2LocGrid[p2row][p2col] = '@';
				    numP2Ships += 1;
			    }
		    } else {
			    System.out.println("Invalid coordinates. Choose different coordinates.");
		    }
	    } else {
		    System.out.println("Invalid cooridnates. Choose different coordinates.");
	    }
        }
	// System.out.println("");
	printBattleShip(p2LocGrid);
        
	for ( int i=0; i < 100; i++ ) {
		System.out.println(""); 
	}
        // now loop through the players taking turns until someone wins
	do {
		// player 1 attacks  
		if ( numP2Ships > 0 ) {
			System.out.println("Player 1, enter hit row/column:");
			if ( playerInput.hasNext() ) {
				r1 = playerInput.nextInt();

				if ( playerInput.hasNextInt() ) {
					c1 = playerInput.nextInt();

			    		if ( ( r1 > 4 || r1 < 0 ) || ( c1 > 4 || c1 < 0 ) ) {
				    		System.out.println("Invalid coordinates. Choose different coordinates.");
			    		} else if ( p2LocGrid[r1][c1] == 'X' || p2LocGrid[r1][c1] == 'O' ) {
				    		System.out.println("You already fired on this spot. Choose different coordinates.");
			    		} else {
						// player 1's attacks are evaluated against player 2's ships
						if ( p2LocGrid[r1][c1] == '@' ) {
							System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
							numP2Ships -= 1;
							p1HistGrid[r1][c1] = 'X';
                            printBattleShip(p1HistGrid);

						} else {
							System.out.println("PLAYER 1 MISSED!");
							p1HistGrid[r1][c1] = 'O';
                            printBattleShip(p1HistGrid);
						}
			    		}
				} else {
					  System.out.println("Invalid coordinates. Choose different coordinates.");
				}
			} else {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			}
		}
	


		// if player 1 destroys player 2 ships in the block above, immediately 
		// have player 1 win
		if ( numP2Ships == 0 ) { 
			System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
			noWin = false;
			break;
		} else {
            System.out.println("");
        }

		// player 2 attacks        
		if ( numP1Ships > 0 ) {
			System.out.println("Player 2, enter hit row/column:");
			if ( playerInput.hasNext() ) {
				r2 = playerInput.nextInt();

				if ( playerInput.hasNextInt() ) {
					c2 = playerInput.nextInt();

			    		if ( ( r2 > 4 || r2 < 0 ) || ( c2 > 4 || c2 < 0 ) ) {
				    		System.out.println("Invalid Coordinates. Choose different coordinates.");
			    		} else if ( p1LocGrid[r2][c2] == 'X' || p1LocGrid[r2][c2] == 'O' ) {
				    		System.out.println("You already fired on this spot. Choose different coordinates.");
			    		} else {
						// player 2's attacks are evaluated against player 1's ships
						if ( p1LocGrid[r2][c2] == '@' ) {
							System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
							numP1Ships -= 1;
							p2HistGrid[r2][c2] = 'X';
                            printBattleShip(p2HistGrid);

						} else {
							System.out.println("PLAYER 2 MISSED!");
							p2HistGrid[r2][c2] = 'O';
                            printBattleShip(p2HistGrid);
						}
			    		}
				}
			}
		}
	 
		
		// if player 2 destroys player 1 ships in the block above, immediately 
		// have player 2 win
		if ( numP1Ships == 0 ) {
			System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
			noWin = false;
			break;
		} else {
            System.out.println("");
        }

	} while ( noWin );
	
	// now create the final boards
	p1FinalGrid = createFinalGrid( p1LocGrid, p2HistGrid );
	p2FinalGrid = createFinalGrid( p2LocGrid, p1HistGrid );	

	// print final boards
    System.out.println("");
    System.out.println("Final boards:");
    System.out.println("");
	printBattleShip(p1FinalGrid);
	System.out.println("");
	printBattleShip(p2FinalGrid);
    
    } //end of main
    // method creates the final board for the player
    private static char[][] createFinalGrid( char[][] location, char[][] history) {

	// looks like player 1 location is merged with player 2 history
	// and player 2 history is merged with player 1 location
        for ( int x = 0; x < 5; x++ ) {
            for ( int y = 0; y < 5; y++ ) {

		if ( history[x][y] == 'X' ) {
	       		location[x][y] = 'X';

		} else if ( history[x][y] == 'O' ) {
			location[x][y] = 'O';
		} 
            }
        }
	return location;
    }

    // method creates the player's grid
    private static char[][] createPlayerGrid( char[][] playerLocGrid ) {
        
        int row = 0;
        int col = 0;
        
        // intialize player grid with '-'
        for ( int a = 0; a < 5; a++ ) {
            for ( int b = 0; b < 5; b++ ) {
                playerLocGrid[a][b] = '-';
            }
        }
        return playerLocGrid;
    }
    
    // method prints out battleship grid
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    } // end of printBattleShip()
     
}

