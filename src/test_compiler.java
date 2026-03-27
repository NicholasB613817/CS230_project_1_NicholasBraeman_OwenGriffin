import java.io.IOException;
import java.text.ParseException;

public class test_compiler {
    private static char lookahead;

    public static void main(String[] args) throws IOException {
            lookahead = (char) System.in.read();
            try {
                expression();
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
    }

    private static void expression() throws ParseException {
        System.out.println("mov $" + getNum() + ", %eax");
    }

    private static char getNum() throws ParseException {
        if (!Character.isDigit(lookahead)) {
            throw new ParseException("integer expected");
        }
        return lookahead;
    }
    static class ParseException extends Exception {
        ParseException(String reason) {
            super(reason);
        }
    }
}
