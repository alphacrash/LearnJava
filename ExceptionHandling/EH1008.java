package ExceptionHandling;

public class EH1008 {
    public static void main(String[] args) {
        int i = 5;
        try {
            if (i < 10) {
                throw new MyException("Error");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}