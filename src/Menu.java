import java.util.Scanner;
public class Menu {

    public static Character p1 = new Character("",0,0);
    public static Character p2 = new Character("",0,0);

    static void start(){


        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("WELCOME, CHOOSE CHARACTER OR EXIT THE GAME!");
            System.out.println("0. EXIT");
            System.out.println("1. Fighter");
            System.out.println("2. Archer");
            System.out.println("3. Wizard");

            int decision = scanner.nextInt();
            if (decision == 0) {
              System.exit(0);
            }
            if (decision == 1) {
                p1 = new Character("Fighter", 1, 30);
                break;
            }
            if (decision == 2) {
                p1 = new Character("Archer", 2, 25);
                break;
            }
            if (decision == 3) {
               p1 = new Character("Wizard", 3, 20);
                break;
            } else {
                System.out.println("ERROR");
                System.out.println();
            }
        }
        p1.showCharacterP1();
        System.out.println();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("CHOOSE YOUR FOE!");
            System.out.println("1. Fighter");
            System.out.println("2. Archer");
            System.out.println("3. Wizard");

            int decision2 = scanner.nextInt();
            if (decision2 == 1) {
                p2 = new Character("Fighter", 1, 30);
                break;
            }
            if (decision2 == 2) {
                p2 = new Character("Archer", 2, 25);
                break;
            }
            if (decision2 == 3) {
                p2 = new Character("Wizard", 3, 20);
                break;
            }
            else {
                System.out.println("ERROR");
                System.out.println();
            }
        }
        p2.showCharacterP2();
        Fight.brawl();
    }
}
