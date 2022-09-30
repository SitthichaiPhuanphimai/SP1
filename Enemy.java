import java.util.Random;
public class Enemy {

    //assign attributes to enemy class
    String name;
    int health;
    int attack;

    //create a new random object
    Random rand = new Random();


    //Enemy types stored in an Array
    String [] enemyType = {"Skeleton","Troll", "Dragon", "Bandit"};

    // use random function to generate a random number corresponding to a new enemy
    Enemy(){
        int n = rand.nextInt(3);
        this.name = enemyType[n];

        if(n == 0)
        {
            this.health = 100;
            this.attack = 30;
        }
        if(n == 1)
        {
            this.health = 200;
            this.attack = 50;
        }

        if(n==2)
        {
            this.health = 1000;
            this.attack = 500;
        }

        if(n == 3)

        {
            this.health = 50;
            this.attack = 15;
        }


    }

    //function to print out enemy stats
    public  void displayEnemyInfo()

    {
        System.out.println("Health: "+ this.health);
        System.out.println("Enemy attack power: "+ this.attack);
    }
}


