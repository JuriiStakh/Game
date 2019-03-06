package src.test.Player;
import java.util.Scanner;

public class Player {

String name;

int number;

public static Player getPlayer(){

Player a = new Player();

return a;

}

public void setName(String name){

this.name = name;

}

public int makeAChoiсe (){

Scanner scan = new Scanner(System.in);

this.number = (int) (Math.random() * 3 );

}

}


