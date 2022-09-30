import java.util.Scanner;

public class Player {

    static Scanner playerReadyInput = new Scanner(System.in);

    //Player attribtues. Player always has 100 health and starts on level 1
    String name;
    int health = 100;
    int lvl = 1;

    //Constructor that takes in a name
    Player(String name)
    {
        this.name = name;
    }


    //Function to check if player is ready to play
    static boolean playerReady = true;
    public static void checkPlayerReady()
    {

        while(playerReady) {
            System.out.println("Are you ready to play?");
            System.out.println("1.Ready");
            System.out.println("2.Not ready yet");
            int PlayerIsready = playerReadyInput.nextInt();

            if(PlayerIsready==1){
                playerReady = false;
            }
        }
        System.out.println("Your adventure begins! Get ready!");

    }


}




