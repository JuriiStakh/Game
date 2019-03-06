package crc.test.Player;

public class Player {

public String name;

int number;

public static Player getPlayer(){

Player a = new Player();

return a;

}

public void setName(String name){

this.name = name;

}

public int makeAChoice() {

number = (int) (Math.random() * 3 );

return number;
}

}


