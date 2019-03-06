package crc.test.Game;

import crc.test.Player.Player;

public class Game{

public static String titleOfGame = "Rock, Paper, Scissors";

public Player firstPlayer;

public Player secondPlayer;

Game game = new Game();

public void playGame(){

System.out.println("Hi, game " + titleOfGame + " begin");

firstPlayer = Player.getPlayer();

firstPlayer.setName("������ �����");

int firstNum = game.getNumberOfPlayer(firstPlayer);;

String first = game.playerSelection(firstNum);

secondPlayer = Player.getPlayer();

secondPlayer.setName("������ �����");

int secondNum = game.getNumberOfPlayer(secondPlayer);

String second = game.playerSelection(secondNum);

System.out.println("������ ����� �������� " + first);

System.out.println("������ ����� �������� " + second);

System.out.println("������ �� ������ ��� ���������� ");

game.winner(first,second);

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
System.out.println("������� " + firstPlayer.name);
}else if (a == "Paper" && b == "Rock" || a == "Scissors" && b == "Rock" || a == "Paper" && b == "Scissors"){
System.out.println("������� " + secondPlayer.name);
}else{
System.out.println("�����, ����� ������� ��� ���");
game.playGame();
}

}

}










































































