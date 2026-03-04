import java.util.Scanner;

public class Game {

    private boolean playGame = false;
    private int score = 0;
    private String rock;
    private String paper;
    private String scissors;

    public void run(User user) {
        System.out.println("Let's play Rock Paper and Scissors " + user.getName() + "!");
        while (playGame) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your rock or paper or scissors: ");
            String turn = input.nextLine();
        }

    }

}