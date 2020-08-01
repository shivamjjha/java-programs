/**
 * Program to demonstrate the concept of exception handling.
 */
public class ExceptionHandling {
    void throwException() throws Exception {
        throw new Exception("An old random exception ;)");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Trying exception handling");
            ExceptionHandling ex = new ExceptionHandling();
            ex.throwException();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("See, program continued, because we handled the exception well lol");
        }

    }
}