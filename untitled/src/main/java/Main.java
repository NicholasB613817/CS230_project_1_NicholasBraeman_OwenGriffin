import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter in hex digits or hexadecimals on the line below to see their binary code!");
            Assembler.assembler(scan.nextLine());
            //Compiler.compiler(scan.nextLine());
            System.out.println("Type 'done' to exit the code.");
            String binary = scan.nextLine();
            if (binary.equals("done")) {
                break;
            }
        }
    }
}
