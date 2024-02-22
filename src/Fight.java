import java.util.Random;

public class Fight {

    public static Character p1 = Menu.p1;
    public static Character p2 = Menu.p2;
    static String nameP1 = p1.getName();
    static String nameP2 = p2.getName();
    static int healthP1 = p1.getHealth();
    static int healthP2 = p2.getHealth();
    static int atkP1 = p1.getAtk();
    static int atkP2 = p2.getAtk();

    public static void brawl(){
    System.out.println("THE FIGHT IS ON!");
    System.out.println();
    while(true){
        Random random = new Random();
        int rollResult= DiceRoller.roll(random, 0);
        System.out.println(nameP1 + " Hubert rolled the dice: " + rollResult);
        System.out.println(nameP1 + " Hubert is attacking " + nameP2 + " Szymek for " + atkP1 + " base DMG + " + rollResult  + " dice DMG");
        healthP2 = healthP2 - (atkP1 + rollResult);
        System.out.println("Hubert health: " + healthP1);
        System.out.println("Szymek health: " + healthP2);
        System.out.println();
        if(healthP2 <= 0)
        {
            System.out.println("Awesome " + nameP1 + " Hubert won the fight!");
            System.out.println();
            Menu.start();
        }
            Random random2 = new Random();
            int rollResult2= DiceRoller.roll(random2, 0);
            System.out.println(nameP2 + " Szymek rolled the dice: " + rollResult2);
            System.out.println(nameP2 + " Szymek is attacking " + nameP1 + " Hubert for " + atkP2 + " base DMG + " + rollResult2  + " dice DMG");
            healthP1 = healthP1 - (atkP2 + rollResult);
            System.out.println("Hubert health: " + healthP1);
            System.out.println("Szymek health: " + healthP2);
            System.out.println();
            if(healthP1 <= 0)
            {
                System.out.println("YOU DIED! " + nameP2 + " Szymek won the fight!");
                System.out.println();
                Menu.start();
            }
        }
        }
    }

