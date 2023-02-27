package ExceptionHandling;

public class EH1002 {
    public static void main(String[] args) {
        int a[] = new int[4];
        int i, j, k = 0;
        i = 8;
        j = 2;
        try {
            k = i / j;
            for (int c = 0; c <= 4; c++) {
                a[c]  = c + 1;
            }
            for (int value : a) {
                System.out.println("Value: " + value);
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divide by Zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Max num of values is 4");
        } catch (Exception e) {
            System.out.println("Unknown Exception");
        }
        System.out.println(k);
    }
}
