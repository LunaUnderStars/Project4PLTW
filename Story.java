import java.util.Scanner;

public class Story {
    private int encounters;
    private double talibanChance;
    private Scanner sc = new Scanner(System.in);

    public boolean play() {
        clearScreen();
        System.out.println("You are Laila, and you wish to visit your Aziza at the orphanage.");
        System.out.println("Unfortunately, Rasheed refuses to accompany you on your way. You take it upon yourself to travel there alone.");
        System.out.println();
        System.out.println("(Press enter to continue)");
        sc.nextLine();
        clearScreen();
        String path = choosePath();
        System.out.printf("%nHaving chosen the %s route, you begin your walk.", path);
        System.out.println();
        System.out.println("(Press enter to continue)");
        sc.nextLine();

        for (int i = encounters; i > 0; i--) {
            //run encounter. if failed (false), end story
            boolean result = encounter();
            if (!result) {

                System.out.println("\"Likely story\" the man hisses out, eyeing you suspiciously.\nHe delivers a swift kick to your shin, leaving it aching\n\n\"Get back home. I better not see you out again, or else.\"");
                System.out.println("(Press enter to continue)");
                sc.nextLine();
                clearScreen();
                return false;
            }
         
            
            
            clearScreen();
            System.out.println("You continue your walk.");
        }


        return true;
    }


    private String choosePath() {
        System.out.println("You must decide which path you will take to reach the orphanage.");
        System.out.println("You weigh your options:");
        System.out.println("If you choose to take the direct path there, you will arrive much quicker, but you are much more likely to enounter the Taliban.");
        System.out.println("Alternatively, you could take the long indrect route. While you will be much less liekly to encounter any Taliban, you will be out for longer.");
        System.out.println();
        System.out.println("(type either 'direct' or 'indirect' and press enter)");
        String response = sc.nextLine().toLowerCase();
        if (response.equals("direct")) {
            encounters = 4;
            talibanChance = 0.7;
            return response;
        }
        else if (response.equals("indirect")) {
            encounters = 10;
            talibanChance = 0.3;
            return response;
        }
        else {
            clearScreen();
            System.out.println("Please enter a valid input! Try again:\n\n");
            return choosePath();
        }
    }


    private boolean encounter() {
        if (Math.random() < talibanChance) {
             return tEncounter();
        }
        else {
            Civilian civilian = personGenerator.createCivlian();
            System.out.println(civilian);
            System.out.println("(Press enter to continue)");
            sc.nextLine();
            clearScreen();
            return true;
        }
    }

    private boolean tEncounter() {
        Taliban talib = personGenerator.createTaliban();
        System.out.printf("%s As he approaches you, you realize that he is a Talib.%n", talib);
        System.out.printf("\"%s\"\n\nHow do you answer?\n\n(a) %s\n\n(b) %s\n", talib.getQuestion(), talib.getRightAnswer(), talib.getWrongAnswer());
        String answer = sc.nextLine().toLowerCase();
        if (answer.equals("b")) {
            return false;
        }
        clearScreen();
        System.out.println("He seems satisfied enough with your answer. \n\n\"This is a warning.\"\n\nThe Talib glares at you\n \n\"Get going.\"\nYou hurry off before he can change his mind.");
        System.out.println("(Press enter to continue)");
        sc.nextLine();
        clearScreen();
        return true;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
