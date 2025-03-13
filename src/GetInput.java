import java.util.Scanner;

public class GetInput {

    public static void start(){

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the accountant program\nWhat is your first request? Options include");
        Menu.startMenu();
        switch (in.nextInt()){

            case 1:
                System.out.println("Enter username:");
                String username = in.next();
                System.out.println("Enter Password:");
                String password = in.next();
                String account = Account.login(username, password);
                break;

            case 2:

        }
    }
}
