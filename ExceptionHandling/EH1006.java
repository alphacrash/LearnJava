package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Try with Resource - 1.7
public class EH1006 {
    public static void main(String[] args) throws Exception {
        String str = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("String: " + str);
    }
}
