import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create new scanner objects to take in player input
        Scanner playerName = new Scanner(System.in);
        Scanner playerClassPick = new Scanner(System.in);
        Scanner playerRacePick = new Scanner(System.in);

        //Create a string array of playable classes
        String[] playableClass = {"Warrior ", "Mage ", "Assassin ", "Hunter ", "Templar "};
        String[] playableRace = {"Human ", "Dwarf ", "Elf ", "Orc ", "Undead "};

        System.out.println("Enter your Character name: ");
        String name = playerName.nextLine();

        //Loops through the array, and prints our each element in the array to display all playable classes
        System.out.println("Pick you class: ");

        for (int i = 0; i < playableClass.length; i++) {
            System.out.println((i)+"."+playableClass[i]);

        }

        //Takes in an integer input from the player to determine which class the player has picked
        int classPicked = playerClassPick.nextInt();

        System.out.println("Pick you Race: ");

        for (int i = 0; i < playableRace.length; i++) {
            System.out.println((i)+"."+playableRace[i]);

        }

        int racePicked = playerRacePick.nextInt();

        // create an instance of enemy Class
        Enemy enemy1 = new Enemy();

        //Creates an instance of the player class using the constructor with a string parameter to assign the player name
        Player myPlayer1 = new Player(name);





        //Display all player information
        System.out.println("Your player name is: " + myPlayer1.name);
        System.out.println("Your class is: " + playableClass[classPicked]);
        System.out.println("Your Race is: "+ playableRace[racePicked]);
        System.out.println("Your level is: " + myPlayer1.lvl);




        //call function from Player class to check if player is ready
        Player.checkPlayerReady();


        //spawn new enemy
        System.out.println("A " + enemy1.name + " Has appeared! ");

        //display enemy info
        enemy1.displayEnemyInfo();

    }
}