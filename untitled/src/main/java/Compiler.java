import java.util.Scanner;

public class Compiler {
    public static void compiler() {
        //scanner to grab user input
        Scanner input = new Scanner(System.in);

        //getting user's input
        System.out.println("Enter a number!");
        int input1 = input.nextInt();
        System.out.println("Enter a second number!");
        int input2 = input.nextInt();

        //adding both user inputs
        int result = input1 + input2;

        //format of assembly code
        System.out.println("LDWA     " + input1 + ", i"
                + "\nADDA     " + input2 + ", i" +
                "\nSTWA     result, d" +
                "\nSTOP" +
                "\nresult:     .WORD     0" +
                "\n.END");
        //adding the result for the user
        System.out.println("Result = " + result);
    }
}