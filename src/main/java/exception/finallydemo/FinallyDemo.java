package exception.finallydemo;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}
