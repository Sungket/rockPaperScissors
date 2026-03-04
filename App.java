import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        User user = new User(name);
        System.out.println("Welcome " + user.getName() + "!");

        Game game = new Game();

        game.run(user);
    }
}