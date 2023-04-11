import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */

public final class Login{
    final String Username = "Mardianto";
    final String Password = "109";
    
    final void Login() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String InputUsername;
        String InputPassword;
        System.out.println("""
                            \n
                            =====================
                                    LOGIN       
                            =====================            
                            """);
        while (true) {
            System.out.print("Masukkan Username: ");
            InputUsername = br.readLine();
            System.out.print("Masukkan Password: ");
            InputPassword = br.readLine();
            if (InputUsername.equals(Username) && InputPassword.equals(Password)) {
                break;
            } else {
                System.out.println("Username atau Password anda salah.");
            }
        }
    }
}