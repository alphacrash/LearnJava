package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EH1004 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, k = 0;

        i = 8;
        try {
            System.out.print("Enter a number: ");
            j = Integer.parseInt(br.readLine());
            k = i / j;
            System.out.println("Output: " + k);
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (Exception e) {
            System.out.println("Unknown exception");
        } finally {
            System.out.println("BYE");
        }


    }
}
