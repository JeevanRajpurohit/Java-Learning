class JeevanCustomException extends java.lang.Exception {
    public JeevanCustomException(String str) {
        super(str);
    }
}

public class Exception {
    public static void main(String[] args) {
        int i = 0;
        try {
            if (i == 0) {
                // Throwing the custom exception
                throw new JeevanCustomException("I value was 0");
            }
            int j = 10 / i;
            System.out.println("Hi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bound Exception");
        } catch (JeevanCustomException e) {
            System.out.println("Message from jeevan exception: " + e.getMessage()); // This will print the exception message
        } catch (java.lang.Exception e) {
            System.out.println("Default: " + e);  // This will catch any other exception
        }
    }
}
