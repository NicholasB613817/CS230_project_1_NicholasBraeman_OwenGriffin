import java.util.Scanner;

public class test_main {
	public static void main(String[] args) {
        Scanner input_checker = new Scanner(System.in);
        System.out.println("Enter in binary number your would like: example 0000 for 0, enter in 'quit' to exit the programe ");

        while (true) {
            String input = input_checker.nextLine();
            if (input.equals("quit")) {
                break;
            }
        }

    }
}

