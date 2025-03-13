import java.io.BufferedReader;
import java.io.Reader;

public class Account {

    public static String login(String username, String password){

        if (username.equals("Argus6200") && password.equals("1234")){
            System.out.println("Logged in as " + username);
        }
        return username;
    }

    public static String[] viewPositions(String account){
        BufferedReader reader = new BufferedReader(account + "Positions.txt")

    }
}
