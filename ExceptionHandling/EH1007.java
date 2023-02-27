package ExceptionHandling;

public class EH1007 {
    public static void main(String[] args) throws Exception {
        // Suppressing an exception
        int i, j, k = 0;
        try {
            if (k < 10) {
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
