import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            //prompting the user to enter inputs
            Scanner scan = new Scanner(System.in);
            System.out.println("Type your assembly code here, or press enter to add numbers!");
            //allowing Main to grab functions from the Assembler and Compiler classes
            Assembler.assembler(scan.nextLine());
            Compiler.compiler();
            //creating a way for user to exit terminal
            System.out.println("Type 'done' to exit the code or press enter twice to enter more.");
            String binary = scan.nextLine();
            if (binary.equals("done")) {
                break;
            } else {
                Assembler.assembler(scan.nextLine());
                Compiler.compiler();
                break;
            }
        }
    }
}
