package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creates game
	    Game game = new Game("League of Legends", "MOBA", 50);

	    //Prints out information about a game we created.
	    System.out.println("My favorite game is " + game.getTitle());

        System.out.println("Which year do you want to get the best game from?");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //Prints out information about a game independent of Video Game object creation (works as a utility method related to all video games)
        System.out.println("The best game for that year is " + Game.bestGameByYear(year));
    }
}
