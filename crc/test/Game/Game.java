package src.test.Game;
import src.test.Player.Player;

public static Game{

public static String titleOfGame = "Rock, Paper, Scissors";

public Player firstPlayer;

public Player twoPlayer;

public static void printTitleOfGame (){

	System.out.println(Game.titleOfGame);
}

public void playGame(){

System.out.println("Hi, game " + printTitleOfGame + " begin");

firstplayer = Player.getPlayer();

twoPlayer = Player.getPlayer();



}

public int getNumberOfPlayer (Player player){

int num = player.makeAChoice();

return num;
}



}
