
public class Character {
    String name;
    int atk;
    int health;

    Character P1;
    Character P2;

    Character(String name, int atk, int health) {
        this.name = name;
        this.atk = atk;
        this.health = health;
    }

    void skill(int skillNumber){
        if(skillNumber == 1){

        }
        if(skillNumber == 2){

        }
        if(skillNumber == 3){

        }
    }

     void showCharacterP1(){
        System.out.println("My name is Hubert, I am a " + this.name + " I have " + this.atk + " Attack, and " + this.health + " health!");
        System.out.println();
    }

    void showCharacterP2(){
        System.out.println("My name is Szymek, I am a " + this.name + " I have " + this.atk + " Attack, and " + this.health + " health! AND I AM YOUR OPPONENT!");
        System.out.println();
    }

    public int getHealth(){
        return this.health;
    }
    public int getAtk(){
        return this.atk;
    }
    public String getName(){
        return this.name;
    }
}
