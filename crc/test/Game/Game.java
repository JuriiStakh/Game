package crc.test.Game;

import crc.test.Player.Player;

public class Game{

public static String titleOfGame = "Rock, Paper, Scissors";

public Player firstPlayer = Player.getPlayer();

public Player secondPlayer = Player.getPlayer();

public void playGame(){

System.out.println("Hi, game " + titleOfGame + " begin");

firstPlayer.setName("Первый игрок");

int firstNum = this.getNumberOfPlayer(firstPlayer);

String first = this.playerSelection(firstNum);

secondPlayer.setName("Второй игрок");

int secondNum = this.getNumberOfPlayer(secondPlayer);

String second = this.playerSelection(secondNum);

System.out.println("Первый игрок поставил " + first);

System.out.println("Второй игрок поставил " + second);

System.out.println("Сейчас мы узнаем имя победителя ");

this.winner(first,second);

}

public String playerSelection(int a){

String [] var = {"Rock" , "Paper" , "Scissors"};

return var[a];

}

public int getNumberOfPlayer (Player player){

int num = player.makeAChoice();

return num;

}

public void winner ( String a, String b){

if(a == "Rock" && b == "Paper" || a == "Rock" && b == "Scissors" || a == "Scissors" && b == "Paper"){
System.out.println("Победил " + firstPlayer.name);
}else if (a == "Paper" && b == "Rock" || a == "Scissors" && b == "Rock" || a == "Paper" && b == "Scissors"){
System.out.println("Победил " + secondPlayer.name);
}else{
System.out.println("Ничья, нужно сыграть еще раз");
this.playGame();
}

}

}










































































