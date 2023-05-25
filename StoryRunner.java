import java.util.Scanner;

public class StoryRunner {
    public static void main(String[] args) {
        Story story = new Story();
        Scanner psc = new Scanner(System.in);
        boolean playagain = true;
        while (playagain) {

            boolean gameWon = story.play();
            if (!gameWon) {
                Story.clearScreen();
                System.out.println("You didn't make it to the the orphanage.");
                
            }
            else {
                System.out.println("You made it!");
            }

            System.out.println("Would you like to play again? (y/n)");
            String response = psc.nextLine().toLowerCase();
            
            if (response.equals("n")) {
                playagain = false;
            }

        
        }       
    }
}