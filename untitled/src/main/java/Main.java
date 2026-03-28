import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type your assembly code here!");
            Assembler.assembler(scan.nextLine());
            //Compiler.compiler(scan.nextLine());
            System.out.println("Type 'done' to exit the code or press enter twice to enter more.");
            String binary = scan.nextLine();
            if (binary.equals("done")) {
                break;
            } else  {
                Assembler.assembler(scan.nextLine());
            }
        }
    }
}
