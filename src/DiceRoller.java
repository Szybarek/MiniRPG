import java.util.Random;
public class DiceRoller {

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

     static int roll(Random random, int number){
        number = random.nextInt(6)+1;
        return number;
    }
}
