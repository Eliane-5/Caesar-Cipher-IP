import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean running = true;
        while (running){
        System.out.println("Enter a choice: encrypt, decrypt or exit. ");
        String choice = bufferedReader.readLine();
            if (choice.equals("encrypt")) {
                encrypt cypherEncrypt = new encrypt();
                System.out.println("Enter a text");
                String inputReader = bufferedReader.readLine();
                System.out.println("Enter a shift key");
                String keyString = bufferedReader.readLine();
                int keyInt = Integer.parseInt(keyString);
                System.out.println(cypherEncrypt.caesarEncrypt(inputReader, keyInt));
            } else if (choice.equals("decrypt")) {
                Decrypt cypherDecrypt = new Decrypt();
                System.out.println("Enter a text");
                String inputReader = bufferedReader.readLine();
                System.out.println("Enter a shift key");
                String keyString = bufferedReader.readLine();
                int keyInt = Integer.parseInt(keyString);
                System.out.println(cypherDecrypt.caesarDecrypt(inputReader, keyInt));
            } else if (choice.equals("exit")){
                running = false;
            }else {
                System.out.println("unrecognized choice entry");
            }
        }
    }
}
