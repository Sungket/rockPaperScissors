public class App {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");

        User user = new User(name);
        System.out.println("Welcome " + user.getName + "!");


    }
}